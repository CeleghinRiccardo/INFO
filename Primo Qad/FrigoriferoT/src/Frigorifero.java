public class Frigorifero {
    private Alimento[] alimenti;
    private String marca, modello, classEne;
    private int maxAlimenti, nPorte, nAlimenti;
    private Double rumDb;
    private boolean acceso;

    public Frigorifero(String marca, String modello, int maxAlimenti,
                          String classEne, int nPorte, Double rumDb, int nAlimenti) {
        this.marca = marca;
        this.modello = modello;
        this.maxAlimenti = maxAlimenti;
        this.classEne = classEne;
        this.nPorte = nPorte;
        this.rumDb = rumDb;
        this.acceso = false;
        this.alimenti = new Alimento[maxAlimenti];
        this.nAlimenti=0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getMaxAlimenti() {
        return maxAlimenti;
    }

    public void setMaxAlimenti(int maxAlimenti) {
        this.maxAlimenti = maxAlimenti;
        this.alimenti=new Alimento[maxAlimenti];
    }

    public String getClassEne() {
        return classEne;
    }

    public void setClassEne(String classEne) {
        this.classEne = classEne;
    }

    public int getnPorte() {
        return nPorte;
    }

    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

    public Double getRumDb() {
        return rumDb;
    }

    public void setRumDb(Double rumDb) {
        this.rumDb = rumDb;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public void stampaInfo(){
        System.out.println("---INFO FRIGOIRIFERO---");
        System.out.println("Marca: "+marca);
        System.out.println("Modello: "+modello);
        System.out.println("Classe Energetica: "+classEne);
        System.out.println("Numero Porte: "+nPorte);
        System.out.println("Rumorosità "+rumDb+"dB");
        System.out.println("Stato: "+acceso);
        System.out.println("Capacità massima di alimenti: "+maxAlimenti);
        System.out.println("Alimenti attuali: "+nAlimenti);
        System.out.println(" ");
    }

    public void accendi(){
        acceso=true;
        System.out.println("Frigorifero acceso");
    }
    public void spegni(){
        acceso=false;
        System.out.println("Frigorifero spento");
    }

    public boolean aggAlimento(Alimento a){
        if (!acceso) {
            System.out.println("impossibile aggiungere alimento, il frigorifero risulta spento");
            return false;
        }
        if (nAlimenti>=maxAlimenti) {
            System.out.println("impossibile aggiungere alimento, il frigorifero risulta pieno");
            return false;
        }

        for (int i = 0; i < nAlimenti; i++) {
            if (alimenti[i].getCodice().equals(a.getCodice())) {
                System.out.println("ERRORE: esiste gia un alimento con codice " + a.getCodice());
                return false;
            }
        }
        alimenti[nAlimenti] = a;
        nAlimenti++;
        System.out.println("Alimento aggiunto: "+a.getNome());
        return true;
    }

    public boolean rmAlimento(String codice){
        for(int i = 0; i < nAlimenti; i++){
            if (alimenti[i].getCodice().equals(codice)){
                System.out.println("Alimento rimosso: "+ alimenti[i].getNome());
                for(int j = 0; j < nAlimenti -1; j++){
                    alimenti[j]=alimenti[j + 1];
                }
                alimenti[nAlimenti-1]=null;
                nAlimenti--;
                return true;
            }
        }
        System.out.println("Alimento con codice: "+codice+" non trovato");
        return false;
    }

    public Alimento cercaAlimento(String codice){
        for(int i = 0; i < nAlimenti; i++){
            if (alimenti[i].getCodice().equals(codice)){
                return alimenti[i];
            }
        }
        return null;
    }

    public void visualizzaAlimenti(){
        System.out.println(" ");
        System.out.println("---ALIMENTI---");
        if(nAlimenti==0){
            System.out.println("nessun alimento presente");
        }else {
            for (int i = 0; i < nAlimenti; i++){
                System.out.println(alimenti[i]);
            }
        }
    }
}
