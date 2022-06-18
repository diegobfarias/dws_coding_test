package com.coding_test.dws_diegobfarias.config;

import com.coding_test.dws_diegobfarias.entities.Band;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class RestTemplateIWS {

    public List<Band> getIwsData() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full";

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ParameterizedTypeReference<List<Band>> typeRef = new ParameterizedTypeReference<List<Band>>(){};
        List<Band> body = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, entity, typeRef).getBody();

        if (Objects.nonNull(body)) {
            return body;
        }

        return Collections.emptyList();
    }
}
