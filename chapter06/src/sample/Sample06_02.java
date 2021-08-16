package sample;

/**
 * 練習問題6-3
 */
public class Sample06_02 {

  public static void main(String[] args) {
    Sample06_02 s = new Sample06_02();
    s.prac1();
    s.prac2();
    s.prac3();
  }

  public void prac1() {
    String[] strs = { "田中", "田口", "前田", "前原" };
    for (int i = 0; i < strs.length; i++) {
      System.out.println(strs[i]);
    }
  }

  public void prac2() {
    double[] num = { 1.5, 2.3, 0.6, 3.3, 9.0 };
    for (int i = 0; i < num.length; i++) {
      System.out.println("num[" + i + "]=" + num[i]);
    }
  }

  public void prac3() {
    int[] num = { 5, 7, 9, 4, 8 };
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] * 10 + "\t");
    }
  }
}