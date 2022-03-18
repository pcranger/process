public class Question3 {
    public static void main(String[] args) {
        fireIce(1, 6);
        String[] q3 = fireIce(1, 6);
        for (String item : q3) {
            System.out.println(item);
        }
    }
    public static String[] fireIce(int start, int end) {
        String[] result = new String[end - start + 1];
        for (int i = start; i < end; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result[i] = "Water";
            } else if (i % 3 == 0) {
                result[i] = "Fire";
            } else if (i % 5 == 0) {
                result[i] = "Ice";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        return result;

    }
}
