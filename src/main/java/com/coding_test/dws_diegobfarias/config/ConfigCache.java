package com.coding_test.dws_diegobfarias.config;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@RequiredArgsConstructor
@EnableScheduling
public class ConfigCache {

    private final CacheManager cacheManager;

    @Scheduled(fixedRate = 60000L)
    public void clearCache() {
        cacheManager.getCache("dataIWS").clear();
    }
}
