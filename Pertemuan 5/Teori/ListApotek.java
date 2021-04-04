import java.util.ArrayList;
import java.lang.reflect.Array;

public class ListApotek{
    ArrayList<String> arrTablet = new ArrayList<>();
    ArrayList<String> arrKapsul = new ArrayList<>();
    public void printTablet(){
        arrTablet.add("Panadol");
        arrTablet.add("Decolgen");
        arrTablet.add("Mixagrip");
        System.out.println("List Tablet: " + arrTablet);
    }

    public void printKapsul(){
        arrKapsul.add("Imboost");
        System.out.println("List Kapsul: " + arrKapsul);
    }
}
class Cashier extends ListApotek{
    void Tablet(){
        arrTablet.add("Paracetamol");
        arrTablet.add("Mextril");
        arrTablet.remove("Paracetamol");
    }
    void Kapsul(){
        arrKapsul.add("Combatrin");
        arrKapsul.add("Entrostop");
        arrKapsul.add("Oralit");
        arrKapsul.add("SuperTetra");
        arrKapsul.remove("Oralit");
    }
    void output(){
        Tablet();
        Kapsul();
        super.printTablet();
        super.printKapsul();
    }
}