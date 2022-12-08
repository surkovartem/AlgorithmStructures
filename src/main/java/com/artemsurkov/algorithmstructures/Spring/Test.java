package com.artemsurkov.algorithmstructures.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Student student = context.getBean("student", Student.class);
    System.out.println(student.getName() + " " + student.getSecondName());
    context.close();
  }
}
