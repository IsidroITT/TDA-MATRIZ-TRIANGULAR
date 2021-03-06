import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author isidro
 */
public class Ventana extends javax.swing.JFrame {
    //Variables de programa ventana
public DefaultTableModel MatrizT;
public DefaultTableModel NuevaMatriz;
public MatrizTri matrizTri;
public boolean operaciones;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        MatrizT=(DefaultTableModel)tblMatrizT.getModel();
        NuevaMatriz=(DefaultTableModel)tblNuevaMatriz.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizT = new javax.swing.JTable();
        txtMatrizTam = new javax.swing.JTextField();
        lblMatrizOrignial = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNuevaMatriz = new javax.swing.JTable();
        lblNuevaMatriz = new javax.swing.JLabel();
        btnMTriS = new javax.swing.JButton();
        btnMTriSInver = new javax.swing.JButton();
        btnMTriInf = new javax.swing.JButton();
        btnMTriInfInver = new javax.swing.JButton();
        btnDiagonal = new javax.swing.JButton();
        btnDiagInver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        tblMatrizT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatrizT);

        lblMatrizOrignial.setText("Matriz Original");

        tblNuevaMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblNuevaMatriz);

        lblNuevaMatriz.setText("Nueva Matriz");

        btnMTriS.setText("M triangular sup");
        btnMTriS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTriSActionPerformed(evt);
            }
        });

        btnMTriSInver.setText("M triangular sup Inversa");
        btnMTriSInver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTriSInverActionPerformed(evt);
            }
        });

        btnMTriInf.setText("M triangular inf");
        btnMTriInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTriInfActionPerformed(evt);
            }
        });

        btnMTriInfInver.setText("M triangular inf Inversa");
        btnMTriInfInver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTriInfInverActionPerformed(evt);
            }
        });

        btnDiagonal.setText("Diagonal");
        btnDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonalActionPerformed(evt);
            }
        });

        btnDiagInver.setText("Diagonal inversa");
        btnDiagInver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(txtMatrizTam, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnIniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMTriSInver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMTriS, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMTriInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMTriInfInver, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDiagInver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(lblMatrizOrignial)))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblNuevaMatriz)
                                .addGap(140, 140, 140)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(txtMatrizTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMTriS)
                    .addComponent(btnDiagonal)
                    .addComponent(btnMTriInf))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMTriSInver)
                    .addComponent(btnMTriInfInver)
                    .addComponent(btnDiagInver))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMatrizOrignial)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNuevaMatriz)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton de iniciar la matriz
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
       //Inicia la matriz con tama??o n, la construye con numeros random, y la muestra pantalla con una tabla
       try{ 
       int tam=Integer.parseInt(txtMatrizTam.getText());
        matrizTri=new MatrizTri(tam);
       }catch(NumberFormatException e){
           showMessageDialog(this,"Solo puedes ingresar numeros en una matriz");
       }
        MatrizT.setColumnCount(matrizTri.getTam());
        MatrizT.setRowCount(matrizTri.getTam());
            
            for (int i = 0; i < matrizTri.getTam(); i++) {
                for (int j = 0; j < matrizTri.getTam(); j++) {
                    matrizTri.getMatrizT()[i][j]=(int)(Math.random()*100);
                    MatrizT.setValueAt(matrizTri.getMatrizT()[i][j], i, j);
                }
             }
         operaciones=true;
    }//GEN-LAST:event_btnIniciarActionPerformed

    //Boton de Matriz triangular inferior inversa
    private void btnMTriInfInverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTriInfInverActionPerformed
        if(operaciones){
            int [][] mTII=matrizTri.obtenerTriangunarInferiorInversa();
            MostrarMatriz(NuevaMatriz,mTII);
        }else
            showMessageDialog(this,"No es posible mostrar la matriztriangular superior, primero inicie un a matriz");
    }//GEN-LAST:event_btnMTriInfInverActionPerformed

 //Boton de diagonal invertida
    private void btnDiagInverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInverActionPerformed
        if(operaciones){
            int [] diagonalInver=matrizTri.obtienerDiagonalInvertida();
            MostrarDiagonal(NuevaMatriz,diagonalInver);
        }else
            showMessageDialog(this,"No es posible mostrar la diagonal inversa si no existe una matriz");
    }//GEN-LAST:event_btnDiagInverActionPerformed

    //Boton de diagonal
    private void btnDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonalActionPerformed
        if(operaciones){
            int [] diagonal=matrizTri.obtenerDiagonal();
            MostrarDiagonal(NuevaMatriz,diagonal);
        }else
            showMessageDialog(this,"No es posible mostrar la diagonal si no existe una matriz");
    }//GEN-LAST:event_btnDiagonalActionPerformed

    //Boton de matriz triangular superior
    private void btnMTriSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTriSActionPerformed
        if(operaciones){
            int [][] mTS=matrizTri.obtenerTriangularSuperior();
            MostrarMatriz(NuevaMatriz,mTS);
        }else
            showMessageDialog(this,"No es posible mostrar la matriztriangular superior, primero inicie un a matriz");
    }//GEN-LAST:event_btnMTriSActionPerformed

    //Boton de matriz triangular inferior
    private void btnMTriInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTriInfActionPerformed
        if(operaciones){
            int [][] mTI=matrizTri.obtenerTriangularInferior();
            MostrarMatriz(NuevaMatriz,mTI);
        }else
            showMessageDialog(this,"No es posible mostrar la matriz triangular inferior, primero inicie un a matriz");
    }//GEN-LAST:event_btnMTriInfActionPerformed

    //Boton de matriz triangular superior invertida
    private void btnMTriSInverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTriSInverActionPerformed
        if(operaciones){
            int [][] mTS=matrizTri.obtenerTriangularSuperiorInversa();
            MostrarMatriz(NuevaMatriz,mTS);
        }else
            showMessageDialog(this,"No es posible mostrar la matriztriangular superior, primero inicie un a matriz");
    }//GEN-LAST:event_btnMTriSInverActionPerformed
    
    //Metodo para construir las tablas con los valores de la matriz
    public void MostrarMatriz(DefaultTableModel tabla, int[][] matriz){
             tabla.setColumnCount(matriz.length);
             tabla.setRowCount(matriz.length);
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    tabla.setValueAt(matriz[i][j], i, j);
                }
             }
    }
    
    //Similar a MostraraMatriz, pero muestra los valores de la diagonal, en la primera fila
    public void MostrarDiagonal(DefaultTableModel tabla, int[] matriz){
             tabla.setColumnCount(matriz.length);
             tabla.setRowCount(1);
            
            for (int i = 0; i < matriz.length; i++) {
                    tabla.setValueAt(matriz[i], 0, i);
             }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagInver;
    private javax.swing.JButton btnDiagonal;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMTriInf;
    private javax.swing.JButton btnMTriInfInver;
    private javax.swing.JButton btnMTriS;
    private javax.swing.JButton btnMTriSInver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMatrizOrignial;
    private javax.swing.JLabel lblNuevaMatriz;
    private javax.swing.JTable tblMatrizT;
    private javax.swing.JTable tblNuevaMatriz;
    private javax.swing.JTextField txtMatrizTam;
    // End of variables declaration//GEN-END:variables
}
