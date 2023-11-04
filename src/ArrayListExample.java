import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(120);
        list.add(1234);

        list.set(2,320);
        System.out.print(list);

        list.remove(0);
        System.out.print(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
