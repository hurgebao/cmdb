package com.cmdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cmdb.web.mapper")
public class MyBatisConfig {

}
