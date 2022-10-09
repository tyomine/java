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