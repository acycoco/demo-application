package com.example.demo;

import com.example.demo.yes.very.deep.pack.DeepComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//http://localhost:8080/home -> 주소를 주소창에 입력했을 때
//우리가 만든 HTML이 보이게 해보자.

//@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan
//@ComponentScan(basePackages = "com.example.demo")
//@ComponentScan(basePackages = "com.example.demo.yes")
@ComponentScan(basePackageClasses = DeepComponent.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//현재 실행중인 IoC Container를 반환함
		//그리고 IoC Container는 클래스를 객체로 만들어서 내부에 관리한다.
		ApplicationContext applicationContext =
				SpringApplication.run(DemoApplication.class, args);

		 //그 Container가 어떤 Bean 객체를 가지고 있는지 확인해보자
		for (String beanName: applicationContext.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
	}


}
