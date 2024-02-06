package hw_5_1_1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름, 성별(male/female), 나이를 입력하세요.");
        Person p = new Person(sc.next(), sc.next(), sc.nextInt());
        p.printAll();

        System.out.println("사각형의 가로, 세로를 입력하세요.");
        Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());
        System.out.println("======================");
        System.out.printf("사각형의 넓이 : %d\n", r.area());
        System.out.printf("사각형의 둘레 : %d\n", r.range());
    }
}
