package org.example;

public class Indirizzo {
    private String via;
    private String civico;
    private String nazione;
    private String cap;

    public Indirizzo(String via, String civico, String nazione, String cap) {
        this.via = via;
        this.civico = civico;
        this.nazione = nazione;
        this.cap = cap;
    }

    // Getter e Setter
    public String getVia() { return via; }
    public void setVia(String via) { this.via = via; }

    public String getCivico() { return civico; }
    public void setCivico(String civico) { this.civico = civico; }

    public String getNazione() { return nazione; }
    public void setNazione(String nazione) { this.nazione = nazione; }

    public String getCap() { return cap; }
    public void setCap(String cap) { this.cap = cap; }
}