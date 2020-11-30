/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.toedter.calendar.JDateChooser;
import controller.AcoesDiariasController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.AcoesAve;
import model.AcoesDiarias;
import model.AcoesMamifero;
import model.Animal;
import model.Ave;

public class ControleAnimais extends javax.swing.JFrame {

    AcoesDiariasController controller = new AcoesDiariasController();
    String modoTela = "Criação";

    public ControleAnimais() {
        initComponents();
        tblAcoesDiarias.getColumnModel().getColumn(0).setMinWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(0).setMaxWidth(0);
        txtNumCadastro.setVisible(false);
        lblNumCadastro.setVisible(false);
        lblPsqNome.setVisible(false);
        txtPsqNome.setVisible(false);
        btnBuscar.setVisible(false);
        btnBuscarInferior.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcoesDiarias = new javax.swing.JTable();
        lblPsqNome = new javax.swing.JLabel();
        txtPsqNome = new javax.swing.JTextField();
        lblNumCadastro = new javax.swing.JLabel();
        txtNumCadastro = new javax.swing.JTextField();
        comboAnimal = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeAnimal = new javax.swing.JTextField();
        txtQtdAlimento = new javax.swing.JTextField();
        txtNumeroCadastro = new javax.swing.JTextField();
        lblPasseou = new javax.swing.JLabel();
        lblBanho = new javax.swing.JLabel();
        comboComeuAlimento = new javax.swing.JComboBox<>();
        comboBebeuAgua = new javax.swing.JComboBox<>();
        comboBanho = new javax.swing.JComboBox<>();
        comboPasseou = new javax.swing.JComboBox<>();
        dataAcao = new com.toedter.calendar.JDateChooser();
        btnBuscarInferior = new javax.swing.JButton();
        comboAnimal2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Animais"));

        tblAcoesDiarias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Data", "Comeu Alimento", "Quantidade de Alimento", "Bebeu Água", "Passeou", "Banho"
            }
        ));
        jScrollPane1.setViewportView(tblAcoesDiarias);

        lblPsqNome.setText("Nome animal");

        txtPsqNome.setEditable(false);
        txtPsqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPsqNomeActionPerformed(evt);
            }
        });

        lblNumCadastro.setText("Número Cadastro");

        txtNumCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCadastroActionPerformed(evt);
            }
        });

        comboAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Mamifero", "Ave" }));
        comboAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAnimalItemStateChanged(evt);
            }
        });
        comboAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnimalActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPsqNome)
                            .addComponent(lblNumCadastro)
                            .addComponent(jLabel11))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPsqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNumCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addComponent(comboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addComponent(lblNumCadastro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPsqNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPsqNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Ação Diária"));

        jLabel3.setText("Nome Animal ");

        jLabel4.setText("Número cadastro");

        jLabel5.setText("Data");

        jLabel6.setText("Comeu Alimento");

        jLabel7.setText("Quantidade de Alimento");

        jLabel8.setText("Bebeu Água");

        txtNomeAnimal.setEditable(false);
        txtNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAnimalActionPerformed(evt);
            }
        });

        txtQtdAlimento.setEditable(false);
        txtQtdAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdAlimentoActionPerformed(evt);
            }
        });

        txtNumeroCadastro.setEditable(false);

        lblPasseou.setText("Passeou");

        lblBanho.setText("Banho");

        comboComeuAlimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        comboComeuAlimento.setEnabled(false);

        comboBebeuAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        comboBebeuAgua.setEnabled(false);
        comboBebeuAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBebeuAguaActionPerformed(evt);
            }
        });

        comboBanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        comboBanho.setEnabled(false);

        comboPasseou.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        comboPasseou.setEnabled(false);

        dataAcao.setEnabled(false);

        btnBuscarInferior.setText("Buscar");
        btnBuscarInferior.setEnabled(false);
        btnBuscarInferior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInferiorActionPerformed(evt);
            }
        });

        comboAnimal2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Mamifero", "Ave" }));
        comboAnimal2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAnimal2ItemStateChanged(evt);
            }
        });
        comboAnimal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnimal2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(lblPasseou)
                    .addComponent(lblBanho)
                    .addComponent(jLabel12))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAnimal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarInferior))
                    .addComponent(comboComeuAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBebeuAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPasseou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAnimal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumeroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarInferior))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dataAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboComeuAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtQtdAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(comboBebeuAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblPasseou))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboPasseou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanho)
                    .addComponent(comboBanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExcluir)
                            .addComponent(btnAlterar))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnAlterar)
                        .addGap(44, 44, 44)
                        .addComponent(btnExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnSair)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastrar Ação Diária ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPsqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPsqNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPsqNomeActionPerformed

    private void txtNumCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCadastroActionPerformed

    private void txtNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAnimalActionPerformed

    private void txtQtdAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdAlimentoActionPerformed

    private boolean acoes(JComboBox combo) {
        if (((String) combo.getSelectedItem()).equals("sim")) {
            return true;
        } else {
            return false;
        }
    }

    private AcoesDiarias acaoMamifero() {
        AcoesDiarias acao = new AcoesMamifero(acoes(comboPasseou), acoes(comboBanho), Integer.parseInt(txtNumeroCadastro.getText()),
                dataAcao.getDate(), acoes(comboComeuAlimento), acoes(comboBebeuAgua), Float.parseFloat(txtQtdAlimento.getText()));
        return acao;
    }

    private AcoesDiarias acaoAve() {
        AcoesDiarias acao = new AcoesAve(Integer.parseInt(txtNumeroCadastro.getText()),
                dataAcao.getDate(), acoes(comboComeuAlimento), acoes(comboBebeuAgua), Float.parseFloat(txtQtdAlimento.getText()));
        return acao;
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        AcoesDiarias acao;
        if (modoTela.equals("Criação")) {
            if (((String) comboAnimal2.getSelectedItem()).equals("Mamifero")) {
                acao = acaoMamifero();
            } else {
                acao = acaoAve();
            }
            if (controller.cadastrar(acao)) {
                JOptionPane.showMessageDialog(this, "Ação Cadastrada!");
                setarCamposNulos();
            } else {
                JOptionPane.showMessageDialog(this, "Houve um erro ao Cadastrar a Ação!");
            }
        } else {
            if (((String) comboAnimal2.getSelectedItem()).equals("Mamifero")) {
                acao = acaoMamifero();
                int numeroLinha = tblAcoesDiarias.getSelectedRow();
                acao.setId(Integer.parseInt(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 0).toString()));

            } else {
                acao = acaoAve();
                int numeroLinha = tblAcoesDiarias.getSelectedRow();
                acao.setId(Integer.parseInt(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 0).toString()));
            }
            if (controller.alterar(acao)) {
                JOptionPane.showMessageDialog(this, "Ação Alterada!");
                setarCamposNulos();
            } else {
                JOptionPane.showMessageDialog(this, "Houve um erro ao alterar a Ação!");
            }
        }
        modoTela = "Criação";
        setarCamposNulos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void comboAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAnimalItemStateChanged
        if (((String) comboAnimal.getSelectedItem()).equals("-")) {
            txtNumCadastro.setVisible(false);
            lblNumCadastro.setVisible(false);
            txtPsqNome.setVisible(false);
            lblPsqNome.setVisible(false);
            txtNumCadastro.setText(null);
            txtPsqNome.setText(null);
            btnBuscar.setVisible(false);
        } else {
            txtNumCadastro.setVisible(true);
            lblNumCadastro.setVisible(true);
            txtPsqNome.setVisible(true);
            lblPsqNome.setVisible(true);
            btnBuscar.setVisible(true);
        }
    }//GEN-LAST:event_comboAnimalItemStateChanged
    private void buscarAnimalTabela(JComboBox combo, JTextField num) {
        String tabela = (String) combo.getSelectedItem();
        int numCadastro = Integer.parseInt(num.getText());
        String nome = controller.buscar(tabela, numCadastro);
        if (nome != null) {
            txtPsqNome.setText(nome);
        } else {
            JOptionPane.showMessageDialog(this, "Animal não encontrado");
            setarCamposNulos();
        }
    }

    private void buscarAnimal(JComboBox combo, JTextField num) {
        String tabela = (String) combo.getSelectedItem();
        int numCadastro = Integer.parseInt(num.getText());
        String nome = controller.buscar(tabela, numCadastro);
        if (nome != null) {
            txtNomeAnimal.setText(nome);
            setarCamposEditaveis();
        } else {
            JOptionPane.showMessageDialog(this, "Animal não encontrado");
            setarCamposNulos();
        }
    }

    public void setarCamposNulos() {
        txtNomeAnimal.setEditable(false);
        dataAcao.setEnabled(false);
        comboComeuAlimento.setEnabled(false);
        comboBebeuAgua.setEnabled(false);
        comboPasseou.setEnabled(false);
        comboBanho.setEnabled(false);
        txtQtdAlimento.setEditable(false);
        txtNomeAnimal.setText(null);
        dataAcao.setDate(null);
        txtNomeAnimal.setText(null);
        txtNumeroCadastro.setText(null);
        txtQtdAlimento.setText(null);
    }

    public void setarCamposEditaveis() {
        dataAcao.setEnabled(true);
        btnBuscarInferior.setEnabled(true);
        comboComeuAlimento.setEnabled(true);
        comboBebeuAgua.setEnabled(true);
        comboPasseou.setEnabled(true);
        comboBanho.setEnabled(true);
        txtQtdAlimento.setEditable(true);
    }
    private void comboAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnimalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarAnimalTabela(comboAnimal, txtNumCadastro);
        CarregaTabela(comboAnimal, txtNumCadastro);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarInferiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInferiorActionPerformed
        buscarAnimal(comboAnimal2, txtNumeroCadastro);
    }//GEN-LAST:event_btnBuscarInferiorActionPerformed

    private void comboAnimal2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAnimal2ItemStateChanged
        if (((String) comboAnimal2.getSelectedItem()).equals("-")) {
            setarCamposNulos();
            txtNumeroCadastro.setEditable(false);
            btnBuscarInferior.setEnabled(false);
        } else if (((String) comboAnimal2.getSelectedItem()).equals("Mamifero")) {
            setarCamposNulos();
            setarCamposMamifero();
        } else {
            setarCamposNulos();
            setarCamposAve();
        }
    }//GEN-LAST:event_comboAnimal2ItemStateChanged
    public void setarCamposMamifero() {
        comboBanho.setVisible(true);
        comboPasseou.setVisible(true);
        lblBanho.setVisible(true);
        lblPasseou.setVisible(true);
        btnBuscarInferior.setEnabled(true);
        txtNumeroCadastro.setEditable(true);
    }

    public void setarCamposAve() {
        btnBuscarInferior.setEnabled(true);
        txtNumeroCadastro.setEditable(true);
        comboBanho.setVisible(false);
        comboPasseou.setVisible(false);
        lblBanho.setVisible(false);
        lblPasseou.setVisible(false);
    }

    private void CarregaTabela(JComboBox combo, JTextField id) {
        DefaultTableModel modelo = (DefaultTableModel) tblAcoesDiarias.getModel();
        modelo.setRowCount(0);

        ArrayList<Object> acoes;
        acoes = controller.pesquisar((String) combo.getSelectedItem(), Integer.parseInt(id.getText()));
        for (Object acao : acoes) {
            if (acao instanceof AcoesMamifero) {
                insereAcaoMamifero((AcoesMamifero) acao);
            } else {
                insereAcaoAve((AcoesAve) acao);
            }
        }
    }

    public void insereAcaoMamifero(AcoesMamifero acao) {
        DefaultTableModel modelo = (DefaultTableModel) tblAcoesDiarias.getModel();
        tblAcoesDiarias.getColumnModel().getColumn(0).setMinWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(0).setMaxWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(5).setMinWidth(100);
        tblAcoesDiarias.getColumnModel().getColumn(5).setMaxWidth(100);
        tblAcoesDiarias.getColumnModel().getColumn(6).setMinWidth(100);
        tblAcoesDiarias.getColumnModel().getColumn(6).setMaxWidth(100);
        modelo.addRow(new Object[]{
            acao.getId(),
            acao.getData(),
            trueOrFalse(acao.isComerAlimento()),
            acao.getQtdAlimento(),
            trueOrFalse(acao.isBeberAgua()),
            trueOrFalse(acao.isPassear()),
            trueOrFalse(acao.isBanho())});
    }

    public void insereAcaoAve(AcoesAve acao) {
        DefaultTableModel modelo = (DefaultTableModel) tblAcoesDiarias.getModel();
        tblAcoesDiarias.getColumnModel().getColumn(0).setMinWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(0).setMaxWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(5).setMinWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(5).setMaxWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(6).setMinWidth(0);
        tblAcoesDiarias.getColumnModel().getColumn(6).setMaxWidth(0);

        modelo.addRow(new Object[]{
            acao.getId(),
            acao.getData(),
            trueOrFalse(acao.isComerAlimento()),
            acao.getQtdAlimento(),
            trueOrFalse(acao.isBeberAgua())});
    }

    public static String trueOrFalse(boolean condicao) {
        if (condicao) {
            return "sim";
        } else {
            return "nao";
        }
    }
    private void comboAnimal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnimal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnimal2ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        modoTela = "Alteração";
        setarCamposEditaveis();
        if (((String) comboAnimal.getSelectedItem()).equals("Mamifero")) {
            comboAnimal2.setSelectedIndex(1);
            inserirCampos("Mamifero");
        } else {
            comboAnimal2.setSelectedIndex(2);
            inserirCampos("Ave");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void comboBebeuAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBebeuAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBebeuAguaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblAcoesDiarias.getRowCount() > 0) {
            int id = Integer.parseInt(tblAcoesDiarias.getModel().getValueAt(tblAcoesDiarias.getSelectedRow(), 0).toString());
            String animal = (String) comboAnimal.getSelectedItem();
            boolean retorno = controller.excluir(animal, id);

            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Acao excluida com Sucesso", "Exclusão realizada", JOptionPane.INFORMATION_MESSAGE);
                CarregaTabela(comboAnimal, txtNumCadastro);
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao excluir Acao!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma Acao da tabela para excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void inserirCampos(String tipo) {
        if (tblAcoesDiarias.getRowCount() > 0) {
            int numeroLinha = tblAcoesDiarias.getSelectedRow();
            if (tipo.equals("Mamifero")) {
                txtNumeroCadastro.setText(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 0).toString());
                txtNomeAnimal.setText(txtPsqNome.getText());
                comboComeuAlimento.setSelectedItem(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 2).toString());
                txtQtdAlimento.setText(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 3).toString());
                comboBebeuAgua.setSelectedItem(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 4).toString());
                comboPasseou.setSelectedItem(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 5).toString());
                comboBanho.setSelectedItem(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 6).toString());
                try {
                    dataAcao.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 1).toString()));
                } catch (ParseException ex) {
                    Logger.getLogger(ControleAnimais.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                txtNumeroCadastro.setText(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 0).toString());
                txtNomeAnimal.setText(txtPsqNome.getText());
                comboComeuAlimento.setSelectedItem(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 2).toString());
                txtQtdAlimento.setText(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 3).toString());
                comboBebeuAgua.setSelectedItem(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 4).toString());
                try {
                    dataAcao.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(tblAcoesDiarias.getModel().getValueAt(numeroLinha, 1).toString()));
                } catch (ParseException ex) {
                    Logger.getLogger(ControleAnimais.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um animal da tabela!");
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
            java.util.logging.Logger.getLogger(ControleAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarInferior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboAnimal;
    private javax.swing.JComboBox<String> comboAnimal2;
    private javax.swing.JComboBox<String> comboBanho;
    private javax.swing.JComboBox<String> comboBebeuAgua;
    private javax.swing.JComboBox<String> comboComeuAlimento;
    private javax.swing.JComboBox<String> comboPasseou;
    private com.toedter.calendar.JDateChooser dataAcao;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblBanho;
    private javax.swing.JLabel lblNumCadastro;
    private javax.swing.JLabel lblPasseou;
    private javax.swing.JLabel lblPsqNome;
    private javax.swing.JTable tblAcoesDiarias;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JTextField txtNumCadastro;
    private javax.swing.JTextField txtNumeroCadastro;
    private javax.swing.JTextField txtPsqNome;
    private javax.swing.JTextField txtQtdAlimento;
    // End of variables declaration//GEN-END:variables
}
