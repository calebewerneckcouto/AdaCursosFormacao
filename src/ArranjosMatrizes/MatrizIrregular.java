package ArranjosMatrizes;

public class MatrizIrregular {
    public static void main(String[] args) {
        int[][] irregular = new int[3][]; 
        irregular[0] = new int[2]; // 2 colunas na 1ª linha
        irregular[1] = new int[4]; // 4 colunas na 2ª linha
        irregular[2] = new int[3]; // 3 colunas na 3ª linha

        // Preencher e mostrar
        int valor = 1;
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                irregular[i][j] = valor++;
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
