package operater;

public class IfOperater {
    public static void main(String[] args) {

        int x,y,z;
        int absX,absY,absZ;
        char signX, signY,signZ;

        x=10;
        y=-5;
        z=0;

        absX = x>=0? x:-x; //x의 값이 음수이면, 양수로 만든다.
        absY = y>=0? y:-y; //조건식 ? 식1:식2 조건이 true면 식1로 저장 false면 식2로 저장
        absZ = z>=0? z:-z;
        signX = x>0? '+' :(x==0?' ':'-'); //조건연산자를 중첩
        signY = y>0? '+' :(y==0?' ':'-');
        signZ = z>0? '+' :(z==0?' ':'-');

        System.out.printf("x=%c%d%n",signX,absX);
        System.out.printf("y=%c%d%n",signY,absY);
        System.out.printf("z=%c%d%n",signZ,absZ);
    }
}
