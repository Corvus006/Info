public class Temperaturmessung {
    double[] Temperatur;
    public Temperaturmessung(){
        Temperatur= new double[365];
    }
    public void feldBefuehlen(){
        for (int i=0 ; i<365; i++) {
         
        Temperatur[i] = Math.random()*55-20;   
        }
    }

    public void Max(){
        double a= 35;
        for (double t: Temperatur) {
            a = (a > t) ? t : a;
        }
        System.out.println(a);
    }

    public void Min(){
        double a= -20;
        for (int i = 0; i < Temperatur.length; i++) {
            a = (a < Temperatur[i]) ? Temperatur[i] : a;
        }
        System.out.println(a);
    }

    public void Durchschnitt(){
        double a =0;
        for (double d : Temperatur) {
            a+= d;
        }
        a /= Temperatur.length;
        System.out.println(a);
    }
    public void bubblesort(){
        boolean isSorted= true;
        do {
            isSorted= true;
            for (int i=1;i<(Temperatur.length);i++) {
                if(Temperatur[i]<Temperatur[i-1]){
                    Temperatur[i-1]=Temperatur[i];
                    isSorted= false;
                }
            }
        } while (!isSorted);
        int i=1;
        for ( double d : Temperatur) {
            System.out.println(i +". "+ d+", ");
            i++;
        }
    }
}
