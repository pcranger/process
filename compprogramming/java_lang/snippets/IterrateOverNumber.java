package java_lang.snippets;





import java.util.ArrayList;

class IterrateOverNumber {
  public static void main(String[] args) {
    method1(123);
    method2(123);
  }

  public static void method1(int number) {

    ArrayList<Integer> result = new ArrayList<>();
    int tmp = 0;
    while (number > 0) {
      tmp = number % 10;
      result.add(tmp);
      number /= 10;
    }
    System.out.println(result);

  }

  public static void method2(int num) {

    ArrayList<Integer> result = new ArrayList<>();
    String numberString = Integer.toString(num);

    for (int i = 0; i < numberString.length(); i++){
        char c = numberString.charAt(i);        
        int e = c - '0'; //turns char into int
        result.add(e);
    }
    System.out.println(result);
  }



}