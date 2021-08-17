package sample;

/**
 * 練習問題7-2
 */
public class Sample07_04 {
  public static void main(String[] args) {
    double[] val = { 188.2, 175.6, 154.5, 168.2, 178.0 };
    for(int i = 0; i < val.length; i++) {
      System.out.print(val[i] + "\t");
    }

    double total = 0;
    for (int i = 0; i < val.length; i++) {
      total += val[i];
    }

    double mean = total/val.length;
    System.out.println();
    for (int i = 0; i < val.length; i++) {
      System.out.print(Math.pow(val[i]-mean, 2) + "\t");
    }
  }
}