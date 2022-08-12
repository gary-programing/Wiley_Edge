import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {
        Scanner pos = new Scanner(System.in);
        System.out.println("what position would you like to find");
        int Pos = pos.nextInt();
        int result = getItem(Pos);
        System.out.println("result = " + result);
    }

    private static int getItem(int pos) {
        int i = 1;
        int current_pos = 1;
        int previous_pos = 0;
        int next_pos = 0;

        while (i < pos) {
            next_pos = current_pos+previous_pos;
            previous_pos = current_pos;
            current_pos = next_pos;

            i++;
        }
        return current_pos;
    }
}
