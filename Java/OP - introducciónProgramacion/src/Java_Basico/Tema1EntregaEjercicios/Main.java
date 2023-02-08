package Java_Basico.Tema1EntregaEjercicios;

public class Main {
    //Datos primitivos
    static byte _byte = 0;
    static short _short = 1;
    static int _int = 2;
    static long _long = 3;
    static boolean _boolean = true;
    static float _float = (float) 20.1;
    static double _double = 4.5;
    static char _char = 'a';

    //Datos no primitivos
    static Byte _Byte = 0;
    static Short _Short = 1;
    static Integer _Int = 2;
    static Long _Long = (long) 3;
    static  Boolean _Boolean = true;
    static  Float _Float = (float) 20.1;
    static  Double _Double = 4.5;
    static Character _Char = 'a';

    public static void main(String[] args) {
        imprimirDatos();
    }

    public static void imprimirDatos(){

        System.out.println("Primitivos");

        System.out.println(_byte);
        System.out.println(_short);
        System.out.println(_int);
        System.out.println(_long);
        System.out.println(_boolean);
        System.out.println(_float);
        System.out.println(_double);
        System.out.println(_char);
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("No primitivos");

        System.out.println(_Byte);
        System.out.println(_Short);
        System.out.println(_Int);
        System.out.println(_Long);
        System.out.println(_Boolean);
        System.out.println(_Float);
        System.out.println(_Double);
        System.out.println(_Char);

    }

}
