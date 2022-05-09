package com.oy.guli.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author OY
 * @Date 2021/2/22
 */
@EnableFeignClients
@EnableDiscoveryClient // nacos 注册
@SpringBootApplication
// With this annotation SpringBoot will scan @Component in imported projects(Maven for instance)
@ComponentScan(basePackages = {"com.oy.guli"})
public class TeacherApplication {
     public static void main(String[] args) {
           SpringApplication.run(TeacherApplication.class, args);
      }
}
