package variable;

public class SysPrint {
    public static void main(String args[]){
        System.out.println("hello,world"); // 화면에 hello,world를 출력하고 줄바꿈한다
        System.out.print("Hello");// 화면에 Hello를 출력하고 줄바꿈 안한다.
        System.out.println("world"); // 화면에 world를 출력하고 줄바꿈 한다.
        System.out.println("Hello,world"); //화면에 Hello, world가 출력된다.
        System.out.print("3+5=");//화면에 3+5=를 출력하고 줄바꿈안함.
        System.out.println(3+5);//화면에 8이 출력된다.

        System.out.println("---------덧셈뺄셈 계산하기-------------");
        System.out.println(5+3); //화면에 5+3의 결과인 8이 출력된다
        System.out.println(5-3); //화면에 5-3의 결과인 2가 출력된다.
        System.out.println(5*3); //화면에 5*3의 결과인 15가 출력된다
        System.out.println(5/3); //화면에 5/3의 결과인 1이 출력된다.

        System.out.println("---------변수의 선언과 저장 -----------");
        int x = 5; //int x; 와 x =5;를 이처럼 한줄로 합칠 수 있다.
        System.out.println(x); // 화면에 x의 값인 5가 출력된다.

        x = 10 ; //변수 x 에 10을 저장. 기존에 저장되어 있던 5는 지워짐
        System.out.println(x); //화면에 x의 값인 10이 출력된다.

        int y=5;

        System.out.println("x+y="+(x+y));
        System.out.println("x-y="+(x-y));
        System.out.println("x*y="+x*y);
        System.out.println("x/y="+x/y);

        System.out.println("------------변수 타입--------------");

        int a = 100;
        double pi = 3.14;
        char ch = 'a';
        String str = "abc";

        System.out.println(x);
        System.out.println(pi);
        System.out.println(a);
        System.out.println(str);

        System.out.println("------------상수와 리터럴------------");
        //상수는 변수와 마찬가지로 값을 저장할수있는 공간
        //변수와 달리 한번 값을 저장하면 다른 값으로 변경할 수없다 final을 붙여주면됌
        //리터럴은 변수와 상수의 자체 값을 의미하는것

        final int MAX_SPEED = 10;
        final int MAX_VALUE;
        MAX_VALUE = 100;
        //MAX_VALUE = 200; // 에러




    }

}
