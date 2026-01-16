package nl.hakktastic.upstreamservice;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
public class V1ResponseData {

  private final String firstName;
  private final String lastName;
  private final int age;

  private final String dummyField1;
  private final String dummyField2;
}