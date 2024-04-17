package org.example.controller;

import org.example.exception.ItemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

 /**
  *ItemNotFoundException kezelés
  * Ha egy ItemNotFoundException kivétel keletkezik, akkor a megfelelő választ küldi a kliensnek,
  * a HTTP státuszkódot és üzenetet beállítva a válasznak.
 */
 @RestControllerAdvice

    public class ExceptionHandlerController {
        @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Item not found")
        @ExceptionHandler(ItemNotFoundException.class)
        public void itemNotFoundExceptionHandler(){

        }
}
