public class Selection extends Templete {

    public static void sort(Comparable[] a) {
        final int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, min, i);
        }
    }

    public static void main(String[] args) {
        Comparable[] a = init(20);
        Selection.sort(a);
        show(a);
    }
}
