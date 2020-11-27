/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AcoesDiariasController;
import javax.swing.JComboBox;
import model.AcoesAve;
import model.AcoesDiarias;
import model.AcoesMamifero;

public class ControleAnimais extends javax.swing.JFrame {

    AcoesDiariasController controller = new AcoesDiariasController();

    public ControleAnimais() {
        initComponents();
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

        comboComeuAlimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        comboComeuAlimento.setEnabled(false);

        comboBebeuAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        comboBebeuAgua.setEnabled(false);

        comboBanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        comboBanho.setEnabled(false);

        comboPasseou.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
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
                .addContainerGap(177, Short.MAX_VALUE))
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
        btnAlterar.setEnabled(false);

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
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
                        .addGap(0, 22, Short.MAX_VALUE)))
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
        if (((String) combo.getSelectedItem()).equals("Sim")) {
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
        if (((String) comboAnimal2.getSelectedItem()).equals("Mamifero")) {
            acao = acaoMamifero();
        } else {
            acao = acaoAve();
        }
        boolean retorno = controller.cadastrar(acao);
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
    private void habilitaCampos() {
        String nome = controller.buscar(((String) comboAnimal2.getSelectedItem()), Integer.parseInt(txtNumeroCadastro.getText()));
        if (nome != null) {
            setarCamposEditaveis();
            txtNomeAnimal.setText(nome);
        } else {
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
        txtNomeAnimal.setText(null);
        txtNumeroCadastro.setText(null);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarInferiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInferiorActionPerformed
        habilitaCampos();
    }//GEN-LAST:event_btnBuscarInferiorActionPerformed

    private void comboAnimal2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAnimal2ItemStateChanged
        if (((String) comboAnimal2.getSelectedItem()).equals("-")) {
            setarCamposNulos();
            txtNumeroCadastro.setEditable(false);
            btnBuscarInferior.setEnabled(false);
        } else if (((String) comboAnimal2.getSelectedItem()).equals("Mamifero")) {
            setarCamposNulos();
            comboBanho.setVisible(true);
            comboPasseou.setVisible(true);
            lblBanho.setVisible(true);
            lblPasseou.setVisible(true);
            btnBuscarInferior.setEnabled(true);
            txtNumeroCadastro.setEditable(true);
        } else {
            setarCamposNulos();
            btnBuscarInferior.setEnabled(true);
            txtNumeroCadastro.setEditable(true);
            comboBanho.setVisible(false);
            comboPasseou.setVisible(false);
            lblBanho.setVisible(false);
            lblPasseou.setVisible(false);
        }
    }//GEN-LAST:event_comboAnimal2ItemStateChanged

    private void comboAnimal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnimal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnimal2ActionPerformed

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
