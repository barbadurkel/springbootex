package com.example.springbootwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		Runnable runnable = () -> System.out.println("I am Running "+ Thread.currentThread().getName());

		Thread t = new Thread(runnable);
		// t.setName("My Thread");
		// t.run() will run the task in the current thread (main) instead of the thread we just created
		t.start();

		// t.join() : the code residing after this method will be executed after thread completion
		// t.interrupt() to terminate a Thread never use .stop() !!


	}



}
