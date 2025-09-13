package com.angelroquel.VentaAuto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VentaAutoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VentaAutoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Api Funcional");
    }
}
