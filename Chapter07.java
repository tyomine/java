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
       System.out.print("現在" + (i+1) +"周目↓");
       System.out.println("");
    }
    
    // printは文字列の表示後改行しない
    // printlnは文字列の表示後に改行する
    // printfメソッドは、文字列を指定した書式で画面に表示するメソッド
    
    // 九九の表を出力する
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j);
        System.out.print(" ");/*空白を出力する*/
      }
      System.out.println("");/*改行を出力する*/
    }
    
    // break文
    for (int i = 1; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }
  }
}