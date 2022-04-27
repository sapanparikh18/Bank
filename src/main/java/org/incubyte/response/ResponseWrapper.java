package org.incubyte.response;

public class ResponseWrapper <T>{
    T body;
    String message;

    public ResponseWrapper(T body, String message) {
        this.body = body;
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public String getMessage() {
        return message;
    }
}
