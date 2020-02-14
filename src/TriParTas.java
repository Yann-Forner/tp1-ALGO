import java.util.ArrayList;

public class TriParTas<E extends Comparable<E>> extends swapTri<E> {
    @Override
    public ArrayList<E> trier(ArrayList<E> monTableau) {
        for (int i = monTableau.size()-1; i >= 0 ; --i) {
            tamiser(monTableau,i,monTableau.size()-1);
        }
        for (int i = monTableau.size()-1; i >= 1  ; --i) {
            swap(monTableau,i,0);
            tamiser(monTableau,0,i-1);
        }
        return monTableau;
    }


    public  void tamiser (ArrayList<E> arbre , int noeud , int n){
        int k = noeud;
        int j = 2*k;
        while( j <= n){
            if((j < n ) && (arbre.get(j).compareTo(arbre.get(j+1)) < 0)){ ++j; }
            if(arbre.get(k).compareTo(arbre.get(j)) < 0){
                swap(arbre,k,j);
                k=j;
                j=2*k;
            }else{
                break;
            }
        }

    }
}

