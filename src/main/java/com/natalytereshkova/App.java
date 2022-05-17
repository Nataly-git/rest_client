package com.natalytereshkova;


import com.natalytereshkova.configuration.MyConfig;
import com.natalytereshkova.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee employee = communication.getEmployee(1);
        System.out.println(employee);

        Employee emp = new Employee("Sveta", "Sokolova", "HR", 500);
        communication.saveEmployee(emp);

        Employee emp2 = new Employee("Sveta", "Sokolova", "IT", 1200);
        emp2.setId(14);
        communication.saveEmployee(emp2);

        communication.deleteEmployee(13);
    }
import com.natalytereshkova.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


}
