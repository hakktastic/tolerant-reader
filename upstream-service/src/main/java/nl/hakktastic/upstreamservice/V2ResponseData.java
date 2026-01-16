package nl.hakktastic.upstreamservice;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
public class V2ResponseData {

  private final CustomerInfo customerInfo;
  private final String dummyField1;
  private final String dummyField2;
}