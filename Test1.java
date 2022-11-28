public class Test1 {
  public static void main(String[] args) {
    int a = 3; int b = 5;
    int c = a * b;
    System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);
    
    String naame = "三根くん";
    System.out.print("私の名前は");
    System.out.print(naame);
    System.out.println("デス");
    
    int d = 5;
    int s = 10;
    int m = Math.max(d, s);
    System.out.println("比較実験：" + d + "と" + s + "とで大きい方は・・・" + m);
    
    int r = new java.util.Random().nextInt(90);
    System.out.println("あなたは多分" + r + "歳ですね？");
    
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(5);
    fortune++;
    System.out.println("占いの結果が出ました。");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
    System.out.println("【１:大吉 ２:中吉 ３:吉 ４:凶】");
  }
}