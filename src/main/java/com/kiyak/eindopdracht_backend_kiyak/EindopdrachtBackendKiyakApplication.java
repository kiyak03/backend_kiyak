package com.kiyak.eindopdracht_backend_kiyak;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EindopdrachtBackendKiyakApplication {

	public static void main(String[] args) {
		SpringApplication.run(EindopdrachtBackendKiyakApplication.class, args);
	}

}
