package ArraysAndLoops_2;

public class Test {
    public static void main(String[] args) {
        int circle[] = new int[10];
        int sum = 0;
        circle[1] = 10;
        circle[2] = 20;
        circle[3] = 20;
        circle[4] = 14;
        circle[5] = 13;
        circle[6] = 15;
        circle[7] = 16;
        circle[8] = 16;
        circle[9] = 16;
        circle[0] = 2;
        for (int i = 0; i < 10; i++ ){
            sum += circle[i];
        }
        System.out.println(sum);

    }
}
