package app.web;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DeepThoughtController {

  @RequestMapping("/")
  public String index() {
    BigDecimal result = app.DeepThought.sum(new BigDecimal("123456789012345678901234567932"),
        new BigDecimal("-123456789012345678901234567890"));
    return "Deep Thought says: " + result;
  }

}
