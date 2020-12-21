import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[]circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(10.5,"Red");
        circles[1]=new ComparableCircle(9,"Yellow");
        circles[2]=new ComparableCircle(6,"Blue");
        System.out.println("Pre-sorted:");
        for (ComparableCircle c:
             circles) {
            System.out.println(c);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComparableCircle b:
             circles) {
            System.out.println(b);
        }
    }
}
