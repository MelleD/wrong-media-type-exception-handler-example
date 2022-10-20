package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {

   @JsonProperty( "error" )
   private String error;

   public ErrorResponse error( final String error ) {
      this.error = error;
      return this;
   }

   /**
    * Get error
    * @return error
    */
   public String getError() {
      return error;
   }

   public void setError( final String error ) {
      this.error = error;
   }

}

