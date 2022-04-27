package org.incubyte.bank;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import org.incubyte.response.ResponseWrapper;

@Controller("/bank")
public class BankController {

  BankService bankService;

  public BankController(BankService bankService) {
    this.bankService = bankService;
  }

  @Get(uri = "/", produces = "text/html")
  public String index() {
    return bankService.welcome();
  }

  @Post
  public Branch save(@Body Branch branch){
    return bankService.save(branch);
  }

  @Get("/branches/{id}")
  public ResponseWrapper getById(Long id){
    return bankService.getById(id);
  }

}
