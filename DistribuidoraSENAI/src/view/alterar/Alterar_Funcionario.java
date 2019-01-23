/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.alterar;

import dataservices.dao.FuncionarioDao;
import domain.Funcionario;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author TnahLenovoNote01
 */
public class Alterar_Funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Alterar_Funcionario
     */
    public Alterar_Funcionario() {
        initComponents();
        limpaCampos();
        ImageIcon image = new ImageIcon(diretorio);
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
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
        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txNome = new javax.swing.JTextField();
        txCPF = new javax.swing.JTextField();
        txRG = new javax.swing.JTextField();
        txDataNasc = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txCelular = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbImagem = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        lbDataNasc = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbMsg = new javax.swing.JLabel();
        txDataCont = new javax.swing.JTextField();
        lbDataCont = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        txUsuario = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        txSenha = new javax.swing.JTextField();
        txSalario = new javax.swing.JTextField();
        lbSalario = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox();
        lbImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btConfirmar);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbImagem.setText("Imagem");

        lbNome.setText("Nome");

        lbCPF.setText("CPF");

        lbRG.setText("RG");

        lbDataNasc.setText("Data de nascimento");

        lbTelefone.setText("Telefone");

        lbCelular.setText("Celular");

        lbEmail.setText("Email");

        lbDataCont.setText("Data de contrato");

        lbCargo.setText("Cargo");

        lbUsuario.setText("Usuário");

        lbSenha.setText("Senha");

        lbSalario.setText("Salario");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerente", "Gerente de caixa", "Operador de caixa" }));

        lbImg.setMaximumSize(new java.awt.Dimension(140, 140));
        lbImg.setMinimumSize(new java.awt.Dimension(140, 140));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txDataNasc)
                                .addComponent(lbDataNasc)
                                .addComponent(lbEmail)
                                .addComponent(lbDataCont)
                                .addComponent(txDataCont)
                                .addComponent(lbCargo)
                                .addComponent(txRG)
                                .addComponent(lbCPF)
                                .addComponent(lbRG)
                                .addComponent(txCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(cbCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbNome)
                                .addComponent(txNome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lbSalario)
                                .addComponent(txSalario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTelefone)
                            .addComponent(lbCelular)
                            .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsuario)
                            .addComponent(lbSenha)
                            .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover))
                            .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbImagem))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(lbImagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDataCont)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDataCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCargo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAlterar)
                            .addComponent(btRemover))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(lbMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        JFileChooser fc1 = new JFileChooser();

        int res = fc1.showOpenDialog(null);

        File caminho = null;

        if (res == JFileChooser.APPROVE_OPTION) {

            caminho = fc1.getSelectedFile();
            diretorio = caminho.getPath();
            ImageIcon image = new ImageIcon(diretorio);
            lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
            System.out.println(diretorio);
            repaint();

        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");

        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        try {
            if (txNome.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txNome.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txSalario.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txSalario.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txDataCont.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txDataCont.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (cbCargo.getSelectedItem().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                cbCargo.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txCPF.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txCPF.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txRG.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txRG.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txDataNasc.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txDataNasc.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txTelefone.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txTelefone.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txEmail.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txEmail.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txUsuario.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txUsuario.setBorder(new LineBorder(Color.red));
                repaint();
            }
            if (txSenha.getText().equals("")) {
                lbMsg.setText("Atenção: preencha todos os campos obrigatórios.");
                lbMsg.setForeground(Color.red);
                txSenha.setBorder(new LineBorder(Color.red));
                repaint();
            }
            dao.update(criarFuncionario());
            lbMsg.setText("Alteração realizada com sucesso");
            lbMsg.setForeground(Color.green);
            repaint();
        } catch (Exception e) {
            lbMsg.setText("Atenção: Ocorreu algum problema ao tentar realizar a alteração");
            lbMsg.setForeground(Color.red);
            repaint();
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        diretorio = "C:\\Users\\TnahLenovoNote01\\Desktop\\trabalhoEstagio\\imgs\\sem_foto.jpg";
        ImageIcon image = new ImageIcon(diretorio);
        lbImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_btRemoverActionPerformed

    /**
     * @param args the command line arguments
     */
    private Funcionario criarFuncionario() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/YYYY");
            Date contratacao = sdf.parse(txDataCont.getText());
            Date nascimento = sdf.parse(txDataNasc.getText());
            String nome = txNome.getText();
            double salario = Double.parseDouble(txSalario.getText());
            String cargo = (String) cbCargo.getSelectedItem();
            String usuario = txUsuario.getText();
            String senha = txSenha.getText();
            String cpf = txCPF.getText();
            String rg = txRG.getText();
            String telefone = txTelefone.getText();
            String celular = txCelular.getText();
            String email = txEmail.getText();
            String imagem = diretorio;

            return new Funcionario(contratacao, salario, cargo, usuario, senha, nome, cpf, rg, nascimento, telefone, celular, email, imagem);
        } catch (Exception e) {
            lbMsg.setText("Atenção: Ocorreu algum problema ao tentar realizar o cadastro");
            lbMsg.setForeground(Color.red);
            repaint();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return new Funcionario();
    }

    private void limpaCampos() {
        txNome.setText("");
        txCPF.setText("");
        txRG.setText("");
        txCelular.setText("");
        txTelefone.setText("");
        txEmail.setText("");
        txDataNasc.setText("");
        txDataCont.setText("");
        txSalario.setText("");
        cbCargo.setSelectedItem("");
        txUsuario.setText("");
        txSenha.setText("");
    }
    FuncionarioDao dao = new FuncionarioDao();
    private String diretorio = "C:\\Users\\TnahLenovoNote01\\Desktop\\trabalhoEstagio\\imgs\\sem_foto.jpg";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbDataCont;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTextField txCPF;
    private javax.swing.JTextField txCelular;
    private javax.swing.JTextField txDataCont;
    private javax.swing.JTextField txDataNasc;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txRG;
    private javax.swing.JTextField txSalario;
    private javax.swing.JTextField txSenha;
    private javax.swing.JTextField txTelefone;
    private javax.swing.JTextField txUsuario;
    // End of variables declaration//GEN-END:variables
}
