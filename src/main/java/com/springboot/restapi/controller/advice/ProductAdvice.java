package com.springboot.restapi.controller.advice;

import com.springboot.restapi.dto.MessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by gracegao on 1/26/17.
 */
@RestControllerAdvice
public class ProductAdvice {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MessageDTO processNullPointerException(NullPointerException exception) {

        MessageDTO message = new MessageDTO();
        message.setMessage("Errors found in request, try again later");
        message.setType("ERROR");
        return message;
    }
}