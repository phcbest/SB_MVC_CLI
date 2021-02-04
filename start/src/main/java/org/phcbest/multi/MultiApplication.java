package org.phcbest.multi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @Author: PengHaiChen
 * @Description: 需要配置包的扫描位置，不然扫不到dao和mapper
 * @Date: Create in 09:45 2021/2/3
 */
@SpringBootApplication
@MapperScan("org.phcbest.multi.dao")// TODO: 2021/2/4 需要从程序入口配置映射器扫描
public class MultiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiApplication.class);
    }
}
