package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        while (num <= printToInclusive) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i != 0) {
                    System.out.println(num);
                }
            }
            num++;
        }
    }
}
