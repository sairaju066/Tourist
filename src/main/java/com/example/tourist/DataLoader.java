package com.example.tourist;

import com.example.tourist.entity.Tourist;
import com.example.tourist.repository.TouristRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadTourists(TouristRepository repository) {
        return args -> {
            repository.save(new Tourist("Raju", "raju@gmail.com", "Vijayawada"));
            repository.save(new Tourist("Ganesh", "ganesh@gmail.com", "Amalapuram"));
            repository.save(new Tourist("Sai", "sai@gmail.com", "Visakhapatnam"));
        };
    }
}
