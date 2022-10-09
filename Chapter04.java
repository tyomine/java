public class Chapter04 {
  public static void main(String[] args) {
    String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数:" + string1.length());
		string1 = "";
		System.out.println(string1 + "の文字数:" + string1.length());

		int[] array1 = new int[3];
		array1[0] = 60;
		array1[1] = 20;
		array1[2] = 20;
		System.out.println(array1[0]);
		
		int[] array = {0, 10, 20, 30, 40};
		System.out.println(array[3]);
  }
}

public class Training01 {
  public static void main(String[] args) {
    int x = 5;
    int y = 10;
    String ans = "x+yは" + (x + y);
    System.out.println(ans);
    
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください。");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age = new java.util.Scanner(System.in).nextInt;
    int fortune = new java.util.Random().nextInt(3);
    int number = (fortune + 1);
    System.out.println("占い結果が出ました！");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + number + "です。")
    System.out.println("1:大吉 2:中吉 3:吉 4:凶")
  }
}