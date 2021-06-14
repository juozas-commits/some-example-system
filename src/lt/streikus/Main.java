package lt.streikus;

public class Main {
    public static void main(String[] args){
        int x1 = 5;
        int x2 = 15;

        int y1 = 10;
        int y2 = 20;

        double xDifference = Math.pow((x2 - x1), 2);
        double yDifference = Math.pow((y2 - y1), 2);
        double result = Math.sqrt(xDifference + yDifference);
        System.out.println(result);
    }
}
