package jaimedantas.com.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Selector {

    public int pickOne(int a, int b){
        Random r = new Random();
        return r.nextBoolean() ? a : b;
    }

    public int[] pickTwo(int a, int b, int c){
        int selection;
        List<Integer> currentInput = new ArrayList<>();
        currentInput.add(a);
        currentInput.add(b);
        currentInput.add(c);
        int[] choices = new int[2];
        int r = new Random().nextInt(3);
        switch (r) {
            case 0:
                selection = currentInput.get(0);
                currentInput.remove(0);
                break;
            case 1:
                selection = currentInput.get(1);
                currentInput.remove(1);
                break;
            case 2:
                selection = currentInput.get(2);
                currentInput.remove(2);
                break;
            default:
                selection = -1;
        }
        choices[0] = selection;
        choices[1] = this.pickOne(currentInput.get(0),currentInput.get(1));
        return choices;
    }

}
