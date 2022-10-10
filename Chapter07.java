public class Chapter07 {
  public static void main(String[] args) {
    // 二種類のwhile文
    int temp = 27;
    while (temp > 25) {
      temp--;
      System.out.println("温度を1度下げました");
    }
    
    // doを使用することで必ず最初に処理が行われる
    int temp1 = 28;
    do {
      temp1--;
      System.out.println("温度を一度下げました。");
    } while (temp1 > 25);
    
    // for文による繰り返し
    // 基本できなfor文
    for (int i = 0; i < 4; i++) {
       System.out.println("現在" + (i+1) +"周目↓");
    }
    
  }
}