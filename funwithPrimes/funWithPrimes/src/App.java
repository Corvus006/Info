import java.util.Vector;

public class App {

    public static boolean checkPrime1(int Zahl){
        for (int i = 2; i <= Math.sqrt(Zahl); i++) {
            if (Zahl%i==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkPrime2(int Zahl){
        for (int i = 2; i < Zahl-1; i++) {
            if (Zahl%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeTwinsVector(Vector<Integer> victor){
        for (int var = 0; var < (int) victor.size() - 1; var++) {
            if (victor.get(var) == victor.get((var + 1)) - 2) {
                System.out.printf("(" + victor.get(var) + ", " + victor.get(var + 1) + "), ");
            } else if (var - 1 >= 0) {
                if (victor.get(var) == victor.get(var - 1) + 2) {
                } else
                    System.out.printf(victor.get(var) + ", ");
            } else
                System.out.printf(victor.get(var) + ", ");

        }
    }
    public static void printPrimeTwinsField(Integer[] field){
        for (int var = 0; var < field.length - 1; var++) {
            if(field.length - 2 == var)
            if (field[var] == field[var+1] - 2) {
                System.out.printf("(" + field[var] + ", " + field[var + 1] + "), ");
            } else if (var > 0 && field[var] == field[var - 1] + 2) {
                System.out.printf("(" + field[var - 1] + ", " + field[var] + "), ");
            } else {
                System.out.printf(field[var] + ", ");
            }
        }
    }
    

    public static void primeGenerator(int end) {
        Vector<Integer> Primes = new Vector<>();
        for (int i = 2; i < end; i++) {
            boolean isPrime = true;
            isPrime=checkPrime1(i);
            if (isPrime) {
                Primes.add(i);
            }
        }
        printPrimeTwinsVector(Primes);
    }
    public static void printTupel(int x, int y){
        System.out.print("("+x+","+y+"),");
    }
    public static void nPrimeNumbersVector(int end){
        Vector<Integer> Primes = new Vector<>();
        int Counter = 1;
        int i=2;
        int primeBeforeI = 0;
        while (Counter < end) {
            boolean isPrime = true;
            isPrime=checkPrime1(i);
            if (isPrime) {
                Primes.add(i);
                Counter++;
                if(i==primeBeforeI+2){
                    printTupel(i,primeBeforeI);
                }else{
                    System.out.print(i+",");
                } 
                primeBeforeI=i;
            }
            i++;
        }
        printPrimeTwinsVector(Primes);
    }
    public static void nPrimeNumbersField(int end){
        Integer[] Primes = new Integer[end];
        int Counter = 1;
        int i=2;
        int primeBeforeI = 0;
        while (Counter < end) {
            boolean isPrime = true;
            isPrime=checkPrime1(i);
            if (isPrime) {
                Primes[Counter]=i;
                Counter++;
                if(i==primeBeforeI+2){
                    printTupel(i,primeBeforeI);
                }else{
                    System.out.print(i+",");
                } 
                primeBeforeI=i;
            }
            i++;
        }
        printPrimeTwinsField(Primes);
    }
    
    public static void main(String[] args) {
        nPrimeNumbersField(10000);
    }
}
