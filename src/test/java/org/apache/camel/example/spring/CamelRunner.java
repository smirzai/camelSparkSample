package org.apache.camel.example.spring;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelRunner {
	 public static final void main(String[] args) throws Exception {
		  System.out.println("start");
		  ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/camel-context.xml"}); 
		   
		  Thread.sleep(20);
		  CamelContext camelContext = (CamelContext) context.getBean("camel");
		  camelContext.stop();



	 }

}
