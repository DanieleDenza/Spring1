package it.danieledenza;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Proprietario {
    private String nome;
    private String cognome;

    public Proprietario(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

}