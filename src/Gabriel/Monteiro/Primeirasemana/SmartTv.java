package Gabriel.Monteiro.Primeirasemana;

public class SmartTv {
    int volume = 25;
    int canal = 1;
    boolean ligada = false;

    public SmartTv(int volume, int canal, boolean ligada) {
        this.volume = volume;
        this.canal = canal;
        this.ligada = ligada;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

public void ligar(){
        ligada = true;
}

public void desligar(){
        ligada = false;
}

    public void aumentarVolume(){
        volume++; // ou volume = volume + 1;
        System.out.println("Aumentando o volume para: " +volume);

    }

    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: "+volume);
        volume--; // ou volume = volume - 1;
    }


    public void subirDeCanal(){
        System.out.println("Mudando o canal para: "+canal);
        canal++; // ou canal = canal + 1;
    }

    public void diminuirCanal(){
        System.out.println("Mudando o canal para: "+canal);
        canal--; // ou canal = canal - 1;
    }








public SmartTv() {

    }
}
