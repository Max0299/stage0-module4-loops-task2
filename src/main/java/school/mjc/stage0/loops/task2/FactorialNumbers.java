package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int count = 1;
        while (count <= printToInclusive){
            result *=count;
            count++;
        }
        System.out.println(result);

    }
}
