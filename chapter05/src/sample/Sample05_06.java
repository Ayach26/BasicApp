package sample;

public class Sample05_06 {

  public static void main(String[] args) {
    String str = "abAB日本語abAB";

    int len = str.length();
    int pos = str.indexOf('日');
    char ch = str.charAt(4);
    String st = str.toLowerCase();

    System.out.println("長さは" + len);
    System.out.println("日は" + pos + "番目");
    System.out.println("4番目の漢字は" + ch);
    System.out.println(str + "→" + st);
  }
}