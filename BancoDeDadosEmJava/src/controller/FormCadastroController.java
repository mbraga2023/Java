/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CadastroNovo;
import view.FormCadastroView;

/**
 *
 * @author Michel2
 */
public class FormCadastroController {
    
    private FormCadastroView view;

    public FormCadastroController(FormCadastroView view) {
        this.view = view;
    }
    
    public void salvaUsuario(){
        
              
        String login = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        CadastroNovo novoLogin = new CadastroNovo(login,senha);
        
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(novoLogin);
            
            JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso");
            
            
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
