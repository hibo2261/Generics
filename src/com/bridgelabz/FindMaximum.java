
package com.bridgelabz;

public class FindMaximum {

    /**
     *
     *  a value is set to max
     *  b value is compared
     *  c value is  compared
     *  maximum of three integer is returned
     */

    public static Integer toPrintMax(Integer a ,Integer b,Integer c) {

        Integer max = a;

        if(b.compareTo(max) > 0 )
            max = b;

        if(c.compareTo(max) > 0 )
            max = c;
        return max;

    }

}