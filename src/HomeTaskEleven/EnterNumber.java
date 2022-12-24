package HomeTaskEleven;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnterNumber.Operator operator = new Operator();
        operator.hello();
        int numberOne = scanner.nextInt();
        int numberTow = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne == numberTow || numberOne == numberThree || numberTow == numberThree) {
            System.out.println("The numbers is repeated");
        } else {
            operator.numbers(numberOne,numberTow,numberThree);
        }
    }

    private static class Operator extends Numbers {
        public void hello() {
            System.out.println("Enter three integers number: ");
        }
        @Override
        public void numbers(int numberOne, int numberTow, int numberThree) {
            super.numbers(numberOne, numberTow, numberThree);
        }

    }
}
