package br.com.cya.cache_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheTestApplication.class, args);
	}

}
