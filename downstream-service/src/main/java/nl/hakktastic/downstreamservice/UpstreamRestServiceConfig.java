package nl.hakktastic.downstreamservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.support.RestClientHttpServiceGroupConfigurer;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(types = {UpStreamRestService.class})
public class UpstreamRestServiceConfig {

  @Bean
  RestClientHttpServiceGroupConfigurer apiConfigurer() {
    return groups -> groups.forEachClient(
        (group, builder) -> builder.baseUrl("http://localhost:8080").build()
    );
  }
}