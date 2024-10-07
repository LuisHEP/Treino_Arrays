import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        Sem biblioteca Java

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número na posição " + i + ": " + numeros[i]);
        }

//        Com biblioteca Arrays

        int[] numeroArray = {5, 7, 8, 1, 2};

        System.out.println("Array: " + Arrays.toString(numeroArray));

        Arrays.sort(numeroArray);

        System.out.println("Array ordenado: " + Arrays.toString(numeroArray));

        int chave = 10;
        int indice = Arrays.binarySearch(numeroArray, chave);

        if (indice >= 0) {
            System.out.println("Número " + chave + " encontrado na posição: " + indice);
        } else {
            System.out.println("Número " + chave + " não encontrado");
        }
        }
    }
