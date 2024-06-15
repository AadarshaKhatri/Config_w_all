import models.*;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        //With Annotations

        try {
            String config_loc = "/resources/applicationContext.xml";
            ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
            Students std = (Students) context.getBean("students");
            std.display();
        }catch (Exception e){
            System.out.println(e);
        }



        //With XML Files

        try {
            String path = "/resources/applicationContext1.xml";
            ApplicationContext context_vec = new ClassPathXmlApplicationContext(path);
            Vechile obj_of_car = (Vechile) context_vec.getBean("car");
            Vechile obj_of_bike = (Vechile) context_vec.getBean("bike");
            obj_of_car.overall_display();
            System.out.println();
            obj_of_bike.overall_display();
        }catch (Exception e){
            System.out.println(e);
        }


        //With Java Files

        ApplicationContext context_phone = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        SmartPhone phone = (SmartPhone) context_phone.getBean("features");
        phone.output();


//With Annotations
        try {
            String path_con = "/resources/applicationContext3.xml";
            ApplicationContext context_shapes = new ClassPathXmlApplicationContext(path_con);
            Shapes sqr = (Shapes) context_shapes.getBean("shapes");
            sqr.pr();
        }catch (Exception e){
            System.out.println(e);
        }





        }
}