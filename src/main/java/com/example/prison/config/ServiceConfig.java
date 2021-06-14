package com.example.prison.config;

import com.example.prison.repositories.CelluleRepository;
import com.example.prison.repositories.CrimeRepository;
import com.example.prison.repositories.DangerRepository;
import com.example.prison.repositories.PrisonnierRepository;
import com.example.prison.services.impl.CelluleServiceImpl;
import com.example.prison.services.impl.CrimeServiceImpl;
import com.example.prison.services.impl.DangerServiceImpl;
import com.example.prison.services.impl.PrisonnierServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public PrisonnierServiceImpl prisonnierServiceFactory(PrisonnierRepository repository){
        return new PrisonnierServiceImpl(repository);
    }
    @Bean
    public CelluleServiceImpl celluleServiceFactory(CelluleRepository repository){
        return new CelluleServiceImpl(repository);
    }
    @Bean
    public CrimeServiceImpl crimeServiceFactory(CrimeRepository repository){
        return new CrimeServiceImpl(repository);
    }
    @Bean
    public DangerServiceImpl deangerServiceFactory(DangerRepository repository){
        return new DangerServiceImpl((repository));
    }

}
