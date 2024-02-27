public class App {
    public static void main(String[] args) throws Exception {
        Album a = new Album(200);
        a.MehrfachKauf(20);
        a.KaufenBisVollZu(80);
        System.out.println("\n Beklebt:");
        a.printBeklebt();
        System.out.println("\n Leer:");
        a.printleer();
        System.out.println("\n Doppelt:");
        a.printDoppelt();
    }
}
