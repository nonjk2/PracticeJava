package ifforwhile;

import java.util.Scanner;
import java.util.Stack;

public class DoWhile {
    public static void main(String[] args) { //do-while을 이용한 스무고개 (stack사용)
        int input = 0, answer = 0;
        answer = (int)(Math.random()*100) +1;
        Scanner scanner = new Scanner(System.in);
        Stack<Count> stack = new Stack<>();
        int count = 1;



        do{
            System.out.print("1과 100사이의 정수를 입력하세요");
              //  System.out.println(answer);
            input = scanner.nextInt();
            if (stack.size()<7) {
                if (input > answer) {
                    System.out.println("더작은수로 다시 시도해보세요");
                    stack.push(new Count(count,input));
                    System.out.println("남은기회:" + (7 - stack.size()));
                } else if (input < answer) {
                    System.out.println("더 큰수로 다시 시도해보세요");
                    stack.push(new Count(count,input));
                    System.out.println("남은기회:" + (7 - stack.size()));
                }
            }else {
                System.out.println("남은기회가 없습니다 처음부터 다시시도하세요");
                break;
            }
            count++;
        }while (input!=answer);

        if (input==answer) {
            System.out.println(answer+" 정답입니다.");
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" 오답입니다");
        }
    }
    static class Count{

        int count;
        int input;

        @Override
        public String toString() {
            return count + "번째    "  + " 제출= " +  input ;
        }

        public Count(int count, int input){
            this.count = count;
            this.input = input;

        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getInput() {
            return input;
        }

        public void setInput(int input) {
            this.input = input;
        }
    }

}
