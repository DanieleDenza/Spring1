package it.danieledenzaSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.danieledenza.Immobile;
import it.danieledenza.Proprietario;

@Configuration
@ComponentScan(basePackageClasses = Immobile.class)


public class Contenuto {
    @Bean
    public Proprietario getProprietario() {
        return new Proprietario("daniele", "denza");
    }
}