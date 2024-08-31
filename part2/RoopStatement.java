package part2;

public class RoopStatement {
   // ここからは繰り返し処理について学びます
   
   
    public static void main(String[] args) {

         // for文
         // for(初期化;条件式;更新処理){
         //     処理
         // }
         // 例
         for(int i = 0; i < 5; i++){
             System.out.println(i);
         }
         
         // while文
         // while(条件式){
         //     処理
         // }
         // 例
         int i = 0;
         while(i < 5){
             System.out.println(i);
             i++;
         }
         
         // do-while文
         // do{
         //     処理
         // }while(条件式);
         // 例
         i = 0;
         do{
             System.out.println(i);
             i++;
         }while(i < 5);
         
         //問題　次の条件に合わせて処理を書いてください
         // 1. for文を使って0から4までの数字を出力してください
         // 2. while文を使って0から4までの数字を出力してください
         // 3. do-while文を使って0から4までの数字を出力してください
    } 
}
