package part3;

import part3.vehicle.MoveCar; // MoveCar クラスをインポート

public class Main {
    public static void main(String[] args) {

        // MoveCar クラスのインスタンスを生成
        MoveCar myCar = new MoveCar("赤");
        
        myCar.accelerate(50);
        myCar.brake(20);
        myCar.printStatus(); 
    }
}
