
package juegos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JuegoMain extends javax.swing.JFrame {
    static DefaultTableModel modelo=new DefaultTableModel();
    public JuegoMain() {
        initComponents();
    }
    static void muestraTodos(ResultSet rs) {
        boolean existe=true;
        limpiaTabla();
        while(existe){
            try{
                Object [] fila = new Object[5];
                for (int i=0;i<5;i++)
                    fila[i] = rs.getObject(i+1);
                modelo.addRow(fila);
                existe=rs.next();
            } catch(SQLException ex){
                existe=false;
                System.err.println("Error de registro");
            }
        }
    }
    static void limpiaTabla(){
        int a=modelo.getRowCount()-1;
        for (int i=a;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    void limpiaDatos(){
        tNom.setText(null);
        tDes.setText(null);
        tLan.setText(null);
        tPla.setText(null);
        tCon.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bAgregar = new javax.swing.JButton();
        bMod = new javax.swing.JButton();
        bElimina = new javax.swing.JButton();
        bLimp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tNom = new javax.swing.JTextField();
        tDes = new javax.swing.JTextField();
        tLan = new javax.swing.JTextField();
        tPla = new javax.swing.JTextField();
        tCon = new javax.swing.JTextField();
        bCon = new javax.swing.JButton();
        bList = new javax.swing.JButton();
        bSal = new javax.swing.JButton();
        bFortuna = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        lCon = new javax.swing.JMenuItem();
        lLis = new javax.swing.JMenuItem();
        lAgr = new javax.swing.JMenuItem();
        lMod = new javax.swing.JMenuItem();
        lEli = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        lLimp = new javax.swing.JMenuItem();
        lLimpLis = new javax.swing.JMenuItem();
        lSal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOS JUEGOS DEL AMOR :-)");

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        bAgregar.setFont(new java.awt.Font("Calibri", 0, 11));
        bAgregar.setText("AGREGAR");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bMod.setFont(new java.awt.Font("Calibri", 0, 11));
        bMod.setText("MODIFICAR");
        bMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModActionPerformed(evt);
            }
        });

        bElimina.setFont(new java.awt.Font("Calibri", 0, 11));
        bElimina.setText("ELIMINAR");
        bElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminaActionPerformed(evt);
            }
        });

        bLimp.setFont(new java.awt.Font("Calibri", 0, 11));
        bLimp.setText("LIMPAR");
        bLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Calibri", 0, 11));
        tabla.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Desarrollador");
        modelo.addColumn("Lanzamiento");
        modelo.addColumn("Plataforma");
        modelo.addColumn("Controles");
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("JUEGO");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 11));
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("DESARROLLADOR");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 11));
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("FECHA LANZAMIENTO");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("PLATAFORMA");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 11));
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("CONTROLES");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("MANTENEDOR JUEGOS");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("LISTADO DE JUEGOS");

        tNom.setFont(new java.awt.Font("Calibri", 0, 11));

        tDes.setFont(new java.awt.Font("Calibri", 0, 11));

        tLan.setFont(new java.awt.Font("Calibri", 0, 11));

        tPla.setFont(new java.awt.Font("Calibri", 0, 11));

        tCon.setFont(new java.awt.Font("Calibri", 0, 11));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(bMod))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tNom, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tDes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tLan, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tPla, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCon, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bLimp)
                        .addGap(18, 18, 18)
                        .addComponent(bElimina))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tLan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tPla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bMod)
                    .addComponent(bLimp)
                    .addComponent(bElimina))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bCon.setFont(new java.awt.Font("Calibri", 0, 11));
        bCon.setText("CONECTAR A BD");
        bCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConActionPerformed(evt);
            }
        });

        bList.setFont(new java.awt.Font("Calibri", 0, 11));
        bList.setText("LISTAR TODOS");
        bList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListActionPerformed(evt);
            }
        });

        bSal.setFont(new java.awt.Font("Calibri", 0, 11));
        bSal.setText("SALIR");
        bSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalActionPerformed(evt);
            }
        });

        bFortuna.setFont(new java.awt.Font("Calibri", 0, 11));
        bFortuna.setText("NUMERO DE LA SUERTE");
        bFortuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFortunaActionPerformed(evt);
            }
        });

        jMenu1.setText("MANTENEDOR");
        jMenu1.setFont(new java.awt.Font("Calibri", 0, 12));

        lCon.setFont(new java.awt.Font("Calibri", 0, 12));
        lCon.setText("CONECTAR A BD");
        lCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lConActionPerformed(evt);
            }
        });
        jMenu1.add(lCon);

        lLis.setFont(new java.awt.Font("Calibri", 0, 12));
        lLis.setText("LISTAR");
        lLis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lLisActionPerformed(evt);
            }
        });
        jMenu1.add(lLis);

        lAgr.setFont(new java.awt.Font("Calibri", 0, 12));
        lAgr.setText("AGREGAR");
        lAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lAgrActionPerformed(evt);
            }
        });
        jMenu1.add(lAgr);

        lMod.setFont(new java.awt.Font("Calibri", 0, 12));
        lMod.setText("MODIFICAR");
        lMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lModActionPerformed(evt);
            }
        });
        jMenu1.add(lMod);

        lEli.setFont(new java.awt.Font("Calibri", 0, 12));
        lEli.setText("ELIMINAR");
        lEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lEliActionPerformed(evt);
            }
        });
        jMenu1.add(lEli);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("VENTANA");
        jMenu2.setFont(new java.awt.Font("Calibri", 0, 12));

        lLimp.setFont(new java.awt.Font("Calibri", 0, 12));
        lLimp.setText("LIMPIAR DATOS");
        lLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lLimpActionPerformed(evt);
            }
        });
        jMenu2.add(lLimp);

        lLimpLis.setFont(new java.awt.Font("Calibri", 0, 12));
        lLimpLis.setText("LIMPIAR LISTADO");
        lLimpLis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lLimpLisActionPerformed(evt);
            }
        });
        jMenu2.add(lLimpLis);

        lSal.setFont(new java.awt.Font("Calibri", 0, 12));
        lSal.setText("SALIR");
        lSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lSalActionPerformed(evt);
            }
        });
        jMenu2.add(lSal);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCon)
                .addGap(41, 41, 41)
                .addComponent(bList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(bFortuna)
                .addGap(97, 97, 97)
                .addComponent(bSal)
                .addGap(54, 54, 54))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCon)
                    .addComponent(bList)
                    .addComponent(bSal)
                    .addComponent(bFortuna))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConActionPerformed
        try {
            ConBD.conectar();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_bConActionPerformed

    private void lConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lConActionPerformed
        try {
            ConBD.conectar();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_lConActionPerformed

    private void bSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalActionPerformed

    private void bListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListActionPerformed
        ConBD.verTodos();
    }//GEN-LAST:event_bListActionPerformed

    private void lLisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lLisActionPerformed
        ConBD.verTodos();
    }//GEN-LAST:event_lLisActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        SimpleDateFormat as=new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date d=null;
        try{
            d=as.parse(tLan.getText());
            ConBD.agregaDatos(tNom.getText(),tDes.getText(),tLan.getText(), tPla.getText(), tCon.getText());
        } catch(ParseException ex){
            JOptionPane.showMessageDialog(null,"El formato de fecha es incorrecto","Game Over",1);
            tLan.setText(null);
            tLan.requestFocus();
            return;
        } catch (Exception er){
        }
        limpiaDatos();
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpActionPerformed
        limpiaDatos();
    }//GEN-LAST:event_bLimpActionPerformed

    private void bEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminaActionPerformed
        if(tabla.isRowSelected(tabla.getSelectedRow())){
            int fila = tabla.getSelectedRow();
            ConBD.eliminaDatos(tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para eliminar","Game Over",1);
        }
        limpiaDatos();
    }//GEN-LAST:event_bEliminaActionPerformed

    private void lLimpLisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lLimpLisActionPerformed
        limpiaTabla();
}//GEN-LAST:event_lLimpLisActionPerformed

    private void lSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lSalActionPerformed
        System.exit(0);
}//GEN-LAST:event_lSalActionPerformed

    private void lAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lAgrActionPerformed
        SimpleDateFormat as=new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date d=null;
        try{
            d=as.parse(tLan.getText());
            ConBD.agregaDatos(tNom.getText(),tDes.getText(),tLan.getText(), tPla.getText(), tCon.getText());
        } catch(ParseException ex){
            JOptionPane.showMessageDialog(null,"El formato de fecha es incorrecto","Game Over",1);
            tLan.setText(null);
            tLan.requestFocus();
            return;
        } catch (Exception er){
        }
        limpiaDatos();
    }//GEN-LAST:event_lAgrActionPerformed

    private void lModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lModActionPerformed
        SimpleDateFormat as=new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date d=null;
        if(tabla.isRowSelected(tabla.getSelectedRow())){
            int fila = tabla.getSelectedRow(), columna=tabla.getSelectedColumn();
            if (columna==2){
                try{
                    d=as.parse(tLan.getText());
                }catch(ParseException ex){
                    JOptionPane.showMessageDialog(null,"El formato de fecha es incorrecto","Game Over",1);
                    tLan.setText(null);
                    tLan.requestFocus();
                    return;
                }
            }
            switch (columna){
                case 0:ConBD.modificaDatos("NOMBRE",tNom.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tNom.setText(null);break;
                case 1:ConBD.modificaDatos("DESARROLLADOR",tDes.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tDes.setText(null);break;
                case 2:ConBD.modificaDatos("LANZAMIENTO",tLan.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tLan.setText(null); break;
                case 3:ConBD.modificaDatos("PLATAFORMA",tPla.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tPla.setText(null);break;
                case 4:ConBD.modificaDatos("CONTROLES",tCon.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tCon.setText(null);break;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para modificar","Game Over",1);
        }
        limpiaDatos();
    }//GEN-LAST:event_lModActionPerformed

    private void lEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lEliActionPerformed
        if(tabla.isRowSelected(tabla.getSelectedRow())){
            int fila = tabla.getSelectedRow();
            ConBD.eliminaDatos(tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para eliminar","Game Over",1);
        }
        limpiaDatos();
    }//GEN-LAST:event_lEliActionPerformed

    private void lLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lLimpActionPerformed
        limpiaDatos();
    }//GEN-LAST:event_lLimpActionPerformed

    private void bModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModActionPerformed
        SimpleDateFormat as=new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date d=null;
        if(tabla.isRowSelected(tabla.getSelectedRow())){
            int fila = tabla.getSelectedRow(), columna=tabla.getSelectedColumn();
            if (columna==2){
                try{
                    d=as.parse(tLan.getText());
                }catch(ParseException ex){
                    JOptionPane.showMessageDialog(null,"El formato de fecha es incorrecto","Game Over",1);
                    tLan.setText(null);
                    tLan.requestFocus();
                    return;
                }
            }
            switch (columna){
                case 0:ConBD.modificaDatos("NOMBRE",tNom.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tNom.setText(null);break;
                case 1:ConBD.modificaDatos("DESARROLLADOR",tDes.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tDes.setText(null);break;
                case 2:ConBD.modificaDatos("LANZAMIENTO",tLan.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tLan.setText(null); break;
                case 3:ConBD.modificaDatos("PLATAFORMA",tPla.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tPla.setText(null);break;
                case 4:ConBD.modificaDatos("CONTROLES",tCon.getText(),tabla.getValueAt(fila,0),tabla.getValueAt(fila,1));tCon.setText(null);break;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para modificar","Game Over",1);
        }
        limpiaDatos();
    }//GEN-LAST:event_bModActionPerformed

    private void bFortunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFortunaActionPerformed
        JOptionPane.showMessageDialog(null, "Su número de la suerte es = "+Math.floor(Math.random()*100),"MADAMME FORTUNA",1);
    }//GEN-LAST:event_bFortunaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bCon;
    private javax.swing.JButton bElimina;
    private javax.swing.JButton bFortuna;
    private javax.swing.JButton bLimp;
    private javax.swing.JButton bList;
    private javax.swing.JButton bMod;
    private javax.swing.JButton bSal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem lAgr;
    private javax.swing.JMenuItem lCon;
    private javax.swing.JMenuItem lEli;
    private javax.swing.JMenuItem lLimp;
    private javax.swing.JMenuItem lLimpLis;
    private javax.swing.JMenuItem lLis;
    private javax.swing.JMenuItem lMod;
    private javax.swing.JMenuItem lSal;
    private javax.swing.JTextField tCon;
    private javax.swing.JTextField tDes;
    private javax.swing.JTextField tLan;
    private javax.swing.JTextField tNom;
    private javax.swing.JTextField tPla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
