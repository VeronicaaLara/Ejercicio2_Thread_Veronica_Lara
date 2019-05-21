package es.MZabala;

public class TortugaThread  extends Thread{

    private int casillas;

    public TortugaThread(String nombre) {
        super(nombre);
        casillas = 0;
    }



    @Override
    public void run() {

        int espera = 1;

        while (casillas < 70){

            int azar = (int) (Math.random() * 100) + 1;

            if (azar > 0 && azar <=50){
                casillas += 3;
            } else if (azar > 50 && azar <= 70){
                if (casillas > 6){

                    casillas -= 6;
                } else {
                   casillas = 0;
                }

            } else if (azar > 70 && azar <=100) {
               casillas += 1;
            }


            this.esperarXsegundos(espera);

        }
        System.out.println(this.getName() + " Terminó la carrera");


    }


    private void esperarXsegundos(int segs){
        try{
            Thread.sleep(segs * 1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

}
