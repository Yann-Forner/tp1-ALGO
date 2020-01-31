import java.util.ArrayList;

public class TriRapide<E extends Comparable<E>> extends swapTri<E> {


    @Override
    public ArrayList<E> trier(ArrayList<E> monTableau) {
        triController(monTableau,0,monTableau.size()-1);
        return monTableau;
    }


    public void triController(ArrayList<E> monTableau , int low , int high){
        if(low < high){
            int pi = partition(monTableau,low,high);
            triController(monTableau,low,pi-1);
            triController(monTableau,pi+1,high);
        }

    }

    public int partition(ArrayList<E> monTableau, int low , int high){
        E pivot = monTableau.get(high);
        int i = (low -1);
        for (int j = low ; j < high ; j++) {
            if(monTableau.get(j).compareTo(pivot) > 0 ){
                i++;
                swap(monTableau,i,j);
            }
        }

        swap(monTableau,i+1,high);
        return i+1;
    }
}
