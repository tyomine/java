// オーバーロードの利用
// 同じメソットを使うことは基本的にはできないが引数が異なる場合は使用できる。
public class Chapter10 {
  // 1つ目のaddメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  //2つ目のメソッド
  public static double add(double x, double y) {
    return x + y;
  }
  //3つ目のメソッド
  public static String add(String x, String y) {
    return x + y;
  }
  //４つ目のメソッド
  public static int add(int x, int y, int z) {
    return x + y +z;
  }
  
  public static void main(String[] args) {
    System.out.println(add(10, 20));/*1つ目のメソッドが呼ばれる*/
    System.out.println(add(3.5, 2.7));/*2つ目のメソッドが呼ばれる*/
    System.out.println(add("Hello", "World"));/*3つ目のメソッドが呼ばれる*/
    System.out.println("10+20+30=" + add(10,20,30));/*４つ目のメソッドが呼ばれる*/
  }
}