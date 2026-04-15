package org.example;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private Indirizzo indirizzo;

    public Persona(String nome, String cognome, int eta, Indirizzo indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.indirizzo = indirizzo;
    }

    // Getter e Setter
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    public int getEta() { return eta; }
    public void setEta(int eta) { this.eta = eta; }

    public Indirizzo getIndirizzo() { return indirizzo; }
    public void setIndirizzo(Indirizzo indirizzo) { this.indirizzo = indirizzo; }
}