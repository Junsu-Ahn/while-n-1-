import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int num_list[] = {12, 4, 15, 1, 14};
        // answer = 11
        int answer = Arrays.stream(num_list).map(i->Integer.toBinaryString(i).length()-1).sum();
        System.out.println(answer);
    }
}