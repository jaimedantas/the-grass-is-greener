package jaimedantas.com.engine;


import jaimedantas.com.domain.Course;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SelectorTest {

    final static long EXECUTIONS = 500000;

    Course A;
    Course B;
    Course C;

    @Before
    public void setUp() {
        A = new Course("A", 0);
        B = new Course("B", 1);
        C = new Course("C", 2);
    }

    @Test
    public void probabilityAllThreeCourses() {
        BigDecimal probabilityA, probabilityB, probabilityC;
        int[] firstTwoChoices;
        List<Integer> secondTwoChoices = new ArrayList<>();
        int firstPickR1, secondPickR2, leftOver;
        long countCourseA = 0,countCourseB = 0, countCourseC = 0;
        Selector selector = new Selector();

        for (int i = 0; i < EXECUTIONS; i++) {
            firstTwoChoices = selector.pickTwo(A.getCode(), B.getCode(), C.getCode());
            secondTwoChoices.add(A.getCode());
            secondTwoChoices.add(B.getCode());
            secondTwoChoices.add(C.getCode());
            //first round
            firstPickR1 = selector.pickOne(firstTwoChoices[0], firstTwoChoices[1]);
            secondTwoChoices.remove(new Integer(firstPickR1));
            //second round
            secondPickR2 = selector.pickOne(secondTwoChoices.get(0), secondTwoChoices.get(1));

            if (firstPickR1 == A.getCode() || secondPickR2 == A.getCode()) {
                countCourseA++;
            }
            if (firstPickR1 == B.getCode() || secondPickR2 == B.getCode()) {
                countCourseB++;
            }
            if (firstPickR1 == C.getCode() || secondPickR2 == C.getCode()) {
                countCourseC++;
            }
            secondTwoChoices.clear();
        }
        long denominator = EXECUTIONS * 2; //since the student picks two courses

        probabilityA = Calculator.divide(countCourseA, denominator);
        probabilityB = Calculator.divide(countCourseB, denominator);
        probabilityC = Calculator.divide(countCourseC, denominator);

        assertEquals(new BigDecimal("0.333"), probabilityA);
        assertEquals(new BigDecimal("0.333"), probabilityB);
        assertEquals(new BigDecimal("0.333"), probabilityC);
    }
}









