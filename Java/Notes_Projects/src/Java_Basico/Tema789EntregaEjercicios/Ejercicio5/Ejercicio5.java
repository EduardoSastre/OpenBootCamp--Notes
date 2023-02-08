package Java_Basico.Tema789EntregaEjercicios.Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        LinkedList<String> listCopy = new LinkedList<String>();

        for( int i = 0; i < list.size(); i++ ){
            listCopy.add( list.get(i) );
        }

        //Show ArrayList
        System.out.println( "ArrayList" );
        for( String item : list ){
            System.out.println( item );
        }

        //Show LinkedList
        System.out.println( "LinkedList" );
        for( String item : listCopy ){
            System.out.println( item );
        }

    }
}
