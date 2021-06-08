package pl.anril;

public class Test {
    public static void main(String[] args) {
        area(2, 5);
    }

    public static void area(int width, int height) {
        System.out.println("width = "+width+", height = "+height);
    }

    public static String isVacationTime(Boolean onMyVacation) {
        return onMyVacation? "I'm on vacation": "I'm working";
    }
    
    public static void printArray(int[] numbers) {
        for (int number: numbers) {
            System.out.println("number = " + number);
        }
    }
}
