package nl.hakktastic.downstreamservice;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping(path = "v1/customers")
  public ResponseEntity<ApiResponse<String>> getFirstNameV1() {
    val message = "firstname of customer in v1";
    val data = customerService.getFirstNameFromV1().orElse(Strings.EMPTY);
    val apiResponse = ApiResponse.of(HttpStatus.OK.toString(), LocalDateTime.now(), message, data);

    return ResponseEntity.ok(apiResponse);
  }

  @GetMapping(path = "v2/customers")
  public ResponseEntity<ApiResponse<String>> getFirstNameV2() {
    val message = "firstname of customer v2";
    val data = customerService.getFirstNameFromV2().orElse(Strings.EMPTY);
    val apiResponse = ApiResponse.of(HttpStatus.OK.toString(), LocalDateTime.now(), message, data);

    return ResponseEntity.ok(apiResponse);
  }
}