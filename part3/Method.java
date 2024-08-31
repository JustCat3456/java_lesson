package part3;

public class Method {
    // ここからはメソッドについて学びます

        // メソッドの宣言
    // 戻り値の型 メソッド名(引数の型 引数名, 引数の型 引数名, ...) {
    //     処理
    // return 戻り値;
    // }
    // 例
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }


    public static void main(String[] args){
        // メソッドの呼び出し
        // メソッド名(引数, 引数, ...)
        // 例
        int result = add(3, 5);
        System.out.println(result); // 8
    }

    // 問題　次の条件に合わせて処理を書いてください
    // 1. 2つの引数を受け取り、その差を返すメソッドを作成してください
   

    // 2. 1つの引数(name)を受け取り、その引数に「Hello, nameさん」と出力する sayhello(name) メソッドを作成してください
    
}
