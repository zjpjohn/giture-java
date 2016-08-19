
## 🌲 一个node.js和java实现前后分离的---java端RESTFULL风格项目实例
- 使用jerseyAPI+Spring控制事物 后期打算加入shiro
- 什么是giture/项目架构
```
giture 是我打算搭建的一个多人博客、论坛github风格系统,思量了很久最终使用了这套架构:
前端:node.js        利用node.js的轻量级、异步等特点,用来实现view+controller层的处理,不处理业务数据。
后台:java           利用jersey框架生成最"正统"的RESTFULL接口,负责MODEL数据的处理。具体的会在java项目上说
服务器:nginx        常用的代理服务器,主要用来正向代理转发路由,免去了跨域请求的麻烦。
缓 存:Redis         后期会增加缓存机制
日志库:MongoDB      日志数据量可能较大,因为node和mongod是绝配所以还是mongod了
python:爬虫+自动化   python语言运用不太熟练,再有实在服务器上运行的,以后会写
```
