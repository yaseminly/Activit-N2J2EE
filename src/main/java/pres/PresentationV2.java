package pres;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        //dynamique
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoclassname=scanner.nextLine();
            Class cDao = Class.forName(daoclassname);//charger la classe en memoire de type Class
            IDao dao=(IDao)cDao.getConstructor().newInstance();//creer une instance de cette classe


            String metierClassname=scanner.nextLine();
            Class cMetier=Class.forName(metierClassname);
            Imetier metier=(Imetier)cMetier.getConstructor().newInstance();

            Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(metier,dao);
            System.out.println(metier.calcul());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}