public class MergeDU extends Templete {

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz += sz) {
            for (int low = 0; low < N - sz; low += sz + sz) {
                merge(a, low, low + sz - 1, Math.min(low + sz + sz - 1, N - 1));
            }
        }
    }

    public static void main(String[] args) {
        Comparable[]a = init(20);
        sort(a);
        show(a);
    }
}
