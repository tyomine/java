public class Chapter02 {
	public static void main(String[] args) {
		// エスケープシーケンス
		System.out.println("私の好きな記号は(\")です。");
		int a = 100;
		a++;
		System.out.println(a);
		
		int b = 5;
		int c = 3;
		int m = Math.max(b,c);
		System.out.println("比較実験：" + b + "と" + c + "とで大きい方は・・・" + m);
		
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたのは来年、" + (n + 1) + "歳になりますね。");
		
		int r = new java.util.Random().nextInt(30);
		System.out.println("あなたの年齢は"+ r + "歳ですね！");
		System.out.println("あなたの名前を入力してください。");
		String z = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int g = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + g + "歳の" + z + "さん！！");
	}
}