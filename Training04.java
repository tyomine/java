public class Training04 {
  public static void main(String[] args){
    System.out.println("じゃんけんゲームを始めます");
    System.out.println("グー、チョキ、パーを入力してください。");
    String hand = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたは" + hand + "を選択しました。");
  }
}