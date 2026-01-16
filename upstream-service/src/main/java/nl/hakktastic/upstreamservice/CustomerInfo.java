package nl.hakktastic.upstreamservice;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
public class CustomerInfo {

  private final String firstName;
  private final String lastName;
  private final int age;
}