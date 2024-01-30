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
        for (int i = 0; i < Temperatur.length; i++) {
            a = (a > Temperatur[i]) ? Temperatur[i] : a;
        }
    }
    public void Min(){
        double a= -20;
        for (int i = 0; i < Temperatur.length; i++) {
            a = (a < Temperatur[i]) ? Temperatur[i] : a;
        }
    }
    public void Durchschnitt(){
        double a =0;
        for (double d : Temperatur) {
            a+= d;
        }
        a /= Temperatur.length;
        System.out.println(a);
    }
    public void printFeld(double[] d){

    }
}
