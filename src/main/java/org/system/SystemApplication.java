package org.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.system.model.User;
import org.system.services.UserService;

//@SpringBootApplication
//public class SocialApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SocialApplication.class, args);
//	}
//
//}

@SpringBootApplication
public class SystemApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		User newAdmin = new User("admin@mail.com", "Admin", "admin");
		userService.createAdmin(newAdmin);
	}
}