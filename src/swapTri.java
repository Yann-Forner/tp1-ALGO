import java.util.List;

abstract class swapTri<E extends Comparable<E>> implements Tri<E> {

    public void swap(List<E> suite, int j, int j2) {
        E tmp = suite.get(j);
        suite.set(j, suite.get(j2));
        suite.set(j2, tmp);
    }
}