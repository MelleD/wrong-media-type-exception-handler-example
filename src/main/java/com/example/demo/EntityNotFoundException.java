package com.example.demo;

public class EntityNotFoundException extends RuntimeException {

   @Override
   public String getMessage() {
      return "Not found";
   }
}
