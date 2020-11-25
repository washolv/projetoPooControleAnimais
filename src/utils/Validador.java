/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.awt.Color;
import java.util.InputMismatchException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author w_olv
 */
public class Validador {

    public static boolean ValidaNomes(JTextField nomeTxt) {

        if (nomeTxt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Verifique se o campo " + nomeTxt.getName() + " está preenchido.");
            nomeTxt.setBackground(Color.red);
            return false;
        } else {
            nomeTxt.setBackground(Color.white);
            return true;
        }
    }

    public static boolean ValidarNumeros(JTextField pTxt) {
        try {
            if (pTxt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            int numero = Integer.parseInt(pTxt.getText());
            pTxt.setBackground(Color.white);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Falha ao converter o campo " + pTxt.getName() + " em inteiro.");
            pTxt.setBackground(Color.red);
            return false;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor para o campo " + pTxt.getName());
            pTxt.setBackground(Color.red);
            return false;
        }
    }

    public static boolean ValidaComboBox(JComboBox txtCombo) {
        String setor = (String) txtCombo.getSelectedItem();
        if(setor=="Nenhum"){
            JOptionPane.showMessageDialog(null, "Selecione o Setor do Produto");
            return false;
        }
        return true;
    }

    public static boolean ValidarDecimais(JTextField decimalTxt) {
        try {
            if (decimalTxt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            double numero = Double.parseDouble(decimalTxt.getText());
            decimalTxt.setBackground(Color.white);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Falha ao converter o campo " + decimalTxt.getName() + " em decimal.");            
            decimalTxt.setBackground(Color.red);
            return false;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor para o campo " + decimalTxt.getName());
            decimalTxt.setBackground(Color.red);
            return false;
        }
    }

   
    
    }

