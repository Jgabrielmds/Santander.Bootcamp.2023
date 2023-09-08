package Gabriel.Monteiro.Primeirasemana;

public class usuario {

    public static void main(String[] args)  throws Exception {


    SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        System.out.println("Canal atual : "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual : "+smartTv.canal);


        System.out.println("Volume atual? "+smartTv.volume);

        System.out.println("a tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual? "+smartTv.canal);


        smartTv.desligar();
        System.out.println("Novo status -> tv ligada? " + smartTv.ligada);


    }
}

