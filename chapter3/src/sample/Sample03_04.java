package sample;

public class Sample03_04 {

  public static void main(String[] args) {
    int n = 10;
    double x;
    x = n;          //  nの値10を10.0に自動変換してxに代入する
    x = x + 5;      //  5を5.0に自動変換してxに加える
    System.out.println(x);
  }
}