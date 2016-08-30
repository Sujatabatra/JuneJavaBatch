package com.comp.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sujata.demo.Performer;

public class MyMain {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("config.xml");
//		ApplicationContext springContainer=new FileSystemXmlApplicationContext("D:/myworkspace/Spring/MyPerformances/src/config.xml");
		Performer first=(Performer)springContainer.getBean("Dablu");
		first.perform();
		
		Performer second=(Performer)springContainer.getBean("Eshan");
		
		second.perform();
		

	}

}
