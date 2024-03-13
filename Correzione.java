import java.util.Random;

// Classe base Correzione non astratta
class Correzione {
    public void avviaApplicazione(String nomeApp) {
        System.out.println("Avviando " + nomeApp + " su dispositivo generico.");
    }
}

// Classe Smartphone
class Smartphone extends Correzione {
    private String nomeUtente;
    private String password;

    public Smartphone(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
    }

    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("Avviando " + nomeApp + " su smartphone.");
        loggingAccesso();
    }

    private void loggingAccesso() {
        System.out.println("Accesso effettuato con nome utente: " + nomeUtente + " e password: " + password);
    }
}

// Classe Tablet
class Tablet extends Correzione {
    private static int idCorrente = 0;
    private int punti;
    private int id;

    public Tablet() {
        Random random = new Random();
        this.punti = random.nextInt(101); // Punti random tra 0 e 100
        this.id = ++idCorrente; // Incrementa ID per ogni nuovo utente
    }

    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("Avviando " + nomeApp + " su tablet.");
        System.out.println("Utente ID: " + id + " con punti: " + punti);
    }
}

// Classe ResocontoDigitale
class ResocontoDigitale {
    public void stampaResoconto(String nome, String password, int punti, int id) {
        System.out.println("Resoconto Digitale:");
        System.out.println("Nome: " + nome);
        System.out.println("Password: " + password);
        System.out.println("Punti: " + punti);
        System.out.println("ID: " + id);
    }
}
