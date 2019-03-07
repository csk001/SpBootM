package com.csk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration
 *
 * @author mtw
 *
 */
//@MapperScan("com.csk.dao.mapper") 指定扫描路径，就不用单独加@mapper
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
