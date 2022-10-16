public class Sample01 {
  public static void main(String[] args) {
    String name;
    final int number = 5555;
    
    name = "三根稜矢";
    System.out.println(name);
    
    name = "三根ゴン次郎";
    System.out.println(name);
  
    System.out.println(number);
    
    String string1;
    string1 = "あいう";
    System.out.println(string1 + "の文字数：" + string1.length());
    string1 = "";
    System.out.println(string1 + "の文字数：" + string1.length());
    
    long a = 12312312313132l;
    double b = 3.14;
    boolean c = true;
    Float d = 5.6112f;
    Integer e = 4;
    Character f = 'ゴ';
    
    int[] arry = new int[] {10, 20, 30, 40};
    System.out.println(arry[3]);
    
    int val = 2 + 5;
    System.out.println(val);
    val++;
    System.out.println(val);
    val *= 5;
    System.out.println(val);
    boolean bool = (val == 50);
    System.out.println(bool);
    bool = (val < 50) && (val % 10 == 0);
    System.out.println(bool);
  }
}