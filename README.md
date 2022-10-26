# 01 | 简介

Zebra 是使用 Spring Boot + MyBatis Plus 搭建的一个脚手架项目，使用 Swagger 提供文档生成的能力。

# 02 | 如何使用

### 下载骨架包

使用 mvn 命令下载骨架包：

```shell
mvn dependency:get    \
  -DremoteRepositories=http://dev.dbses.com/nexus/content/groups/public/    \
  -DgroupId=com.dbses.open    \
  -DartifactId=zebra-archetype    \
  -Dversion=最新版本
```

参数说明：

- remoteRepositories：骨架包仓库地址
- groupId：骨架包 groupId
- artifactId：骨架包 artifactId
- version：骨架包版本号

或者在任一项目 pom 文件中添加依赖：

```xml
<dependency>
  <groupId>com.dbses.open</groupId>
  <artifactId>zebra-archetype</artifactId>
  <version>最新版本</version>
</dependency>
```

下载完毕后删除依赖。

### 注意事项

下载下来的骨架包中包含 _remote.repositories 文件，通过方式一下载的该文件如下：

```text
#NOTE: This is an Aether internal implementation file, its format can be changed without prior notice.
#Fri Nov 20 10:23:18 CST 2020
zebra-archetype-0.0.3.pom>temp=
zebra-archetype-0.0.3.jar>temp=
```

注意把 "temp" 去掉，否则会影响生成脚手架工程。即改为：

```text
zebra-archetype-0.0.3.pom>=
zebra-archetype-0.0.3.jar>=
```

或者直接删除 _remote.repositories 文件。

# 03 | 生成脚手架

### 命令生成（推荐）

使用 mvn 命令生成脚手架工程：

```shell
mvn archetype:generate    \
  -DarchetypeGroupId=com.dbses.open    \
  -DarchetypeArtifactId=zebra-archetype    \
  -DarchetypeVersion=最新版本    \
  -DgroupId=com.dbses.cloud    \
  -DartifactId=shipment    \
  -Dversion=1.0-SNAPSHOT    \
  -Dpackage=com.dbses.cloud.shipment    \
  -DinteractiveMode=false
```

参数说明：

- archetypeGroupId：骨架包 groupId
- archetypeArtifactId：骨架包 artifactId
- archetypeVersion：骨架包版本号
- groupId：生成工程的 groupId
- artifactId：生成工程的 artifactId
- version：生成工程的版本号
- package：生成工程的包名（可选，默认跟 groupId 一样）
- interactiveMode：交互模式

您只需配置 groupId、artifactId、version、package 即可。

### IDEA 界面生成

点击 Add Archetype

![image-20211028191354942](https://gitee.com/yanglu_u/ImgRepository/raw/master/image-20211028191354942.png)

点击 OK，骨架添加成功。

> 可以通过 UserArchetypes.xml 文件进行删除，文件位置：`~/.IntelliJIdea2019.3\system\Maven\Indices\UserArchetypes.xml`。

### Eclipse 界面生成

点击 Add Archetype

![image-20211028191958274](https://gitee.com/yanglu_u/ImgRepository/raw/master/image-20211028191958274.png)

# 04 | 工程维护

[zebra 维护说明](docs/zebra%20维护说明.md)



