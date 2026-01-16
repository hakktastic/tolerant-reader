package nl.hakktastic.upstreamservice;

import java.time.LocalDateTime;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class V1Controller {

  @GetMapping
  public ResponseEntity<ApiResponse<V1ResponseData>> getDemoInfo() {

    val data = V1ResponseData.of("hakk", "tastic", 25, "dummy1", "dummy2");
    val message = "Api/v1 Response with V1 Response Data";
    val apiResponse = ApiResponse.of(HttpStatus.OK.toString(), LocalDateTime.now(), message, data);
    return ResponseEntity.ok(apiResponse);
  }
}