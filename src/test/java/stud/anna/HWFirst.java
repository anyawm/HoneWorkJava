package stud.anna;

import org.junit.jupiter.api.Test;



public class HWFirst {
    @Test
     void math () {

        byte num1 = 127;
        byte num2 = ++num1;
        System.out.println("Результат: " + num2);
    }

    @Test
    void error () {

        byte num3 = 127;
        byte result = num3*3;
        System.out.println(result);
    }


    @Test
    void count() {

        int d = 13;
        int c = ((d*9)+(d/2));
        System.out.println(c);
    }
    @Test
    void point() {

        float r = 0.13f;
        double j = 13.47d;
        System.out.println(r+j);
    }

    }



