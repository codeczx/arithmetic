public class Insertion extends Templete {

    public static void sort(Comparable[] a) {
        final int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j - 1, j);
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] a = init(20);
        sort(a);
        show(a);
    }
}
