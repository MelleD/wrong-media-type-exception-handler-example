package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResponseExceptionHandler {

   @ExceptionHandler( EntityNotFoundException.class )
   public ResponseEntity<ErrorResponse> handleEntityNotFoundException( final HttpServletRequest request,
         final EntityNotFoundException e ) {
      return notFound( e );
   }

   protected ResponseEntity<ErrorResponse> notFound(
         final Throwable e ) {
      return new ResponseEntity<>( new ErrorResponse().error( e.getMessage() ), HttpStatus.NOT_FOUND );
   }
}
