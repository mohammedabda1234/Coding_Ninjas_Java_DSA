package Function;

public class FahrenheitToCelsius {
    public static void printFahrenheitTable(int start, int end, int step) {
        int i, C;
        for (i = start; i <= end; i = i + step) {
            C = ((i - 32) * 5) / 9;
            System.out.println(i + "\t" + C);
        }
    }
    public static void main(String[] args) {
        printFahrenheitTable(0,100,20);
    }
}
