package operater;

public class OperateChange {
    public static void main(String args[]){
        System.out.println("==============산술변환 ==================");
        System.out.println(5/2);
        System.out.println(5/(float)2);

        byte a = 10;
        byte b = 30;
        byte c = (byte)(a*b); //a*b는 값이 졸라 크기때문에 형변환 연사ㅏㄴ자를 사용해서 변환해주어야댐
        System.out.println(c);

        int d = 1_000_000;
        int e = 2_000_000;

        long f = d*e ;

        System.out.println(f); // overflow 발생 값이 존나게 커져서 정해진숫자를 넘김 -123124191

        long i = 1_000_000 * 1_000_000;
        long j = 1_000_000 * 1_000_000L; //long이니까

        System.out.println("i=" +i);
        System.out.println("j=" +j);

        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);

        System.out.println("=============나머지 연산자 ===============");

        System.out.println(-10%8);
        System.out.println(10%-8);
        System.out.println(-10%-8);
    }
}
