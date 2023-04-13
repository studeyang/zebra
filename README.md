# 微服务分层脚手架

## 一、简介

Zebra 是使用 Spring Boot + MyBatis Plus 搭建的一个脚手架项目，使用 Swagger 提供文档生成的能力。

应用架构如下图所示：

![image-20230412155423229](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/image-20230412155423229.png)

## 二、快速开始

### 下载骨架包

使用 mvn 命令下载骨架包：

```shell
mvn dependency:get    \
  -DremoteRepositories=https://s01.oss.sonatype.org/content/groups/public/    \
  -DgroupId=io.github.studeyang    \
  -DartifactId=zebra-archetype    \
  -Dversion=1.0.0-SNAPSHOT
```

### 生成脚手架

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

## 三、其他文档

[zebra 维护说明](docs/zebra%20维护说明.md)



