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
    // 戻り値を使った表示
    int ans = abb(100, 10);
    System.out.println("100 + 10 =" + ans);
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちわ！");
  }
  // 複数の値を受け取るメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
  // 戻り
  public static int abb(int a, int b) {
    int ans = a + b;
    return ans;
  }
}
