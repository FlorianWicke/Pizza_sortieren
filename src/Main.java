import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> pizzas = new ArrayList<String>() {};
        List<String> sorted = new ArrayList<String>() {};

        pizzas.add("Thunfisch");
        pizzas.add("Salami");
        pizzas.add("Mozarella");
        pizzas.add("Funghi");
        pizzas.add("Art des Hauses");

        sortieren(pizzas);
        //pizzas.forEach(System.out::println);
        //Collections.sort(pizzas);

        //System.out.println(pizzas);
        //pizzas.forEach(System.out::println);
    }

    public static List sortieren(List liste){
        List<String> sorted = new ArrayList<String>() {};
        while (liste.size()>0) {
            String vergleich0 = String.valueOf(liste.get(0));
            for (int i = 1; i < liste.size(); i++) {
                String vergleich1 = String.valueOf(liste.get(i));
                int result = vergleich0.compareTo(vergleich1);
                if (result > 0) {
                    vergleich0 = vergleich1;
                }
            }
            sorted.add(vergleich0);
            System.out.println(vergleich0);
            liste.remove(vergleich0);
        }
        return sorted;
    }
}

