package sample;

/**
 * 練習問題5-2
 */
public class Sample05_02 {
  double a = 30.51;
  double b = 2.68;

  public static void main(String[] args) {
    Sample05_02 s = new Sample05_02();
    s.prac1();
    s.prac2();
    s.prac3();
    s.prac4();
    s.prac5();
    s.prac6();
    s.prac7();
    s.prac8();
  }

  public void prac1() {
    System.out.println(Math.round(a/b));
  }

  public void prac2() {
    System.out.println(Math.pow(a, b));
  }

  public void prac3() {
    System.out.println(Math.min(a, b));
  }

  public void prac4() {
    System.out.println(Math.sqrt(a) + Math.sqrt(b));
  }

  public void prac5() {
    System.out.println(Math.random());
    System.out.println(Math.random());
  }

  public void  prac6() {
    System.out.println(Math.random()*6);
  }

  public void  prac7() {
    System.out.println((int)(Math.random()*6));
  }
  public void  prac8() {
    System.out.println((int)(Math.random()*6)+1);
  }
}