/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class PaS extends javax.swing.JFrame {

    /**
     * Creates new form PaS
     */
    public PaS() {
        initComponents();
        setLocationRelativeTo(null); //funcion para mostrar en el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnPaS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese  la proposición");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Conversion a Símbolos");

        btnPaS.setText("Convertir");
        btnPaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaSActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(238, 238, 238))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(btnPaS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnPaS)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Presentacion mover = new Presentacion();
        mover.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnPaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaSActionPerformed
        
        String oracion = jTextArea1.getText().trim();
        
        oracion = capitalizar(oracion);
        
        //palabras clave a buscar en la oracion
        String negacion = "No "; // Declaramos la negacion para buscarla
        String conjuncion1 = "Y "; // Declaramos la conjuncion para buscarla
        String conjuncion2 = "E ";// Declaramos la conjucion2 para buscarla
        String disyuncion1 = "O ";// Declaramos la disyuncion para buscarla
        String disyuncion2 = "U ";// Declaramos la disyuncion para buscarla
        String condicional1 = "Si ";// Declaramos la condicional para buscarla
        String condicional2 = " , Entonces ";// Declaramos la condicional para buscarla
        String condicional3 = " Implica  ";// Declaramos la condicional para buscarla
        String Bicondicional1 = " Si Y Solo Si ";// Declaramos la bicondicionla para buscarlo
        String Bicondicional2 = " Es Necesario Y Suficiente Para ";// Declaramos la bicondicionla para buscarlo
        String Bicondicional3 = " Es Equivalente A ";// Declaramos la bicondicionla para buscarlo
        
        /*
        Creamos un objeto de la clase string builder con el tamanio de la entrada por teclado
        esta es la variable que guarda la oracioningresada por el usuario ya capitalizada, es decir
        ya se convirtio la primera letra de cada palabra en mayuscula
         */
        StringBuilder Proposicion = new StringBuilder (oracion);

        /*
        Usando la funcion idexOf de String Builder buscamos cada palabra clave que queremos pasandola como parametro
        y guardamos la posicion en la que se encuentra en una variable entera, si no existe retorna un -1
         */
        int PosicionNo = Proposicion.indexOf(negacion);
        int PosicionY = Proposicion.indexOf(conjuncion1);
        int PosicionE = Proposicion.indexOf(conjuncion2);
        int PosicionO =  Proposicion.indexOf(disyuncion1);
        int PosicionU =  Proposicion.indexOf(disyuncion2);
        int  Posicionsi =  Proposicion.indexOf(condicional1);
        int  Posicionentonces =  Proposicion.indexOf(condicional2);
        int  PosicionImplica =  Proposicion.indexOf(condicional3);
        int PosicionSiYSoloSI = Proposicion.indexOf(Bicondicional1);
        int PosicionEsNecesario = Proposicion.indexOf(Bicondicional2);
        int PosicionEsEquivalente = Proposicion.indexOf(Bicondicional3);
        
        // Creamos Variables para la impresion de la preposiciones y operadores en simbolos
        String p1="", proposicion = "" ,q1 = "" ;

        /*
            La funcion split sirve para separar una cadena, en este caso la separamos con espacios " "
            pone un espacio despues de una palabra, guardará los espacios dentro del string entradaTeclado
         */
        String [] stringArray= oracion.split(" ");

        /* Creamos las variables de las preposciones del tamanio del la oracion de entrada con StringBuilder para poder
        manipular cada char del String y usar las funciones para eliminar un caracter especifico*/
        StringBuilder p = new StringBuilder (oracion);
        StringBuilder q = new StringBuilder (oracion);
        StringBuilder negp = new StringBuilder (oracion);
        
        int tamanoArre = Proposicion.length();

        for(int j=0; j < stringArray.length;){

            if((PosicionSiYSoloSI != -1) || (PosicionEsNecesario != -1) || (PosicionEsEquivalente != -1)) {
                //BLOQUE BICONDICIONAL  ↔
                if(PosicionSiYSoloSI == 0 || PosicionEsNecesario == 0 || PosicionEsEquivalente == 0) {
                    q.replace(0, tamanoArre, "Esta mal redactada la proposicion ");
                    p1 = "Mal ";
                    proposicion = "Redacatada" ;
                    q1 =  "o";
                }else if (PosicionSiYSoloSI != -1){
	        		/* For 1ra preposicion antes del No
	        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionSiYSoloSI ; k++) {
                        p = p.deleteCharAt(PosicionSiYSoloSI); // a P le asignamos el valor de p y le quitamos el sy y solo si
                    }
	        		/* For 2da preposicion despues del NO
	        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionSiYSoloSI + 14 ; l++) {
                        q = q.deleteCharAt(0);
                    }
	        		/* For negacion de q
	        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionSiYSoloSI ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 14 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionSiYSoloSI);
                    }

                    p1= "p";
                    q1 = "q";
                    proposicion = "↔";

                }else if (PosicionEsNecesario != -1){
	        		/* For 1ra preposicion antes del No
	        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionEsNecesario ; k++) {
                        p = p.deleteCharAt(PosicionEsNecesario);
                    }
	        		/* For 2da preposicion despues del NO
	        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionEsNecesario + 24 ; l++) {
                        q = q.deleteCharAt(0);
                    }
	        		/* For negacion de q
	        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionEsNecesario ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 24 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionEsNecesario);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "↔";
                }else if (PosicionEsEquivalente != -1){
	        		/* For 1ra preposicion antes del No
	        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionEsEquivalente ; k++) {
                        p = p.deleteCharAt(PosicionEsEquivalente);
                    }
	        		/* For 2da preposicion despues del NO
	        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionEsEquivalente + 18 ; l++) {
                        q = q.deleteCharAt(0);
                    }
	        		/* For negacion de q
	        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionEsEquivalente ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 18 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionEsEquivalente);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "↔";
                }
            }else if (PosicionY != -1 || PosicionE != -1) {
                // BLOQUE CONJUNCION
                // Errror y/o van de primero
                if(PosicionY == 0 && PosicionE == 0) {
                    q.replace(0, tamanoArre, "Y/E no pueden estar primero en la proposicion ");
                    p1 = "Y/E no pueden ";
                    proposicion = "estar primero" ;
                    q1 =  "en la proposicion ";
                } else if (PosicionY != -1){
		        		/* For 1ra preposicion antes del No
		        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionY ; k++) {
                        p = p.deleteCharAt(PosicionY);
                    }
		        		/* For 2da preposicion despues del NO
		        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionY + 2 ; l++) {
                        q = q.deleteCharAt(0);
                    }
		        		/* For negacion de q
		        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionY ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 2 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionY);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "∧";
                }else if (PosicionE != -1) {
		        		/* For 1ra preposicion antes del No
		        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionE ; k++) {
                        p = p.deleteCharAt(PosicionY);
                    }
		        		/* For 2da preposicion despues del NO
		        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionE + 2 ; l++) {
                        q = q.deleteCharAt(0);
                    }
		        		/* For negacion de q
		        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionE ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 2 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionE);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "∧";
                }
            }else if (PosicionO  != -1 || PosicionU != -1) {
                // BLOQUE DISYUNCION ∨
                if(PosicionO == 0 && PosicionU == 0) {
                    q.replace(0, tamanoArre, "O/U no pueden estar primero en la proposicion ");
                    p1 = "U/O no pueden ";
                    proposicion = "estar primero" ;
                    q1 =  "en la proposicion ";
                } else if (PosicionO != -1){
		        		/* For 1ra preposicion antes del No
		        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionO ; k++) {
                        p = p.deleteCharAt(PosicionO);
                    }
		        		/* For 2da preposicion despues del NO
		        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionO + 2 ; l++) {
                        q = q.deleteCharAt(0);
                    }
		        		/* For negacion de q
		        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionO ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 2 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionO);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "∨";
                }else if (PosicionU != -1) {
		        		/* For 1ra preposicion antes del No
		        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionU ; k++) {
                        p = p.deleteCharAt(PosicionY);
                    }
		        		/* For 2da preposicion despues del NO
		        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionU + 2 ; l++) {
                        q = q.deleteCharAt(0);
                    }
		        		/* For negacion de q
		        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionU ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 2 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionU);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "∨";
                }
            }else if (( (Posicionsi != -1) && (Posicionentonces != -1) )|| PosicionImplica != -1) {
                // BLQOUE CONDICIONAL →
                if(PosicionImplica == 0 || Posicionentonces == -1) {
                    q.replace(0, tamanoArre, "Esta mal redactada la proposicion ");
                    p1 = "Mal ";
                    proposicion = "Redacatad" ;
                    q1 =  "o";
                } else if (Posicionsi != -1 && Posicionentonces != 0 && Posicionsi == 0){
		        		/* For 1ra preposicion antes del No
		        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
		        		/*for(int k=0; k < tamanoArre - PosicionO ; k++) {
		        			p = p.deleteCharAt(PosicionO);
		        		}
		        		/* For 2da preposicion despues del NO
		        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionO + 2 ; l++) {
                        q = q.deleteCharAt(0);
                    }
		        		/* For negacion de q
		        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionO ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 2 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionO);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "→";
                }else if (PosicionImplica != -1) {
		        		/* For 1ra preposicion antes del No
		        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionImplica ; k++) {
                        p = p.deleteCharAt(PosicionImplica);
                    }
		        		/* For 2da preposicion despues del NO
		        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionImplica + 8 ; l++) {
                        q = q.deleteCharAt(0);
                    }
		        		/* For negacion de q
		        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionImplica ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 8 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionImplica);
                    }
                    p1= "p";
                    q1 = "q";
                    proposicion = "→";
                }
            }else if(PosicionNo != -1) {
                // BLOQUE NEGACION
                if(PosicionNo == 0) {
                    System.out.println("~p");
                    for(int l=0; l <  PosicionNo + 3 ; l++) {
                        p = p.deleteCharAt(0);
                    }
                    for(int w=0; w <  PosicionNo ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    q.replace(0, tamanoArre, "La preposicion es simple por ende solo hay p");
                    p1 = "~p";
                    proposicion = " " ;
                    q1 = " ";
                }else{
		        		/* For 1ra preposicion antes del No
		        	 	se borra del tamano del arreglo - n que es la posicion del no hacia adelante */
                    for(int k=0; k < tamanoArre - PosicionNo ; k++) {
                        p = p.deleteCharAt(PosicionNo);
                    }
		        		/* For 2da preposicion despues del NO
		        		+ 3 por el tamano del No se borra del NO hacia atras */
                    for(int l=0; l <  PosicionNo + 3 ; l++) {
                        q = q.deleteCharAt(0);
                    }
		        		/* For negacion de q
		        		Borramos del innicio hasta n para no afectar al no */
                    for(int w=0; w <  PosicionNo ; w++) {
                        negp = negp.deleteCharAt(0);
                    }
                    // de 0 a 3 porque " No " tiene 4 espacios
                    for(int i=0 ; i < 3 ;i++) {
                        // eliminamos No del enunciado
                        Proposicion.deleteCharAt(PosicionNo);
                    }
                    p1= "p";
                    q1 = "~q";
                    proposicion = " ";
                }
            }else{
                p1= "Proposicion ";
                q1 = "válida";
                proposicion = "no ";
            }
            
            break;
        }
        
        String simbolos = p1+proposicion+q1;
        jTextArea2.setText("");
        jTextArea2.setText(simbolos);
        
    }//GEN-LAST:event_btnPaSActionPerformed

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
            java.util.logging.Logger.getLogger(PaS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaS;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    public String capitalizar(String cadena) {
        // Separar palabras de la cadena
        String[] separadaPorEspacios = cadena.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int indice = 0; indice < separadaPorEspacios.length; indice++) {
            String palabra = separadaPorEspacios[indice];
            // De la palabra, primero agregar la primera letra ya convertida a mayúscula
            char primeraLetra = palabra.charAt(0);
            sb.append(Character.toUpperCase(primeraLetra));
            // Luego agregarle "lo sobrante" de la palabra
            sb.append(palabra.substring(1));
            // Y si no es el último elemento del arreglo, le añadimos un espacio
            if (indice < separadaPorEspacios.length - 1)
                sb.append(" ");
        }
        // Finalmente regresamos la cadena
        return sb.toString();
    }
}