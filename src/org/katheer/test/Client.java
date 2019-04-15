package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        c-namespace is used to reduce no of constructor-arg tags thus
            reducing the amount of XML code.
        We can use both c-namespace and constructor-arg with the help of index only.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");

        Student std1 = (Student) context.getBean("std1");
        std1.showStudentDetails();
        Student std2 = (Student) context.getBean("std2");
        std2.showStudentDetails();
        Student std3 = (Student) context.getBean("std3");
        std3.showStudentDetails();
    }
}
