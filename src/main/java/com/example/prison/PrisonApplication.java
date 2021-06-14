package com.example.prison;

import com.example.prison.models.Prisonnier;
import com.example.prison.services.impl.PrisonnierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrisonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrisonApplication.class, args);

    }

}
