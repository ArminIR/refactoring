public class NumberOperations {
    public static void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    public static void calculateVolume(int side) {
        int volume = side * side * side;
        System.out.println("Volume of cube: " + volume);
    }

    public static void main(String[] args) {
        int side = 5;
        calculateArea(side);
        calculateVolume(side);
    }
}

public class NumberOperations {
    public void printNumberInfo(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is not a positive number.");
        }

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        NumberOperations operations = new NumberOperations();
        operations.printNumberInfo(5);
        operations.printNumberInfo(-8);
    }
}


