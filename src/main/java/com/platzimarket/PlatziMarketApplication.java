package com.platzimarket;

import org.springframework.boot.SpringApplication;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude= DataSourceAutoConfiguration.class)
=======
import org.springframework.boot.autoconfigure.SpringBootApplication;

>>>>>>> 20995954c86de208fa6b0b0af3bbdb40b5fcbf5e
@SpringBootApplication
public class PlatziMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
