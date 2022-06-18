package com.coding_test.dws_diegobfarias.config;

import com.coding_test.dws_diegobfarias.entities.Band;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class RestTemplateIWS {
    @Bean
    public List<Band> getIwsData() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full";

        ResponseEntity<Band[]> response = restTemplate.getForEntity(fooResourceUrl, Band[].class);
        Band[] body = response.getBody();
        if (Objects.nonNull(body)) {
            return Arrays.stream(body).collect(Collectors.toList());
        }

        return Collections.emptyList();
    }
}
