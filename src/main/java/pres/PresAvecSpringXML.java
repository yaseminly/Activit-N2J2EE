package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        //pour pouvoir utiliser spring => creation d'un obj de type applicationcontext
        ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");//va s'occuper de la creation des objets
        Imetier metier = (Imetier) context.getBean("metier");
        System.out.println("res="+  metier.calcul());
    }
}
