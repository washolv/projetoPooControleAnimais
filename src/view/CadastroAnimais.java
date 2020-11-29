/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AnimalController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Animal;
import model.Ave;
import model.Mamifero;

/**
 *
 * @author User
 */
public class CadastroAnimais extends javax.swing.JFrame {

    /**
     * Creates new form ControleAnimais
     */
    public String modoTela = "Criação";
    AnimalController controller = new AnimalController();
    Animal animal = new Mamifero();

    public CadastroAnimais() {
        initComponents();
        CarregaTabela();
        txtCodLiberacao.setVisible(false);
        lblCodLiberacao.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boxAnimalCadastrar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRaca = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtQtdAlimento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtCodLiberacao = new javax.swing.JTextField();
        lblCodLiberacao = new javax.swing.JLabel();
        t = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimal = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        caixaAnimal = new javax.swing.JComboBox<>();
        btnAlterar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Animal"));

        boxAnimalCadastrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mamifero", "Ave" }));
        boxAnimalCadastrar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxAnimalCadastrarItemStateChanged(evt);
            }
        });
        boxAnimalCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAnimalCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Animal");

        jLabel3.setText("Raça");

        jLabel4.setText("Idade");

        jLabel5.setText("Peso");

        jLabel6.setText("Quantidade de alimento");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRacaActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo");

        txtCodLiberacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodLiberacaoActionPerformed(evt);
            }
        });

        lblCodLiberacao.setText("Código Liberação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(lblCodLiberacao))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodLiberacao)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtRaca, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtQtdAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(boxAnimalCadastrar, 0, 231, Short.MAX_VALUE)
                    .addComponent(txtTipo))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxAnimalCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQtdAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodLiberacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodLiberacao))
                .addGap(6, 6, 6))
        );

        t.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Animais"));

        tblAnimal.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tblAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Tipo", "Nome", "Raça", "Idade", "Peso", "Quantidade Alimento", "Cód. Liberação"
            }
        ));
        tblAnimal.setToolTipText("");
        jScrollPane1.setViewportView(tblAnimal);

        jLabel7.setText("Pesquisar ");

        caixaAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mamifero", "Aves" }));
        caixaAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                caixaAnimalItemStateChanged(evt);
            }
        });
        caixaAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tLayout = new javax.swing.GroupLayout(t);
        t.setLayout(tLayout);
        tLayout.setHorizontalGroup(
            tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tLayout.createSequentialGroup()
                .addGroup(tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caixaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tLayout.setVerticalGroup(
            tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(caixaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton5.setText("Sair");

        jButton6.setText("Controle Acões");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(btnAlterar))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton6)
                        .addGap(35, 35, 35)
                        .addComponent(btnAlterar)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3))
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(jButton5))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxAnimalCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAnimalCadastrarActionPerformed

    }//GEN-LAST:event_boxAnimalCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRacaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //Resgato as informações da linha para passar a tela de Cadastro/Alteração
        if (tblAnimal.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblAnimal.getSelectedRow();

            txtTipo.setText(tblAnimal.getModel().getValueAt(numeroLinha, 1).toString());
            txtNome.setText(tblAnimal.getModel().getValueAt(numeroLinha, 2).toString());
            txtRaca.setText(tblAnimal.getModel().getValueAt(numeroLinha, 3).toString());
            txtIdade.setText(tblAnimal.getModel().getValueAt(numeroLinha, 4).toString());
            txtPeso.setText(tblAnimal.getModel().getValueAt(numeroLinha, 5).toString());
            txtQtdAlimento.setText(tblAnimal.getModel().getValueAt(numeroLinha, 6).toString());
            if (((String) caixaAnimal.getSelectedItem()).equals("Aves")) {
                boxAnimalCadastrar.setSelectedIndex(1);
                txtCodLiberacao.setText(tblAnimal.getModel().getValueAt(numeroLinha, 7).toString());
            } else {
                boxAnimalCadastrar.setSelectedIndex(0);
                lblCodLiberacao.setVisible(false);
                txtCodLiberacao.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um animal da tabela!");
        }
        boxAnimalCadastrar.setEnabled(false);
        modoTela = "Alteração";
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void caixaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaAnimalActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (modoTela == "Criação") {
            String tipo = (txtTipo.getText());
            String nome = (txtNome.getText());
            String raca = (txtRaca.getText());
            int idade = Integer.parseInt(txtIdade.getText());
            float peso = Float.parseFloat(txtPeso.getText());
            float qtdAlimento = Float.parseFloat(txtQtdAlimento.getText());

            if (animal instanceof Mamifero) {
                animal = new Mamifero(nome, peso, idade, tipo, raca, qtdAlimento);
                caixaAnimal.setSelectedIndex(0);
            } else {
                int cod_liberacao = Integer.parseInt(txtCodLiberacao.getText());
                animal = new Ave(cod_liberacao, idade, nome, peso, idade, tipo, raca, qtdAlimento);
                caixaAnimal.setSelectedIndex(1);
            }
            boolean retorno = controller.cadastrar(animal);

            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Animal cadastrado com Sucesso", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
                CarregaTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar animal!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            int numeroLinha = tblAnimal.getSelectedRow();
            int id = Integer.parseInt(tblAnimal.getModel().getValueAt(numeroLinha, 0).toString());
            String tipo = (txtTipo.getText());
            String nome = (txtNome.getText());
            String raca = (txtRaca.getText());
            int idade = Integer.parseInt(txtIdade.getText());
            float peso = Float.parseFloat(txtPeso.getText());
            float qtdAlimento = Float.parseFloat(txtQtdAlimento.getText());

            if (((String) boxAnimalCadastrar.getSelectedItem()).equals("Mamifero")) {
                animal = new Mamifero(id, nome, peso, idade, tipo, raca, qtdAlimento);
            } else {
                int cod_liberacao = Integer.parseInt(txtCodLiberacao.getText());
                animal = new Ave(cod_liberacao, id, nome, peso, idade, tipo, raca, qtdAlimento);
            }

            try {
                boolean retorno = controller.alterar(animal);
                System.out.println(retorno);
                JOptionPane.showMessageDialog(this, "Animal alterado com sucesso!", "Animal Alterado", JOptionPane.INFORMATION_MESSAGE);
                modoTela = "Criação";
                CarregaTabela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Falha ao gravar no banco de dados\n" + e.getMessage(),
                        "Aviso de Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
        setarCamposNulos();
        
    }//GEN-LAST:event_btnSalvarActionPerformed
    public void setarCamposNulos() {
        txtTipo.setText(null);
        txtNome.setText(null);
        txtRaca.setText(null);
        txtIdade.setText(null);
        txtPeso.setText(null);
        txtQtdAlimento.setText(null);
        txtCodLiberacao.setText(null);
        boxAnimalCadastrar.setEnabled(true);
        modoTela = "Criação";
    }
    private void txtCodLiberacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodLiberacaoActionPerformed
    }//GEN-LAST:event_txtCodLiberacaoActionPerformed

    private void boxAnimalCadastrarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxAnimalCadastrarItemStateChanged
        String tipo = (String) boxAnimalCadastrar.getSelectedItem();
        if (tipo.equals("Mamifero")) {
            txtCodLiberacao.setVisible(false);
            lblCodLiberacao.setVisible(false);
            animal = new Mamifero();
        } else {
            txtCodLiberacao.setVisible(true);
            lblCodLiberacao.setVisible(true);
            animal = new Ave();
        }
    }//GEN-LAST:event_boxAnimalCadastrarItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ControleAnimais c = new ControleAnimais();
        c.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void caixaAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_caixaAnimalItemStateChanged
        CarregaTabela();
    }//GEN-LAST:event_caixaAnimalItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (tblAnimal.getRowCount() > 0) {
            int numeroLinha = tblAnimal.getSelectedRow();
            String idd = tblAnimal.getModel().getValueAt(numeroLinha, 0).toString();
            int id = Integer.parseInt(idd);
            String animal = (String) caixaAnimal.getSelectedItem();
            boolean retorno = controller.excluir(animal, id);

            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Animal excluido com Sucesso", "Exclusão realizada", JOptionPane.INFORMATION_MESSAGE);
                CarregaTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao excluir animal!", "Falha", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um animal da tabela para excluir!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void CarregaTabela() {
        ArrayList<Object> listaAnimal;
        listaAnimal = controller.pesquisar((String) caixaAnimal.getSelectedItem(), 0);
        for (Object animal : listaAnimal) {
            Animal ani = (Animal) animal;
            if (animal instanceof Ave) {
                insereLinhaMamifero(ani);
            } else {
                insereLinhaAve(ani);
            }
        }
    }

    public void insereLinhaMamifero(Animal ani) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.setRowCount(0);

        tblAnimal.getColumnModel().getColumn(0).setMinWidth(0);
        tblAnimal.getColumnModel().getColumn(0).setMaxWidth(0);
        tblAnimal.getColumnModel().getColumn(7).setMinWidth(100);
        tblAnimal.getColumnModel().getColumn(7).setMaxWidth(100);
        modelo.addRow(new Object[]{
            ani.getId(),
            ani.getTipo(),
            ani.getNome(),
            ani.getRaca(),
            ani.getIdade(),
            ani.getPeso(),
            ani.getAlimento(),
            ((Ave) ani).getCod_liberacao()});
    }

    public void insereLinhaAve(Animal ani) {
        DefaultTableModel modelo = (DefaultTableModel) tblAnimal.getModel();
        modelo.setRowCount(0);

        tblAnimal.getColumnModel().getColumn(0).setMinWidth(0);
        tblAnimal.getColumnModel().getColumn(0).setMaxWidth(0);
        tblAnimal.getColumnModel().getColumn(7).setMinWidth(0);
        tblAnimal.getColumnModel().getColumn(7).setMaxWidth(0);
        modelo.addRow(new Object[]{
            ani.getId(),
            ani.getTipo(),
            ani.getNome(),
            ani.getRaca(),
            ani.getIdade(),
            ani.getPeso(),
            ani.getAlimento()});
    }

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
            java.util.logging.Logger.getLogger(CadastroAnimais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimais.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAnimalCadastrar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> caixaAnimal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodLiberacao;
    private javax.swing.JPanel t;
    private javax.swing.JTable tblAnimal;
    private javax.swing.JTextField txtCodLiberacao;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtQtdAlimento;
    private javax.swing.JTextField txtRaca;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
