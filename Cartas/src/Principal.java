import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UNIFAN - FACULDADE ALFREDO NASSER");
        System.out.println("Professor:Ricardo");
        System.out.println("========================================");
        Scanner scanner = new Scanner(System.in);
        int[] cartas = new int[7];

        System.out.println("Digite 7 valores:");

        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = scanner.nextInt();
        }

        System.out.println("Array desordenado");
        for (int imprimir : cartas) {
            System.out.print("["+imprimir+"]" + " ");
        }
        System.out.println("\n");

        System.out.println("Iniciando o Insertion Sort: \n");

        for (int i = 1; i < cartas.length; i++) {
            int aux = cartas[i];
            int j = i - 1;

            while (j >= 0 && cartas[j] > aux) {
                cartas[j + 1] = cartas[j];
                j = j - 1;
            }
            cartas[j + 1] = aux;

            System.out.println("Array a cada iteração " + i + ":");
            for (int imprimir : cartas) {
                System.out.print("["+imprimir+"]" + " ");
            }
            System.out.println("\n");

        }
        System.out.println("Array ordenado");
        for (int imprimir : cartas) {
            System.out.print("["+imprimir+"]" + " ");
        }
    }
}