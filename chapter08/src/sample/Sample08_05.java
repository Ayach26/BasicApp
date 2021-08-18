package sample;

public class Sample08_05 {

  public static void main(String[] args) {
    int a = 1, b = 1;
    System.out.println(a++ == 0 && b++ == 0); // 式を評価した後、a、bに1加算
    System.out.println("a=" + a + "/b=" + b);
  }
}