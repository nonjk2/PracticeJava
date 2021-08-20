package operater;

import java.util.Scanner;

public class StringOperater {
    public static void main(String[] args) { //문자열의 비교
        /*String str1 = "abc";
        String str2 = new String("abc");
//        String y="임";
//        y= y+"태";

        System.out.printf("\"abc\"==\"abc\"?%b%n", "abc"=="abc");
        System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");*/

        System.out.println("==========논리연산자============");
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요-->");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if (!!('0' <= ch&&ch <='9')){
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }else {
            System.out.println("입력하신 문자는 숫자가 아닙니다");
        }

        if (('a'<=ch&&ch<='z')||('A'<=ch && ch <='Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }else {
            System.out.println("입력하신 문자는 영문자가 아닙니다.");
        }


    }

}
