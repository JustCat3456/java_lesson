package part2;

public class LogicStatement {
    // ここからは論理演算子について学びます
    
    public static void main(String[] args) {
        
        // 論理演算子
        // 論理演算子は条件式を組み合わせるための演算子です
        // 例
        int num = 10;
        // numが5より大きく、15より小さい場合(A && B)
        if(num > 5 && num < 15){
            System.out.println("numは5より大きく、15より小さいです");
        }
        
        // numが5より小さいか、15より大きい場合(A || B)
        if(num < 5 || num > 15){
            System.out.println("numは5より小さいか、15より大きいです");
        }
        
        // numが5より小さくない場合(!A)
        if(!(num < 5)){
            System.out.println("numは5より小さくないです");
        }
        
        //問題　次の条件に合わせて処理を書いてください
        // 1. numが5より大きく、15より小さい場合、"numは5より大きく、15より小さいです"と出力
        // 2. numが5より小さいか、15より大きい場合、"numは5より小さいか、15より大きいです"と出力
        // 3. numが5より小さくない場合、"numは5より小さくないです"と出力
        // 今回 num = 10 ですがnumにいろいろな値を代入して処理を確認してください
    }
    
}
