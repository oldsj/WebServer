package com.homeautomation.webserver;

import com.homeautomation.webserver.user.ApplicationUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * Description: Responsible for starting the Spring application
 */

@SpringBootApplication
public class WebserverApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(WebserverApplication.class, args);
	}

}
