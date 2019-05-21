package es.MZabala;

public class Main {

    public static void main(String[] args) {

        long tiempoSalida = System.currentTimeMillis();

        TortugaThread tortuga = new TortugaThread("T");

        LiebreThread liebre = new LiebreThread("L");

        tortuga.start();
        liebre.start();


        long tiempo;
        long tiempoTortuga = 0;
        long tiempoLiebre = 0;

        while (tortuga.isAlive() || liebre.isAlive()) {


           tiempo = System.currentTimeMillis() - tiempoSalida;


            if (liebre.isAlive()){
                tiempoLiebre = tiempo;
            }
            if (tortuga.isAlive()){
                tiempoTortuga = tiempo;
            }

        }


        if (tiempoTortuga + 1 < tiempoLiebre){
            System.out.println("Gana la tortuga");
        }
        if (tiempoLiebre < tiempoTortuga + 1) {
            System.out.println("Gana la liebre");
        }
        if (tiempoTortuga +1 == tiempoLiebre){
            System.out.println("Empate");
        }

    }



}
