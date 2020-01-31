import java.util.ArrayList;


public class TriFusion<E extends Comparable<E>> implements Tri {
    @Override
    public ArrayList trier(ArrayList monTableau) {
        if(monTableau.size() > 1){
            ArrayList<E> subList1 = trier(subList(monTableau,0,monTableau.size()/2));
            ArrayList<E> subList2 = trier(subList(monTableau, monTableau.size()/2,monTableau.size()));

            monTableau = fusion(subList1,subList2);
        }
        return monTableau;
    }


    public ArrayList<E> subList (ArrayList<E> list, int start, int end) {
        ArrayList<E> subList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            subList.add(list.get(i));
        }
        return subList;
    }

    public ArrayList<E> fusion (ArrayList<E> a, ArrayList<E> b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        ArrayList<E> s = new ArrayList<>();
        if (a.get(0).compareTo(b.get(0)) > 0) {
            s.add(b.remove(0));
        } else {
            s.add(a.remove(0));
        }
        s.addAll(fusion(a, b));
        return s;
    }
}
