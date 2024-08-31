package part3;

public class OverLoad {
    // ここからはメソッドのオーバーロードについて学びます   

    // メソッドのオーバーロード
    // メソッド名は同じで、引数の型や引数の数が異なるメソッドを定義することができます
    // 例
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static String add(String a, String b) {
        String sum = a + b;
        return sum;
    }
    
    public static void main(String[] args){
        // メソッドの呼び出し
        // メソッド名(引数, 引数, ...)
        // 例
        int result = add(3, 5);
        System.out.println(result); // 8
        
        String result2 = add("Hello", "World");
        System.out.println(result2); // HelloWorld
    }
}
