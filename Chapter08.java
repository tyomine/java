public class Chapter08 {
  public static void main(String[] args) {
    /*
    1: int[] scores;
    2: scores = new int[5];
    1と２を同時に行うこともできる。
    */
    int[] scores = new int[5];
    int num = scores.length;
    System.out.println("要素の数" + num);
    
    /*配列の作成と初期化の省略記法
    1: 要素の型[] 配列変数名 = new 要素の型[] {値1, 値2, 値3, ...};
    2: 要素の型[] 配列変数名 = {値1, 値2, 値3, ...};
    具体例
    1: int[] scores1 = new int[] {20, 30, 40, 50};
    2: int[] scores2 = {20, 30, 40, 50};
    */
    int[] score = {20, 30, 40, 50, 80};
    int sum = score[0] + score[1] + score[2] + score[3] + score[4];
    int avg = sum / score.length;
    System.out.println("合計点：" + sum);
    System.out.println("平均点：" + avg);
    
    // forを使った配列
    int[] score1 = {20, 30, 40, 50};
    for (int i = 0; i < score1.length; i++) {
      System.out.println(score1[i]);
    }
    
    int[] score2 = {20, 30, 40, 50, 80};
    // 集計結果を入れるための変数を初期化して準備
    int sum1 = 0;
    for (int i = 0; i < score2.length; i++) {
      // １科目ずつ変数sumに合算する
      sum1 += score2[i];
    }
    int avg1 = sum / score2.length;
    System.out.println("合計点：" + sum1);
    System.out.println("平均点：" + avg1);
    
    int[] score3 = {20, 30, 40, 50, 80};
    int count = 0;
    for (int i = 0; i < score3.length; i++) {
      if (score3[i] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目の数は：" + count);
    
    
    int[] seq = new int[10];
    // 塩素配列をランダムに生成
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    for (int i = 0; i < seq.length; i++) {
      char[] base = {'A','T','G','C'};
      System.out.print(base[seq[i]] + " ");
      /*このfor文から下を分解すると
      int baseType = seq[i];
      char baseChar = base[baseType];
      System.out.print(baseChar + "");
      となる*/
    }
    System.out.println("");
    
    // 拡張for文
    // for (要素の型　任意の変数名 : 配列変数名)
    int[] score4 = {20, 30, 40, 50, 80};
    for (int value : score4) {
      System.out.println(value);
    }
    
    // 多次元の配列
    int[][] score5 = {{40, 50, 60}, {80, 60, 70}};
    System.out.println(score5.length);
    System.out.println(score5[0].length);
  }
}