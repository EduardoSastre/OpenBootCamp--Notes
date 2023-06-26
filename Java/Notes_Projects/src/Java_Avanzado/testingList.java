package Java_Avanzado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testingList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, null);
        List<Integer> list2 = new ArrayList( list );
        list2.add(4);

        System.out.println( list2 );

    }

}
