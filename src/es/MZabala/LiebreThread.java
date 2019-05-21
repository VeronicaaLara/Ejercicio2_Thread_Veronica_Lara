package es.MZabala;

public class LiebreThread extends Thread {

    private int casillas;

    public LiebreThread(String nombre){
        super(nombre);
        casillas = 0;
    }


    public int getCasillass(){
        return casillas;
    }
    public void setCasillas(){
        this.casillas = casillas;
    }

    @Override
    public void run() {

        int espera = 1;
        while (casillas < 70){

            int azar = (int) (Math.random() * 100) + 1;

            if (azar > 0 && azar <= 20){

            } else if (azar > 20 && azar <= 40){
               casillas += 9;
            } else if (azar > 40 && azar <= 50){
                if (casillas > 9){
                    casillas -= 9;
                } else {
                    casillas = 0;
                }
            } else if (azar > 50 && azar <= 80) {
               casillas += 1;
            } else if (azar > 80 && azar <=100) {
                if (casillas > 2) {
                    casillas -= 2;
                } else {
                    casillas = 0;
                }
            }

            this.esperarXsegundos(espera);
            System.out.println(this.getName() + " : " + casillas + "casiilas");
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