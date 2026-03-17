public class Contatto {
    String nome, cognome, nTel;


    public Contatto(String nome, String cognome, String nTel) {
        this.nome = nome;
        this.cognome = cognome;
        this.nTel = nTel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }
}
