package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int first =  number / 1000;
        int two = (number/ 100) % 10;

        int three = (number / 10) % 10;
        int four = number % 10;

        System.out.println(first + two + three + four);

    }
}