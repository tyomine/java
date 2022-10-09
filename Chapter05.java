public class Chapter05 {
  public static void main(String[] args) {
    System.out.println("私の好きな記号は二重引用符 (\")です。");
    // エスケープシーケンはバックスラッシュ（\）をつけて表記する。
    
    System.out.println("今の私の所持金は¥1200円です");
    
    // 強制的な型変換(double型リテラルの前に記述されている「int」が強制的な型変換を指示するキャスト演算子)
    int age = (int)3.2;
    System.out.println(age);
    // 2(int型)を2.0に変換
    double d = 8.5 / 2;
    // 5(int型)を５Lに変換
    long l = 5 + 2L;
    System.out.println(d);
    System.out.println(l);
    
    int a = 5;
    int b = 3;
    int m = Math.max(a, b);
    System.out.println("比較実験：" + a + "と" + b + "とで大き方は" + m);
    
    
    // 文字列を数値に変換するには int n = Integer.parseInt()
    String age1 = "31";
    int n = Integer.parseInt(age1);
    System.out.println("あなたの年齢は、" + (n + 1) + "歳になりますね。");
    
    // 乱数を発生させるには　int r = new java.util.Random().nextInt(数値)
    int r = new java.util.Random().nextInt(50);
    System.out.println("あなたの年齢は" + r + "歳ですね？");
    
    /*キーボードから一行の入力を受ける命令
    文字列の場合
    String s = new java.util.Scanner(System.in).nextLine();
    数値入力の場合
    int input = new.java.util.Scanner(System.in).nextInt();
    */
    System.out.println("あなたの名前を入力してください！");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください！");
    int age2 = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ、" + age2 + "歳の" + name + "さん!");
    
  }
}