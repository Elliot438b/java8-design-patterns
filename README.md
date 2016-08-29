# Java8-design-patterns
####study and learn [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns).
####one pattern per day.
####use java 8 new features.
####md text help: [markdown api](http://itmyhome.com/markdown/index.html).
##Notice:
* Check .gitignore before every commit, abandon the files such as .project .classpath,
* and the directory .settings,target
* and the .gitignore itself.
* All these rubbish above cannot be commit, check twice.

- **If careless done. according to below:**
- **skill:Remove directory from remote repository after adding them to .gitignore**
- **git rm -r --cached some-directory**
- git commit -m 'Remove the now ignored directory "some-directory"'
- git push origin master

***
###java 8 learning point task:
* Stream
* Lambda
* Optional

### @new technique point:
* Spring boot, quickly establish a web service.

### @next task(~~next week 25/07~26/07.2016)~~:
* aggregator-microservices, a mechanism which could control and dispatch the sub modules.
* Spring boot will be used at this part, let's do something different from SpringMVC.

### ~~api-gateway~~:
- *also a multiple module-parent project to learn this pattern.*
- **part of the aggregator project.**

### back to the single maven project.

### async-method-invocation:
- java enhance generic.
- multiple thread coding.
- wait();
- notifyAll();
- InterruptedException
- **They disturb me very much cause I haven't done a project with multiple thread**

### bridge pattern:
- Which is a magic pattern could resolve an old superclass, and make it diversity to super more child class with their specific feature to use.

### builder pattern:
- Which is so useful pattern, just like the StringBuilder. It could **construct diverse properties** freely.
- java enum: which could define the detail of property, just like a constant but it could fix the content.
- enum has two ways to define the constant generally: 
- 1. just define every constant.
- 2. every constant could have an inner properties(one or more), but you must define the properties with "private Type Constant;" and do construct to initial the constant's value;
- enum always need you to overwrite the toString function to return the value you want where you invoke this enum.

### caching
- double linked-list structure.
- mongoDB/virtualDB **install mongoDB on ubuntu.**
- caller -> cache(fix size/Capacity) -> DB(big container)

### *install and use mongoDB on ubuntu
- sudo apt-get install mongodb
- sudo su - root, vi /etc/mongodb.conf, port=27017.
- /etc/init.d/mongodb start**(force-reload/force-stop/restart/start/status/stop)**
- mongo
- show dbs,	use one of them, show collections, db.tname.find(), list all the data in this collection(table).
- more command usage, please refer to [distinguish between MySQL and MongoDB](http://www.lai18.com/content/422835.html)

### *reset the git local modify 
- Open the terminal, git checkout -f, refresh.

### callback pattern 
- Easy to use but really useful pattern!

### chain
- Generally,the leader should distribute responsibilities to the worker on every position.(use if to judge who do)
- But chain pattern is require the leader be a trouble maker and he don't care who do, and the worker on every position start throwing the job to others.(in the chain's order).
- Chain is more like a big automatic system.
- Duty is from leader to the worker themselves.
- Worker choose the job which he could do by himself.(what an ideal society we are eager to.)

### command
- Which's a strong pattern could undo(invoke) or redo the command in some target class.
- Wizard's **a command queue** to store the command invoked in an order.
- Wizard is an invoker and manager to execute some commands.
- Every command could **store one old executed property's value** that could be used when undo or redo.

### composite
- Which is an interesting pattern. It describes a be-of or an including structure.
- **part-whole hierarchies of objects**
- **there aren't any differences between the part objects and the individual objects in this pattern.**

### dao pattern
- not very familiar with the Dao we knew.
- Stream usage, could make a list be a stream, and use Stream's advance features.
- StreamSupport.stream: make a stream object.
- Spliterators.AbstractSpliterator：Creates a spliterator reporting the given estimated size and additionalCharacteristics.
- Optional, deal with the non-null object.
- isPresent(),to judge if the object is exsit or not.
- **Map,HashMap**'s new usage,like replace.	
- **jdbc** things.like datasource,connection,statement,how to execute Sql schema,resultSet.
- **log4j** xml configuration.
- h2 datasource, **h2database**: one of the databases, writed by Java. Which is just a jar package,could cross-platform.Use h2.bat or h2.sh to start the service and then you can visit on the web page:  *http://IP:PORT/login.jsp*

### decorate
- Which is a classic pattern and useful.
- main spirit: enhance a class without change the source code.
- the SmartHostile is the main class.

### *Class which implements another class also could be a child class. 
### *Inherit includes two mode: HAS-A, IS-A. 
### *Inherit is not only use keyword 'extends' but also 'implements'. 

### dependency-injection
- use [Google Guice framework](https://github.com/google/guice) to inject the object.
- @Inject above the constructor of the class.
- classModule to bind the super class and the implements class.

***

### * new knowledge: @FunctionalInterface
- 函数式接口
- 只能有一个方法，是专门用于Lambda实现的接口
- [functional interface 介绍](http://colobu.com/2014/10/28/secrets-of-java-8-functional-interface/)
- 除了该lambda（箭头）方法以外，还可以实现多个抽象方法，但必须是Object类的public方法。

```java
	@FunctionalInterface
	public interface ObjectMethodFunctionalInterface {
		void count(int i);
		String toString(); //same to Object.toString
		int hashCode(); //same to Object.hashCode
		boolean equals(Object obj); //same to Object.equals
	}
```

- 还可以有默认方法（**default**）和静态方法（**static**）
- example：

```java
	@FunctionalInterface
	public interface Printable {
		public void print();
	}
```

- lambda invoke

```java
	Printable job = ()-> out.println("Java SE 8 is working, " + "and Lambda Expresion too.");
	job.print();
```

### double-checked-locking
- 多个线程进入一个方法，方法中的逻辑会对变量进行改变，这个改变会影响到其他线程调用的执行结果，这时候就要上锁。
- 多个线程参与一个对象的建立，例如当你想建一个单例，多个线程共同检查是否是一个实例或者为空时，会有差错，这时候就要上锁。