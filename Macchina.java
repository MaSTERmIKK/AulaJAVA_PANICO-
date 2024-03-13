class Macchina extends Veicolo {
    private int nrPORTE;

    public Macchina(String marca, int velocitaMassima, int nrPORTE) {
        super(marca, velocitaMassima); // Chiamata al costruttore della classe base
        this.nrPORTE = nrPORTE;
    }


    // proprietario del figlio
    public int getNumeroDiPort() {
        return nrPORTE;
    }

    public static void main(String[] args) {

        String nome = "mazda";
        int velocità = 100;

        Veicolo myVeicolo = new Veicolo(nome, 100);


        Macchina myMacchina = new Macchina(nome,velocità, 4 );

        myVeicolo.getMarca();
        myVeicolo.getVelocitaMassima();

        myMacchina.getNumeroDiPort();


    }

 
}