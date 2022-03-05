package edu.miu.cs544.temesgen.config;

import edu.miu.cs544.temesgen.service.DbService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ProjectName: Profile
 * @Author: Temesgen D.
 * @Date: 3/4/22
 */

@Configuration
public class Config {

    @Bean("dbService")
    @Profile({"development", "default"})
    public DbService dbServiceDev() {
        DbService dbService = new DbService();
        dbService.setDbUrl("Dev url from single config file");
        return dbService;
    }

    @Bean("dbService")
    @Profile("production")
    public DbService dbServiceProd() {
        DbService dbService = new DbService();
        dbService.setDbUrl("Prod url from single config file");
        return dbService;
    }
}
