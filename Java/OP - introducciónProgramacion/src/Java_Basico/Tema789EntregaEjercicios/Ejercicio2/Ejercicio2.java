package Java_Basico.Tema789EntregaEjercicios.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
        };

        //Get row numbers
        int rows = numbers.length;
        //Get column numbers
        int columns = numbers[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Position " + i + " " + j + " : " + numbers[i][j]);
            }
        }

    }
}
