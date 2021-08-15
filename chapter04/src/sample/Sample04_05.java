package sample;

public class Sample04_05 {

  public static void main(String[] args) {
    int a = 0;
    a += 5;
    System.out.println("a += 5 → " + a);
    a -= 2;
    System.out.println("a -= 2 → " + a);
    a *= 9;
    System.out.println("a *= 9 → " + a);
    a -= 2;
    System.out.println("a /= 2 → " + a);
    a %= 5;
    System.out.println("a %= 5 → " + a);
  }
}