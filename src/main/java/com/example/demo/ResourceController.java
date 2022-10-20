package com.example.demo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

   @GetMapping( value = "/{id}", produces = { "application/json", "application/octet-stream" } )
   public ResponseEntity<Resource> download( @PathVariable final int id ) {
      if ( id % 2 == 0 ) {
         throw new EntityNotFoundException();
      }
      return ResponseEntity.ok( new ClassPathResource( "application.properties" ) );
   }

}