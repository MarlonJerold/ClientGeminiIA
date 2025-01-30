package com.client.gemini.botbluesky;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class Config {

    @Bean
    public BotBluesky botBluesky() {
        return new BotBluesky();
    }

}
