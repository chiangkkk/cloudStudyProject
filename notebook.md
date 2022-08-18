# 记录springClould导包出现的问题
在pom中添加
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-dependencies</artifactId>
    <version>2021.0.3</version>
</dependency>
```
maven管理工具一直报错 找不到artifactId

解决方案
依赖该为
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-dependencies</artifactId>
    <version>2021.0.1</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```
复习下scope
<br>
`scope定义了类包在项目的使用阶段。项目阶段包括： 编译，运行，测试和发布。
`
- compile
默认scope为compile，表示为当前依赖参与项目的编译、测试和运行阶段，属于强依赖。打包之时，会达到包里去。

- test
该依赖仅仅参与测试相关的内容，包括测试用例的编译和执行，比如定性的Junit。

- runtime
依赖仅参与运行周期中的使用。一般这种类库都是接口与实现相分离的类库，比如JDBC类库，在编译之时仅依赖相关的接口，在具体的运行之时，才需要具体的mysql、oracle等等数据的驱动程序。
此类的驱动都是为runtime的类库。

- provided
该依赖在打包过程中，不需要打进去，这个由运行的环境来提供，比如tomcat或者基础类库等等，事实上，该依赖可以参与编译、测试和运行等周期，与compile等同。区别在于打包阶段进行了exclude操作。

- system
使用上与provided相同，不同之处在于该依赖不从maven仓库中提取，而是从本地文件系统中提取，其会参照systemPath的属性进行提取依赖。

- import
这个是maven2.0.9版本后出的属性，import只能在dependencyManagement的中使用，能解决maven单继承问题，import依赖关系实际上并不参与限制依赖关系的传递性。


# 记录springClould依赖的问题

子包，eureka-server 的依赖父包一直找不到，需要在父项目中的dependencys外加一层`dependencyManagement`

**dependencyManagement使用简介**
Maven中的dependencyManagement元素提供了一种管理依赖版本号的方式。
在dependencyManagement元素中声明所依赖的jar包的版本号等信息，那么所有子项目再次引入此依赖jar包时则无需显式的列出版本号。
Maven会沿着父子层级向上寻找拥有dependencyManagement 元素的项目，然后使用它指定的版本号。

**使用优点**

如果有多个子项目都引用同一样依赖，则可以避免在每个使用的子项目里都声明一个版本号。当想升级或切换到另一个版本时，只需要在顶层父容器里更新，而不需要逐个修改子项目；另外如果某个子项目需要另外的一个版本，只需要声明version即可。

**注意事项**

dependencyManagement中定义的只是依赖的声明，并不实现引入，因此子项目需要显式的声明需要用的依赖。
