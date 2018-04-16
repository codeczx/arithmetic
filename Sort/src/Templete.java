import java.util.concurrent.ThreadLocalRandom;

public class Templete {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static Comparable[] init(int size) {
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = ThreadLocalRandom.current().nextInt(0, 99);
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        return a;
    }

    static Comparable[] aux;

    public static void merge(Comparable[] a, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;

        // 复制值给辅助数组
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        // 按照升序合并两个数组
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
