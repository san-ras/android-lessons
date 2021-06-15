package lt.raslane;

public class Main {

    public static void main(String[] args) {

        int x1 = 5; // (5; 15)
        int y1 = 15;

        int x2 = 10; // (10; 20)
        int y2 = 20;

        double v = Math.pow((x2 - x1), 2);
        double v1 = Math.pow((y2 - y1), 2);
        double result = Math.sqrt(v + v1);

        System.out.println(result);


    }
}
