package nl.hakktastic.downstreamservice;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

  private final UpStreamRestService upStreamRestService;

  public Optional<String> getFirstNameFromV1() {
    val response = upStreamRestService.getV1();
    return TolerantCustomerReader.getFirstName(response);

  }

  public Optional<String> getFirstNameFromV2() {
    val response = upStreamRestService.getV2();
    return TolerantCustomerReader.getFirstName(response);
  }
}