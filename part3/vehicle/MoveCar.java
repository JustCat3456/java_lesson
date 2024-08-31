


package part3.vehicle; // vehicle パッケージに配置


//クラスの宣言（コメントアウトして下を参照しながら書こう！）
public class MoveCar {
    private String color;
    private int speed;

    public MoveCar(String color) {
        this.color = color;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }

    public void brake(int amount) {
        this.speed -= amount;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void printStatus() {
        System.out.println("色: " + color + ", 速度: " + speed);
    }
}










