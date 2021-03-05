# jimoos-public 公开库

![Build Status](https://github.com/jimoos-cn/jimoos-public/workflows/Java%20CI%20with%20Maven/badge.svg)

## 项目构建

`mvn clean package -Dmaven.test.skip=true -s docker/settings.xml`

## 项目入口

- api-starter 客户端接口入口
- portal-starter 后台接口入口
- examples 模块（Addon）示例

## 项目模块列表

- `addons/@`下 为项目内插件
- `addons/depends`为外部插件，外部插件禁止修改。

### 模块列表

- `jm-ping` 用于是否应用是否正常运行检测。
- `jm-settings` key-val 的 数据库配置。
- `jm-utils` 工具类集合
