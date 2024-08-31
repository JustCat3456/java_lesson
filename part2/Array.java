public class Array {
  // ここからは配列について学びます
  

  public static void main (String[] args){
    // 配列の宣言
    // 型[] 配列名 = new 型[要素数];
    // 例
    int[] array = new int[5];
    
    // 配列の初期化
    // 配列名[インデックス] = 値;
    // 例
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    
    // 配列の要素を取得
    // 配列名[インデックス];
    // 例
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
    
    // 配列の要素数を取得
    // 配列名.length
    // 例
    System.out.println(array.length);
    
    // 配列の初期化
    // 型[] 配列名 = {値1, 値2, 値3, ...};
    // 例
    int[] array2 = {1, 2, 3, 4, 5};
    
    // 配列の要素を取得
    // 配列名[インデックス];
    // 例
    System.out.println(array2[0]);
    System.out.println(array2[1]);
    System.out.println(array2[2]);
    System.out.println(array2[3]);
    System.out.println(array2[4]);
    
    // 配列の要素数を取得
    // 配列名.length
    // 例
    System.out.println(array2.length);
    
    // 配列の要素を変更
    // 配列名[インデックス] = 値;
    // 例
    array2[0] = 10;
    System.out.println(array2[0]);
    
    // 配列の要素を取得
    // 配列名[インデックス];
    // 例
    System.out.println(array2[0]);
    System.out.println(array2);
  }


    // 問題　次の条件に合わせて処理を書いてください
    // 1. 配列を使って4人の人のニックネームを出力してください
        // String[] name = {"太郎", "次郎", "三郎", "四郎"};
    // 2. 配列を使って4人の人の年齢を出力してください  
        // int[] age = {35, 30, 25, 20};
}
