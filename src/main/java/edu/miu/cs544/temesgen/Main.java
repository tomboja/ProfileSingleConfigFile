package edu.miu.cs544.temesgen;

import edu.miu.cs544.temesgen.config.Config;
import edu.miu.cs544.temesgen.config.SpringConfigDev;
import edu.miu.cs544.temesgen.config.SpringConfigProd;
import edu.miu.cs544.temesgen.service.DbService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: Profile
 * @Author: Temesgen D.
 * @Date: 3/4/22
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting...");

//        AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext();
        AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(Config.class);


        /**
         * The main idea is not to set profile from inside the code.
         * Let it read from environment variable
         */
        //springContext.getEnvironment().setActiveProfiles("development");

//        springContext.scan("edu.miu.cs544.temesgen");
//        springContext.refresh();
        DbService dbService = (DbService) springContext.getBean("dbService");
        dbService.connect();

        System.out.println("Ending....");
    }
}
