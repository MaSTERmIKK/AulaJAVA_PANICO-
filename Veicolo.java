// Classe base Veicolo
class Veicolo {
    private String marca;
    private int velocitaMassima;
    private int carregiata;

    public Veicolo(String marca, int velocitaMassima) {
        this.marca = marca;
        this.velocitaMassima = velocitaMassima;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocitaMassima() {
        return velocitaMassima;
    }

    //Metodo generalizzato Mirko
    public void mirko(){ System.out.println("prova padre");}
    //Metodo generalizzato accelarazione
    public void velocità(){System.out.println("prova padre velocità");}
    //Metodo generalizzato Frenata
    public void frenata(){System.out.println("prova padre frenata");}
}





