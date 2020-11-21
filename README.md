<!-- the line below needs to be an empty line C: (its because kramdown isnt
     that smart and dearly wants an empty line before a heading to be able to
     display it as such, e.g. website) -->

# Design patterns implemented in Java

![Java CI with Maven](https://github.com/iluwatar/java-design-patterns/workflows/Java%20CI%20with%20Maven/badge.svg)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/LICENSE.md)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=iluwatar_java-design-patterns&metric=ncloc)](https://sonarcloud.io/dashboard?id=iluwatar_java-design-patterns) 
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=iluwatar_java-design-patterns&metric=coverage)](https://sonarcloud.io/dashboard?id=iluwatar_java-design-patterns)
[![Join the chat at https://gitter.im/iluwatar/java-design-patterns](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/iluwatar/java-design-patterns?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-137-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

## 1.adapter 适配器
又被称为包装器

### 目的
将一个接口转换成另一个我们所需要的接口.
就像现实中的电源适配器, usb接口转换头.

### 使用方法
对于已经存在的方法和对象, 通常不采用继承的方式, 而采用持有该对象的方式, 增加灵活性, 扩展性.


## 2.builder 建造者模式
通常用于 拆分复杂的构造器, 当构造器所需要的参数过长时, 建造者模式可以优化其创建的过程, 增加可读性

### 目的
将复杂对象的构造, 和表示分开, 以便同一构造过程, 可以创建不同的表示.

### Java世界例子
* java.lang.StringBuilder


## 3.chain 责任链模式

### 适用性
* 有多个对象需要处理, 按照一定顺序的优先级, 处理器自动判断处理;
* 处理的对象集合, 应该被动态指定;
* 对多个对象发出请求, 而无需指定接收者;

### Java中的例子
* java.util.logging.Logger#log()
* javax.servlet.Filter#doFilter()

### 讲解的外链
https://cloud.tencent.com/developer/article/1385914


## 4.decorator 装饰者模式(包装者模式)

