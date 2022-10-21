package it.danieledenza;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Immobile {
    private Proprietario proprietario;

    public Immobile (Proprietario proprietario) {
        this.proprietario = proprietario;
    }

}