package sample;

import lib.Input;

public class Sample08_04 {

  public static void main(String[] args) {
    int a = Input.getInt("a");
    int b = Input.getInt("b");

    boolean b1 = a > 0 && a < 20;
    boolean b2 = a <= 0 || a >= 20;
    boolean b3 = !(a > 0 && a < 20);
    boolean b4 = (a == 0) ^ (b == 0); // aかbのどちらか一方が0

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
  }
}