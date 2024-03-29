package com.sportsConnection.springConfig;

import com.sportsConnection.service.PlayerService;
import com.sportsConnection.service.SportService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceSpringConfig {

    @Bean
    public SportService SportService() {
        return new SportService();
    }

    @Bean
    public PlayerService PlayerService() {
        return new PlayerService();
    }
}
