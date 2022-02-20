/*
Diseña un TDA que permita construir objetos que almacenen una matriz CUADRADA. El constructor de la clase recibirá un ENTERO indicando el tamaño de RENGLONES Y COLUMNAS que se deberá construir. 
Las operaciones y comportamiento es el siguiente:
- obtenerTriangularSuperior: retorna una matriz de NxN (del mismo tamaño que la original) pero solo parte triangular superior, entendiendo los valores que incluyen la diagonal principal y lo que esté arriba de esta.
- obtenerTriangunarSuperiorInversa: retorna una matriz de NxN (mismo tamaño original) pero que solo contiene los valores de la diagonal invertida y los elementos que se encuentran arriba de ésta.
- obtenerTriangunarInferior: retorna una matriz de NxN (del mismo tamaño que la original) pero solo parte triangular interior, entendiendo los valores que incluyen la diagonal principal y lo que esté abajo de esta.
- obtenerTriangunarInferiorInversa: retorna una matriz de NxN (mismo tamaño original) pero que solo contiene los valores de la diagonal invertida y los elementos que se encuentran abajo de ésta.
L- obtenerDiagonal: retorna los valores de la diagonal principal en formato de vector.
F- obtienerDiagonalInvertida: retorna los valores de la diagonal invertida en formato de vector.
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
    
    return MatrizT;
}
//retorna una matriz de NxN (del mismo tamaño que la original) pero solo parte triangular superior, entendiendo los valores que incluyen la diagonal principal y lo que esté arriba de esta.

public int[][] obtenerTriangunarSuperiorInversa(){
    return MatrizT;
}
//retorna una matriz de NxN (mismo tamaño original) pero que solo contiene los valores de la diagonal invertida y los elementos que se encuentran arriba de ésta.

public int[][] obtenerTriangunarInferior(){
    return MatrizT;
}
//retorna una matriz de NxN (del mismo tamaño que la original) pero solo parte triangular interior, entendiendo los valores que incluyen la diagonal principal y lo que esté abajo de esta.

public int [][] obtenerTriangunarInferiorInversa(){
    return MatrizT;
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
    int[] dInver = new int[Tam];
    for (int i = 0; i < Tam; i++) {
        int j = Tam-1;
        dInver[j]=MatrizT[i][i];
        j--;
    }
    return dInver;
}
//retorna los valores de la diagonal invertida en formato de vector.
}
