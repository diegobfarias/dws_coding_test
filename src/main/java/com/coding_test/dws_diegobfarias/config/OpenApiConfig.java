package com.coding_test.dws_diegobfarias.config;


import com.coding_test.dws_diegobfarias.DwsDiegobfariasApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(tags = {
        @Tag(name = "/api/full")
})
public class OpenApiConfig extends DwsDiegobfariasApplication {
}

