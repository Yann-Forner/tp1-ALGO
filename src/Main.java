import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> monTableau = generate(10);
        Tri<Integer> tri = new TriParTas<>();

        System.out.println(tri.trier(monTableau));
    }
    public static ArrayList<Integer> generate(int size){
        ArrayList<Integer> tab = new ArrayList<>(0);
        Random random = new Random();
        for (int i = 0; i < size ; i++) {
           tab.add(random.nextInt(100));
        }
        return tab;
    }
}
