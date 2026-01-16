package nl.hakktastic.downstreamservice;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import tools.jackson.databind.JsonNode;

@HttpExchange
public interface UpStreamRestService {

  @GetExchange("/api/v1")
  JsonNode getV1();

  @GetExchange("/api/v2")
  JsonNode getV2();
}