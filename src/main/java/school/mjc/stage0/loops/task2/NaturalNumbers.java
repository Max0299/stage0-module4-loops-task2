package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {

        int natural = 1;

        while (natural <= lastPrinted){
            System.out.println(natural);
            natural++;
        }
    }
}
