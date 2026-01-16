package nl.hakktastic.downstreamservice;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;

@Slf4j
@Service
public class TolerantCustomerReader {

  public static final String FIRST_NAME = "firstName";

  public static Optional<String> getFirstName(JsonNode node) {
    log.trace("searching for value of field='{}' in jsonNode='{}'", FIRST_NAME, node);
    return findFirst(node, FIRST_NAME);
  }

  private static Optional<String> findFirst(JsonNode node, String field) {

    if (node.has(field)) {
      final var fieldValue = node.get(field).stringValue();
      log.trace("found field='{}' with fieldValue='{}'", field, fieldValue);
      return Optional.of(fieldValue);
    }

    int counter = 1;
    for (JsonNode child : node) {

      log.trace("iteration='{}' childJsonNode='{}'", counter, child.toString());
      Optional<String> found = findFirst(child, field);

      if (found.isPresent()) {
        log.trace("iteration='{}' found field='{}' with fieldValue='{}'", counter, field, found.get());
        return found;
      }

      counter++;
    }

    return Optional.empty();
  }
}