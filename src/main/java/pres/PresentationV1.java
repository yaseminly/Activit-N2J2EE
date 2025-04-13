package pres;
import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*injection des dependances par instanciation statique =>new */
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);//injection via constructeur
        /*metier.setDao(d); *///injection via le setter
        System.out.println(metier.calcul());
    }
}
