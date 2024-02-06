public class Potenz {
    public int[] pot = new int[10];
    
    public Potenz(int basis){
        int b= basis;
        pot[0] = 1;
        for (int i = 1; i < 10; i++) {
        pot[i]=pot[i-1]*b;   
        }
    }
}
