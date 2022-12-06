/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.CadastroNovo;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author Michel2
 */
public class LoginController {
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        //buscar um usuario da View
        String usuario =view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        CadastroNovo usuarioAutenticar = new CadastroNovo(usuario,senha);
        
        //Verificar se existe o usuario no Banco de Dados
         Connection conexao = new Conexao().getConnection();
         UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
         
         boolean existe = usuarioDao.existeNoBancoUsuarioESenha(usuarioAutenticar);
         
        
        //Se existir direciona para página Menu
        
        if (existe){
             MenuView telaDeMenu = new MenuView();
            telaDeMenu.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(view, "Usuario ou senha inválidos");
        }
        
       
    }
    
    
    
}
