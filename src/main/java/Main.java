public class Main {
    public static void main(String[] args) {
        //Vetores

        int vetor[] = new int[4];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int vetor1[] = new int[20];

        for (int a = 0; a < vetor1.length; a++) {
            vetor1[a] = a + 1;

        }
        for (int a = 0; a < vetor1.length; a++) {
            System.out.println(vetor1[a]);

        }

        int matriz[][] = new int[10][10];

        for (int b = 0; b < 10; b++) {
            for (int c = 0; c < 10; c++) {
                matriz[b][c] = b + c;
            }
        }
        for (int b = 0; b < 10; b++) {
            for (int c = 0; c < 10; c++) {
                System.out.println(matriz[b][c]);

            }
        }

        String texto = "Hiroshi Onishi Silva Sauro ";
        String palavra = "";
        char caracter;

        for (int d = 0; d < texto.length(); d++) {
            caracter = texto.charAt(d);
            if (caracter == ' ') {
                System.out.println("É um espaço");
                System.out.println(palavra);
                palavra = "";
            } else {
                palavra += caracter;
            }

        }

    }

}
