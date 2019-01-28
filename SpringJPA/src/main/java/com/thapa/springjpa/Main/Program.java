package com.thapa.springjpa.Main;

import com.thapa.springjpa.configuration.AppConfig;
import com.thapa.springjpa.configuration.JpaConfiguration;
import com.thapa.springjpa.entity.Employee;
import javafx.application.Application;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
        EntityManager em = emf.createEntityManager();

        Employee employee = new Employee();
        employee.setId(18);
        employee.setName("sita");
        employee.setAddress("Balaju");


         em.getTransaction().begin();
         try{
             em.merge(employee);
         }catch (PersistenceException ex){
             System.out.println(ex);
         }
         finally {
             em.getTransaction().commit();
             em.close();
             emf.close();
         }

    }
}
