package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {

        int even = 1;
        while (even <= printTillInclusive){
            if(even % 2 == 0){
                System.out.println(even);
            }
            even++;
        }
    }
}
