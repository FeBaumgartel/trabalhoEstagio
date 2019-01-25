/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.alterar.Alterar_Funcionario;
import view.alterar.Alterar_Marca;
import view.alterar.Alterar_Cliente;
import view.alterar.Alterar_Fornecedor;
import view.alterar.Alterar_Produto;
import view.cadastrar.Cadastrar_Fornecedor;
import view.cadastrar.Cadastrar_Marca;
import view.cadastrar.Cadastrar_Funcionario;
import view.cadastrar.Cadastrar_Cliente;
import view.cadastrar.Cadastrar_Produto;

/**
 *
 * @author TnahLenovoNote01
 */
public class Cadastros extends javax.swing.JFrame {

    /**
     * Creates new form Entidades
     */
    public Cadastros() {
        setTitle("Cadastros");
        initComponents();
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
        btSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btCadCli = new javax.swing.JButton();
        btCadFunc = new javax.swing.JButton();
        btCadForn = new javax.swing.JButton();
        btCadMarc = new javax.swing.JButton();
        btCadProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        btCadCli.setText("Cadastrar Cliente");
        btCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCliActionPerformed(evt);
            }
        });

        btCadFunc.setText("Cadastrar Funcioario");
        btCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFuncActionPerformed(evt);
            }
        });

        btCadForn.setText("Cadastrar Fornecedor");
        btCadForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFornActionPerformed(evt);
            }
        });

        btCadMarc.setText("Cadastrar Marca");
        btCadMarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadMarcActionPerformed(evt);
            }
        });

        btCadProduto.setText("Cadastrar Produto");
        btCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadForn)
                    .addComponent(btCadMarc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCadCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadForn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadMarc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadProduto)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCliActionPerformed
        new Cadastrar_Cliente().setVisible(true);
    }//GEN-LAST:event_btCadCliActionPerformed

    private void btCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFuncActionPerformed
        new Cadastrar_Funcionario().setVisible(true);
    }//GEN-LAST:event_btCadFuncActionPerformed

    private void btCadFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFornActionPerformed
        new Cadastrar_Fornecedor().setVisible(true);
    }//GEN-LAST:event_btCadFornActionPerformed

    private void btCadMarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadMarcActionPerformed
        new Cadastrar_Marca().setVisible(true);
    }//GEN-LAST:event_btCadMarcActionPerformed

    private void btCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadProdutoActionPerformed
        new Cadastrar_Produto().setVisible(true);
    }//GEN-LAST:event_btCadProdutoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCli;
    private javax.swing.JButton btCadForn;
    private javax.swing.JButton btCadFunc;
    private javax.swing.JButton btCadMarc;
    private javax.swing.JButton btCadProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
