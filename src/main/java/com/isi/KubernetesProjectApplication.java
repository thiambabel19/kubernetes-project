package com.isi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesProjectApplication {

	@GetMapping("/message")
	public String displayMessage(){
		return "Deploiement effectue avec succes ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(KubernetesProjectApplication.class, args);
	}

}
