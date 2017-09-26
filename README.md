# dubbo-parent
dubbo 编写provider、consumer  集成zookeeper 

download dubbo-admin.war 或者 从alibab的git上down代码maven install

dubbo-admin.war 启动后 解压 将 dubbo.properties的 zk地址 指向自己的地址 列如 127.0.0.1:2181

download zookeeper 

项目为maven多模块项目 

dubbo-parent 
   -- dubbo-server
      --dubbo-server-api
      --dubbo-server-provider(生产者)
   -- dubbo-web （消费者）

建议 dubbo provider 采用 jar 启动的方式 降低服务器压力 dubbo-main 




