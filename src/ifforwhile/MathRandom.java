package ifforwhile;

public class MathRandom {
    public static void main(String[] args) { //랜덤숫자
        int num = 0;

        for (int i = 1; i<=5; i++){
            num = (int) (Math.random() * 6) +1;
            System.out.println(num);
        }
    }
}
