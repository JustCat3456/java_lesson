package part2;

public class IfStatement {
   //ここからは条件分岐について学びます
   
   
    public static void main(String[] args) {

         // if文


         // if(条件式){
         //     処理
         // }
         // 条件式がtrueの場合、処理が実行されます
         // 条件式がfalseの場合、処理が実行されません
         // 例
         int num = 10;
         if(num > 5){
              System.out.println("numは5より大きいです");
         }
         
         // 条件式がfalseの場合、処理が実行されません
         if(num < 5){
              System.out.println("numは5より小さいです");
         }
        
         
        // else文,else if文


        // if(条件式){
        //     処理
        // }elseif(条件式){
        //     処理
        // }else{
        //     処理
        // }
        // 条件式がtrueの場合、ifの処理が実行されます
        // 条件式がfalseの場合、elseifの条件がtrueなら処理が実行されます
        // どちらもfalseの場合、elseの処理が実行されます
        // 例
        if(num > 5){
            System.out.println("numは5より大きいです");
        }else  if(num == 5){
            System.out.println("numは5です");
        }else{
            System.out.println("numは5より小さいです");
        }



        //問題　次の条件に合わせて処理を書いてください
        // 1. numが10より大きい場合、"numは10より大きいです"と出力
        // 2. numが10と等しい場合、"numは10です"と出力
        // 3. numが10より小さい場合、"numは10より小さいです"と出力
        // 今回 num = 10 ですがnumにいろいろな値を代入して処理を確認してください


