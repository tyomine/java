public class Training03 {
  public static void main(String[] args) {
    int[] moneyList = {121902, 8302, 55100};
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }
    for (int money : moneyList) {
      System.out.println(money);
    }
    
    int[] numbers = {3, 4, 9};
    System.out.println("１桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int n : numbers) {
      if (n == input) {
        System.out.println("当たり！！");
      }
    }
  }
}