package com.example.dojoProjekt.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.IOException;

@RestControllerAdvice
public class MyExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleNoHandlerFoundException(NoHandlerFoundException ex) {
        log.error("404 situation detected.", ex);
        return "Specified path not found on this server";
    }
}
//public class MyErrorHandler implements ResponseErrorHandler {
//    @Override
//    public void handleError(ClientHttpResponse response) throws IOException {
//        // your error handling here
//    }
//
//    @Override
//    public boolean hasError(ClientHttpResponse response) throws IOException {
//
//    }
//
//
//    public static void main(String args[]) {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.setErrorHandler(new MyErrorHandler());
//    }
//}