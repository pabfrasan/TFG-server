package us.tfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"us.tfg.controller.DatosController"})
public class TfgServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TfgServerApplication.class, args);
	}

}
