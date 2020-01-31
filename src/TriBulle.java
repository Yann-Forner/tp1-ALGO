import java.util.ArrayList;

public class TriBulle <E extends Comparable<E>> extends swapTri<E> {

    @Override
    public ArrayList<E> trier(ArrayList<E> monTableau) {
        for (int i = monTableau.size(); i > 1 ; i--) {
            for (int j = 0; j < monTableau.size()-1 ; j++) {
                if(monTableau.get(j).compareTo(monTableau.get(j+1)) > 0){
                    swap(monTableau,j,j+1);
                }
            }
        }
        return monTableau;
    }
}
