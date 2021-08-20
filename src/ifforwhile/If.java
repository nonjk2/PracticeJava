package ifforwhile;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
//        int score=80;
//
//        if (score >=60){
//            System.out.println("합격입니다");
//        }

        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은%n",x);

        if (x==0)System.out.println("x==0");
        if (x!=0) System.out.println("x!==0");

//        System.out.print("숫자를 하나 입력하세요 -->");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//
//        if (input==0){
//            System.out.println("입력하신 숫자는 0입니다.");
//        }else{
//            System.out.println("입력하신 숫자는 0이 아닙니다");
//        }

        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner1 = new Scanner(System.in);
        score = scanner1.nextInt();

        if (score>=90){
            grade = 'A';
        }else if (80 <= score && score <90){
            grade = 'B';
        }else if (70 <= score && score <80){
            grade = 'C';
        }else{
            grade = 'D';
        }
        System.out.println("당신의 학점은"+grade+"입니다");


    }
}












