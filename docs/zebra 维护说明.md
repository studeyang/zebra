# zebra 维护说明



## 一、工程结构说明

```
zebra
 |--zebra-service    业务服务模块
     |--application    服务编排层
     |--restful    Restful API实现层
     |--infrastructure    基础设施层
     |--service    业务逻辑层
 |--zebra-spi    外部交互模块
     |--api    Restful api接口层
     |--events    事件定义层
     |--dto    数据传输对象层
     |--request    接口请求对象层
 |--archetype   生成 maven archetype 骨架工程
```

### spi 模块

`zebra-spi`模块主要的职责是跟外部的交互。包括四层：外部交互声明的接口（HTTP）、DTO 对象 、 请求参数 Request、内部事件和外部事件定义。

### service 模块

`zebra-service`模块处理服务的所有功能。包括四层：Restful API 实现层、服务编排层、业务逻辑层、基础设施层。

### archetype 目录

生成 maven archetype 骨架工程。



## 二、生成 Maven Archetype

### 第一步：修改骨架模板

根据项目生成骨架模板，修改项目代码，在项目目录执行：`mvn archetype:create-from-project`

### 第二步：脚手架打包

切换至 `{projectRoot}/target/generated-sources/archetype` 目录，将变更的内容同步至 `{projectRoot}/archetype` 。

> 注意：`{projectRoot}/target/generated-sources/archetype` 生成了很多无关文件，这些文件不需要同步，还有文件中生成了错误的内容，需要手动纠正。

然后在 `{projectRoot}/archetype` 目录下执行：`mvn clean install`

### 第三步：查看仓库

查看仓库目录下`io/github/studeyang/zebra-archetype/{version}`是否生成`maven-metadata-local.xml`

### 第四步：archetype:crawl

> 这一步貌似可执行，也可不执行。

在项目目录下执行：`mvn archetype:crawl`

### 第五步：上传骨架包

在`{projectRoot}/archetype`目录下执行：`mvn deploy`



## 三、工程同步

根据骨架模板同步修改 zebra-service、zebra-spi 工程代码。



## 参考资料

- https://blog.csdn.net/qq_37345604/article/details/100581940
- https://www.cnblogs.com/xzhuo0827/p/12582154.html