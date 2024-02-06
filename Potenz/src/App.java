public class App {
    public static void main(String[] args) throws Exception {
        Potenz p = new Potenz(5);
        for (int d : p.pot) {
            System.out.println(d+", ");            
        }
    }
}
