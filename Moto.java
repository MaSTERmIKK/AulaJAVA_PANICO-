// Classe derivata Moto
class Moto extends Veicolo {
    private boolean haBauletto;
    Veicolo x = new Veicolo(getMarca(), getVelocitaMassima());
    static Moto moto = new Moto("mazda", 120, true);

    public Moto(String marca, int velocitaMassima, boolean haBauletto) {
        super(marca, velocitaMassima); // Chiamata al costruttore della classe base
        this.haBauletto = haBauletto;
    }

    public boolean getHaBauletto() {
        return haBauletto;
    }

    public void mirko(){
      x.mirko();
      System.out.println(15);
    }

    public void mirko( String y){
      x.mirko();
      System.out.println(y);
    }

    public void prova(){
    x.mirko();
    moto.mirko();
    moto.mirko("ciao");
}

public static void main(String[] args){

moto.prova();

}

    
}