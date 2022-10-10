public class Chapter06 {
  public static void main(String[] args) {
    boolean tenki = false;
    if (tenki == true) {
      System.out.println("選択をします。");
      System.out.println("散歩に行きます。");
    } else {
      System.out.println("DVDを見ます");
    }
    
    boolean doorClose = true;
    while (doorClose == false) {
      System.out.println("ノックする。");
      System.out.println("1分まつ。");
    } if (doorClose == true) {
      System.out.println("トイレに入る。");
    }
    
    // おみくじ、これだと長いのでもっと簡潔にできる。（switch）を使う。
    System.out.println("あなたの運勢を占います。");
    int fortune = new java.util.Random().nextInt(4) + 1;
    if (fortune == 1) {
      System.out.println("大吉");
    } else if (fortune == 2) {
      System.out.println("中吉");
    } else if (fortune == 3) {
      System.out.println("吉");
    } else {
      System.out.println("凶");
    }
    
    // switch文を使用した占い
    System.out.println("あなたの運勢を占います。");
    int number = new java.util.Random().nextInt(4) + 1;
    switch (number) {
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      default:
        System.out.println("凶");
    }
    
    System.out.println("もう一回占いたい！");
    int number1 = new java.util.Random().nextInt(5) + 1;
    switch (number1) {
      case 1:
      case 2:
        System.out.println("いいね！");
        break;
      case 3:
        System.out.println("普通ですね");
        break;
      case 4:
      case 5:
        System.out.println("うーーん・・・");
    }
  }
}