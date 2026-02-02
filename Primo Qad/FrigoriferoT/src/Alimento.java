public class Alimento {
    private String nome, tipo, codice, descrizione, dataScad;

    public Alimento(String nome, String tipo, String codice, String descrizione, String dataScad){
        this.nome=nome;
        this.tipo=tipo;
        this.codice=codice;
        this.dataScad=dataScad;
        this.descrizione=descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDataScad() {
        return dataScad;
    }

    public void setDataScad(String dataScad) {
        this.dataScad = dataScad;
    }
    public String toString(){
        return  "nome=" + nome + "\n" +
                "tipo=" + tipo + "\n" +
                "scadenza=" + dataScad + "\n"+
                "codice=" + codice + "\n" +
                "descrizione=" + descrizione + "\n";
    }
}
