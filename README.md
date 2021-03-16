## freetsdb-skywalking-agent-demo

```
 本项目用于 skywalking 测试, 下载本项目后, 将  sky/agent/config/agent.config 配置文件内的
 
 collector.backend_service=${SW_AGENT_COLLECTOR_BACKEND_SERVICES:172.16.26.142:11800}
 plugin.toolkit.log.grpc.reporter.server_host=${SW_GRPC_LOG_SERVER_HOST:172.16.26.142}
 plugin.toolkit.log.grpc.reporter.server_port=${SW_GRPC_LOG_SERVER_PORT:11800}
 *ip* 和*端口* 改成你自己相应的 Skywalking 服务的地址, 
 
 然后进入 sky 文件夹, 启动 ./start.sh
 用浏览器访问  http://127.0.0.1:8080 即可产生链路和日志上报, 如果想尝试POST/ PUT 的请求, 用postman 
 请求即可
```