package Loop_II;

import java.util.Scanner;

class Solution{
    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        int a, b, n;
        for(int i=0; i < q ; i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();

            printResult(q, a, b, n);
            System.out.println();
        }
        in.close();
    }

    public static double printResult( int q, int a, int b, int n ){

        boolean isQIntoRange = q >= 0 && q <= 500;
        boolean isAIntoRange = a >= 0 && a <= 50;
        boolean isBIntoRange = b >= 0 && b <= 50;
        boolean isNIntoRange = n >= 1 && n <= 15;
        boolean canMakeOperation = isQIntoRange && isAIntoRange && isBIntoRange && isNIntoRange;

        double result = 0;

        if ( canMakeOperation ){

            result = a + Math.pow(2, 0) * b;
            System.out.print( ( int ) result + " " );


            for ( int i = 1; i < n; i++ ){

                result += Math.pow(2, i) * b;

                System.out.print( ( int ) result + " " );
            }

        }


        return result;
    }

}
