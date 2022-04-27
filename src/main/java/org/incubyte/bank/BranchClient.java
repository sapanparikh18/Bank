package org.incubyte.bank;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Client("branch")
public interface BranchClient {

    @Get("/")
    public HttpStatus index();
}