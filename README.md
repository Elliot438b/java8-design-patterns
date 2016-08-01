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

### new technique point:
* Spring boot, quickly establish a web service.

### next task(~~next week 25/07~26/07.2016)~~:
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
- ~~They disturb me very much cause I haven't done a project with multiple thread 