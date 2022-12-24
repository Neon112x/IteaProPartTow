package HomeTaskEleven;

public class Numbers {

    public void numbers(int numberOne, int numberTow, int numberThree) {
        int min = minimumNumber(numberOne, numberTow, numberThree);
        int avg = avgNumber(numberOne, numberTow, numberThree);
        int max = maxNumber(numberOne, numberTow, numberThree);
        System.out.println("Min number = " + min + ", AVG number = " + avg + ", Max number = " + max);
    }

    private int minimumNumber (int numberOne, int numberTow, int numberThree) {
        int minNumber = Math.min(numberOne, numberTow);
        minNumber = Math.min(minNumber,numberThree);
        return minNumber;
    }

    private int maxNumber(int numberOne, int numberTow, int numberThree) {
        int maxNumber = Math.max(numberOne, numberTow);
        maxNumber = Math.max(maxNumber,numberThree);
        return maxNumber;
    }

    private int avgNumber (int numberOne, int numberTow, int numberThree) {
        int avgNumber = -1;
        int maxNumber = maxNumber(numberOne, numberTow, numberThree);
        int minimumNumber = minimumNumber(numberOne, numberTow, numberThree);

        if (numberOne == minimumNumber) {
            avgNumber = Math.min(numberTow,numberThree);
        } else if (numberOne == maxNumber) {
            avgNumber = Math.max(numberTow, numberThree);
        } else {
            avgNumber = numberOne;
        }

        return avgNumber;
    }
}
