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

### **h2 datasource, h2database*: 
- one of the databases, writed by Java. Which is just a jar package,could cross-platform.Use h2.bat or h2.sh to start the service and then you can visit on the web page:  *http://IP:PORT/login.jsp*

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
- Multiple threads access to a method, the method change will effect other threads.
- Multiple join a object creation, for example the singleton. When judge if the instance has one or null, there also are some problems in these multiple threads.

### double-dispatch
- 分为三层：父类，子类，孙类
- 父类是个抽象类，会声明出所有 **子类** **孙类** 的抽象方法（实际上是重载，方法名一样，参数列表一定不一样，返回值可以一样也可以不一样。）
- 抽象父类的方法，子类必须强制重写。
- 每个子类要重写父类中声明属于自己的方法，以及自己子类（孙类层）的方法，也要强制重写其他子类及孙类的方法，有不同的逻辑和结果。
- **孙类的具体实现方法实际上也在子类层，孙类只起到一个声明作用或者说是调用入口**
- **should be used with caution**

### event-aggregator
- interesting program, use GOT to make a example.
- king's hand is the event aggregator.
- king's hand in charge of reporting event to the king.
- other lord,like baelish(little finger), varys(no cock), scout, they report to the king's hand.
- hence, three layers.
- Observer 是观察事件的，信息消费者，EventEmitter 是收集消息的，信息制造者。
- King是信息消费者，小指头和秃头是信息制造者，而国王之手既是信息制造者也是信息收集者，他将收集过来的信息报告给King。

> Event Aggregator is a good choice when you have lots of objects that are potential event sources. Rather than have the observer deal with registering with them all, you can centralize the registration logic to the Event Aggregator. As well as simplifying registration, a Event Aggregator also simplifies the memory management issues in using observers.
	