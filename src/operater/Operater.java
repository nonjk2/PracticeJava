package operater;

public class Operater {
    public static void main(String args[]){
        int x, y;

        x= y = 3; //y에 3이 저장된 후에 x에 3이 저장된다.

        System.out.println("x="+ x);
        System.out.println("y="+ y);

        System.out.println("==============증감 연산자 ++ -- ==================");

        int i = 5, j=0;
        j = i++;
        System.out.println("j=i++; 실행후, i=" + i + ", j=" +j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j=++i; 실행후, i=" + i + ", j=" + j );

        int a = 10 , b = 10 ;
        System.out.println(a++); //i의 값을 출력 후 , 1증가
        System.out.println(++b); //j의 값을 1 증가 후 , 출력
        System.out.println("a=" + a + ",b=" +b);

        System.out.println("==========부호연산자 ===============");

         int c = -10;
         c = +c;
        System.out.println(c);

        c= -10;
        c = -c;
        System.out.println(c);

        System.out.println("=========형변환 연산자 =================");

        double d = 85.4;
        int score = (int) d;
        System.out.println("score="+ score);
        System.out.println("d=" +d);


    }


}
