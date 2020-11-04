package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.services", "com.example"})
//chiar daca sunt bean-uri in alte parti, @ComponentScan le gaseste si le foloseste /from base down
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);


		System.out.println("-----------------default profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController") ;
		System.out.println(i18nController.sayHello());


		MyController myController= (MyController) ctx.getBean("myController");

		System.out.println("-----primary bean");
		System.out.println(myController.Hello());


		System.out.println("-------------------Property");

		Proper4tInjectedConroller proper4tInjectedConroller = (Proper4tInjectedConroller) ctx.getBean("proper4tInjectedConroller");

		System.out.println(proper4tInjectedConroller.getGreeting());

		System.out.println("-------------------Setter");


		SetterInjectedController setterInjectedController = ( SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------------------Constructor");



		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
