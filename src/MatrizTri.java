/*
Diseña un TDA que permita construir objetos que almacenen una matriz CUADRADA. El constructor de la clase recibirá un ENTERO indicando el tamaño de RENGLONES Y COLUMNAS que se deberá construir. 
Las operaciones y comportamiento es el siguiente:
L- obtenerTriangularSuperior: retorna una matriz de NxN (del mismo tamaño que la original) pero solo parte triangular superior, entendiendo los valores que incluyen la diagonal principal y lo que esté arriba de esta.
FV- obtenerTriangunarSuperiorInversa: retorna una matriz de NxN (mismo tamaño original) pero que solo contiene los valores de la diagonal invertida y los elementos que se encuentran arriba de ésta.
L- obtenerTriangunarInferior: retorna una matriz de NxN (del mismo tamaño que la original) pero solo parte triangular interior, entendiendo los valores que incluyen la diagonal principal y lo que esté abajo de esta.
FV- obtenerTriangunarInferiorInversa: retorna una matriz de NxN (mismo tamaño original) pero que solo contiene los valores de la diagonal invertida y los elementos que se encuentran abajo de ésta.
L- obtenerDiagonal: retorna los valores de la diagonal principal en formato de vector.
L- obtienerDiagonalInvertida: retorna los valores de la diagonal invertida en formato de vector.
 */

/**
 *
 * @author isidroAntonio
 */
public class MatrizTri {
    private int[][] MatrizT;
    private int Tam;
    
    //Construye una matriz cuadrada
    public MatrizTri(int tam) {
       Tam=tam;
       MatrizT=new int[Tam][Tam];
    }

    //Get y set 
    public int[][] getMatrizT() {
        return MatrizT;
    }
    public void setMatrizT(int[][] MatrizT) {
        this.MatrizT = MatrizT;
    }
    public int getTam() {
        return Tam;
    }
    public void setTam(int Tam) {
        this.Tam = Tam;
    }
    
    //Operacioness y comportamientos de la matriz
    public int[][]obtenerTriangularSuperior(){
        int [][] matrizTS = new int [Tam][Tam];//Genera una nueva matriz con las mismas mediada que la original
        for (int i = Tam-1; i >= 0; i--) {//Comienza con el tamaño de la matriz, y lo va reduciedo cada ciclo
            for (int j = 0; j < Tam; j++) {//Comienza en 0 y va aumentando su valor hasta hacercarce al tamaño de la matriz original
                matrizTS[j][i]=MatrizT[j][i]; 
            }
            Tam--;//Reduce la variable Tam para que el segundo for comience a construir la matriz triangular
        }
        return matrizTS;
    }

    public int[][] obtenerTriangularSuperiorInversa(){
        int[][] originalM = obtenerTriangularSuperior();
        int[][] mInversa = new int[Tam][Tam];
               for(int i=0;i<Tam;i++)
                   for(int j=0;j<Tam;j++)
                       mInversa[i][j]=originalM[j][i];
           return mInversa;
    }
    //retorna una matriz de NxN (mismo tamaño original) pero que solo contiene los valores de la diagonal invertida y los elementos que se encuentran arriba de ésta.

    public int[][] obtenerTriangularInferior(){
        int [][] matrizTS = new int [Tam][Tam];
        for (int i = Tam-1; i >= 0; i--) {
            for (int j = 0; j < Tam; j++) {
                matrizTS[i][j]=MatrizT[i][j]; 
            }
            Tam--;
        }
        return matrizTS;
    }

    public int [][] obtenerTriangunarInferiorInversa(){
        int[][] originalM = obtenerTriangularInferior();
        int[][] mInversa = new int[Tam][Tam];
               for(int i=0;i<Tam;i++)
                   for(int j=0;j<Tam;j++)
                       mInversa[i][j]=originalM[j][i];
           return mInversa;
    }
    //retorna una matriz de NxN (mismo tamaño original) pero que solo contiene los valores de la diagonal invertida y los elementos que se encuentran abajo de ésta.

    public int[] obtenerDiagonal(){
        int[] d = new int[Tam];
        for (int i = 0; i < Tam; i++) {
            d[i]=MatrizT[i][i];
        }
        return d;
    }
    //retorna los valores de la diagonal principal en formato de vector.

    public int[] obtienerDiagonalInvertida(){
        int[] dInver = obtenerDiagonal();
        for (int i = 0; i < Tam/2; i++) {
            int aux = dInver[i];
            int finD = Tam-i-1;
            dInver[i]=dInver[finD];
            dInver[finD]=aux;
        }
        return dInver;
    }
}
