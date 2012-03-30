package org.cse.springtute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

    public static void main(String[] args) {
        StudentManagementSystem sms;// = new StudentManagementSystem();
        //load the bean from spring        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        sms = (StudentManagementSystem) context.getBean("sms");
        sms.listAllStudents();
        sms.registerStudent((Student) context.getBean("stu"));
        sms.listAllStudents();

    }
}
