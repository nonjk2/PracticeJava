package variable;

public class PracticeString {
    public static void main(String args[]){
        String name = "ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7+" ");
        System.out.println(" "+ 7);
        System.out.println(7+"");
        System.out.println("" + 7 );

        System.out.println("---------------------------------------");
        int x= 10 ;
        int y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int tmp = x;
        x=y;
        y=tmp;
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
