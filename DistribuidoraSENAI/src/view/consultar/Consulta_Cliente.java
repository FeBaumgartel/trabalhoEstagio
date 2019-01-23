/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.consultar;

import dataservices.dao.ClienteDao;
import domain.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import resource.ClienteTableModel;
import view.cadastrar.Cadastrar_Cliente;

/**
 *
 * @author TnahLenovoNote01
 */
public class Consulta_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Consulta_Cliente
     */
    public Consulta_Cliente() {
        initComponents();
        atualizarTabela();
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
        txBusca = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBuscaActionPerformed(evt);
            }
        });

        btCad.setText("+");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btExc.setText("-");
        btExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCad)
                    .addComponent(btExc)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBuscaActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        new Cadastrar_Cliente().setVisible(true);
    }//GEN-LAST:event_btCadActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcActionPerformed

    /**
     * @param args the command line arguments
     */
    private TableModel carregarTabela() {
        List<Cliente> lista = dao.list();
        ptm = new ClienteTableModel(lista);
        return ptm;
    }

    private void atualizarTabela() {
        jTable1.setModel(carregarTabela());
    }

    ClienteDao dao;
    private ClienteTableModel ptm;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btExc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txBusca;
    // End of variables declaration//GEN-END:variables
}
