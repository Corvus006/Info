import java.util.Vector;

public class Album {
    boolean Plätze[];
    Vector<Integer> Mehrfach = new Vector<>(5);
    int AnzahlGekauft;
    public Album(int Anzahl){
        Plätze = new boolean[Anzahl];
        AnzahlGekauft=0;

        for (boolean b : Plätze) {
            b = false;
        }
    }


    public Vector<Integer> getBeklebt(){
        Vector<Integer> Beklebt = new Vector<Integer>();
        for (int Platz = 0;Platz<Plätze.length ;Platz++) {
            if(Plätze[Platz] == true){
                Beklebt.add(Platz);
            }
        }
        return Beklebt;
    }

    public Vector<Integer> getFrei(){
        Vector<Integer> Beklebt = new Vector<Integer>();
        for (int Platz = 0;Platz<Plätze.length ;Platz++) {
            if(Plätze[Platz] == false){
                Beklebt.add(Platz);
            }
        }
        return Beklebt;
    }

    public void StickerKaufenUndEinkleben(){
        int Platz = (int) (Math.random()*Plätze.length);

        if(Plätze[Platz]== false){ // false ist leer. true ist beklebt
            Plätze[Platz]= true; 
        }else{
            Mehrfach.add(Platz);
        }
        AnzahlGekauft++;
    }

    public void MehrfachKauf(int Anzahl){
        for (int i = 0; i < Anzahl; i++) {
            StickerKaufenUndEinkleben();
        }
    }
    
    public void KaufenBisVollZu(int Prozentsatz){
        while(getBeklebt().size()*100 / Plätze.length < Prozentsatz){
            StickerKaufenUndEinkleben();
        }

    }

    public void printBeklebt(){

        for (int Sticker:this.getBeklebt()) {
            System.out.print(Sticker+", ");
        }
    }
    public void printleer(){

        for (int Sticker:this.getFrei()) {
            System.out.print(Sticker+", ");
        }
    }
    public void printDoppelt(){

        for (int Sticker:Mehrfach) {
            System.out.print(Sticker+", ");
        }
    }
}  
