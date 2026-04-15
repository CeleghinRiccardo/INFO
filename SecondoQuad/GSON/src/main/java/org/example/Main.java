package org.example;


import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {


        Indirizzo indirizzo = new Indirizzo("Via Roma", "10", "Italia", "20100");
        Persona persona = new Persona("Mario", "Rossi", 30, indirizzo);


        Gson gson = new Gson();


        String json = gson.toJson(persona);
        System.out.println("JSON:");
        System.out.println(json);


        Persona personaDeserializzata = gson.fromJson(json, Persona.class);

        System.out.println("\nOggetto deserializzato:");
        System.out.println("Nome: " + personaDeserializzata.getNome());
        System.out.println("Cognome: " + personaDeserializzata.getCognome());
        System.out.println("Età: " + personaDeserializzata.getEta());
        System.out.println("Via: " + personaDeserializzata.getIndirizzo().getVia());
    }
}