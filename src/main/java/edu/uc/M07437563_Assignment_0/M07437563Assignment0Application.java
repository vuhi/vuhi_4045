package edu.uc.M07437563_Assignment_0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M07437563Assignment0Application {

	public static void main(String[] args) {
		// I was setup project with hot reload but somehow it keep throwing SilentExitException()
		// I found this stackoverflow discuss this is a bug with spring-boot-devtools module
		// https://stackoverflow.com/questions/32770884/breakpoint-at-throw-new-silentexitexception-in-eclipse-spring-boot
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(M07437563Assignment0Application.class, args);
	}
}
