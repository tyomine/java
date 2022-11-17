public class Chapter08 {
	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//		int[] array = {1,2,3,4,5,6,7,8,9,10};
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//		for (int i = 0; i < array.length; i++) {
//			array[i] *= 2;
//			System.out.println(array[i]);
//		}

		int sum = 0;

		for (int i = 1; i <= 10; i=i+1) {
			if (i % 2 == 0) {
				sum = sum + 1;
			}
		}
		System.out.println(sum);
//		System.out.println("ようこそ占いの館へ");
//		System.out.println("あなたの名前を入力してください");
//		String name = new java.util.Scanner(System.in).nextLine();
//		System.out.println("あなたの年齢を入力してください");
//		String ageString = new java.util.Scanner(System.in).nextLine();
//		int age = Integer.parseInt(ageString);
//		int fortune = new java.util.Random().nextInt(4);
//		fortune++;
//		System.out.println("占いの結果が出ました");
//		System.out.println(age + "際の" + name + "さん、案あたの運気番号は" + fortune + "です。");


	}
}