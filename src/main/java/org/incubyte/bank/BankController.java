package org.incubyte.bank;

import io.micronaut.http.annotation.*;

@Controller("/bank")
public class BankController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}