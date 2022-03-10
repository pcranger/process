
public class Question2 {
    public static void main(String[] args) {
        System.out.println(kittenMittens(3));
        System.out.println(kittenMittens2(3));


    }

    public static int kittenMittens(int k) {
        int m = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                m += 3;
            } else {
                m += 4;
            }
        }
        return (m);
    }

    public static int kittenMittens2(int k) {
        if (k == 1) {
            return 4;
        } else {
            if (k % 2 == 0) {
                return 3 + kittenMittens2(k - 1);
            } else
                return 4 + kittenMittens2(k - 1);
        }
    }

}
