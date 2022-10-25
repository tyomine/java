public class Chapter02 {
	public static void main(String[] args) {
		String address = "hoge@hoge";
		String text = "私は元気ですよ";
		email(address, text);
	}
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名" + title);
		System.out.println("本文" + text);
	}
}