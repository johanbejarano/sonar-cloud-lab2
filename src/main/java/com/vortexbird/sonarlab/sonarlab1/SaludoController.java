package com.vortexbird.sonarlab.sonarlab1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {
	
	private static final Logger log = LoggerFactory.getLogger(SaludoController.class);
	
	@GetMapping(value = "/saludar/{nombre}")
    public ResponseEntity<String> saludar(
    		@PathVariable("nombre") String nombre
    		) {
        try {
        	return ResponseEntity.ok().body("Hola "+ nombre);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.badRequest().body(null);
        }
    }
}
