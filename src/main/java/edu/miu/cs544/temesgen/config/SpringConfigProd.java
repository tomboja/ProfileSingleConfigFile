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
@Profile("production")
public class SpringConfigProd implements SpringConfigInterface{

    @Bean("dbServiceBean")
    public DbService dbService() {
        DbService dbService = new DbService();
        dbService.setDbUrl("production_db_url");

        return dbService;
    }
}
