package ifforwhile;

public class For {
    public static void main(String[] args) {
        for(int i =1 ; i<=5; i++){
            for (int j =1; j <=i ; j++) {
                System.out.print("*"); //i만큼 별
            }
            System.out.println(); //5줄
        }
    }
}