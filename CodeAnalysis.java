public class CodeAnalysis {
    public static void main(String[] args) {
        int k = 5, j = 9;
        k += k++ - ++j + k;
        boolean result = k + j * j > j * (k + j) - 1;
        System.out.println("k=" + k);
        System.out.println("j=" + j);
        System.out.println(result);
    }
}
