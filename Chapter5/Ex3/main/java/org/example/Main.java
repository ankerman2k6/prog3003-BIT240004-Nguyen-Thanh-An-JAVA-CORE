package org.example;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        session.beginTransaction();
        session.persist(new Product("LapTop", 1500.0));
        session.getTransaction().commit();
        System.out.println("Đã lưu sản phẩm thành công vào CSDL!");
    }


}