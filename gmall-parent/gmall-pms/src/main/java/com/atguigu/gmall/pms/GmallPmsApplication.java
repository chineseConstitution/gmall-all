package com.atguigu.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、将逆向工程的东西，先复制mapper进来。
 * 2、给当前项目中手动创建一个service包，再把impl包下的所有复制进来
 * <p>
 * * 1、配置整合dubbo
 * * 2、配置整合MyBatisPlus
 * *
 * * logstash整合，
 * * 1）、导jar
 * * 2）、导日志配置
 * * 3）、在kibana里面建立好日志的索引，就可以可视化检索
 */
@EnableDubbo
@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
