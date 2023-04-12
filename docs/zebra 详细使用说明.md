# zebra 详细使用说明



## 一、下载骨架包

### 使用命令下载

使用 mvn 命令下载骨架包：

```shell
mvn dependency:get    \
  -DremoteRepositories=https://s01.oss.sonatype.org/content/groups/public/    \
  -DgroupId=io.github.studeyang    \
  -DartifactId=zebra-archetype    \
  -Dversion=1.0.0-SNAPSHOT
```

参数说明：

- remoteRepositories：骨架包仓库地址
- groupId：骨架包 groupId
- artifactId：骨架包 artifactId
- version：骨架包版本号

### 在 pom 文件中添加依赖

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



## 二、使用脚手架

### 使用命令（推荐）

使用 mvn 命令生成脚手架工程：

```shell
mvn archetype:generate    \
  -DarchetypeGroupId=io.github.studeyang    \
  -DarchetypeArtifactId=zebra-archetype    \
  -DarchetypeVersion=1.0.0-SNAPSHOT    \
  -DgroupId=com.cass.shipment    \
  -DartifactId=shipment    \
  -Dversion=1.0.0-SNAPSHOT    \
  -Dpackage=com.cass.shipment    \
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

### 在 IDEA 中使用

点击 Add Archetype

![image-20211028191354942](https://gitee.com/yanglu_u/ImgRepository/raw/master/image-20211028191354942.png)

点击 OK，骨架添加成功。

> 可以通过 UserArchetypes.xml 文件进行删除，文件位置：`~/.IntelliJIdea2019.3\system\Maven\Indices\UserArchetypes.xml`。

### 在 Eclipse 中使用

点击 Add Archetype

![image-20211028191958274](https://gitee.com/yanglu_u/ImgRepository/raw/master/image-20211028191958274.png)


