public class Chapter09 {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します。");
    hello("ワタル");
    hello("アスカ");
    hello("アヤナミ");
    System.out.println("メソッドの呼び出しが終わりました。");
    System.out.println("複数の引数を渡したねを呼び出します");
    add(100, 20);
    add(200, 50);
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちわ！");
  }
  // 複数の値を受け取るメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}
