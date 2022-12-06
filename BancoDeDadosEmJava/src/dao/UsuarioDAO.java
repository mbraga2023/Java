/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CadastroNovo;

/**
 *
 * @author Michel2
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public CadastroNovo insert (CadastroNovo login) throws SQLException{
                  
            
            String sql = "insert into admin (login,senha) values (?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, login.getLogin());
            statement.setString(2, login.getSenha());
            statement.execute();
                                  
            
                return login;             
        }
    /*public void update(CadastroNovo usuario) throws SQLException{
          String sql = "update usuario set usuario = ?, senha = ? where id= ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getUsuario());
            statement.setString(2, usuario.getSenha());
            statement.setInt(3, usuario.getId());
            statement.execute();
        
    }
    
    public void insertOrUpdate(CadastroNovo usuario) throws SQLException{
        if (usuario.getId() >0){
            update(usuario);
        }else{
            insert(usuario);
        }
    }
    
    public void delete(CadastroNovo usuario) throws SQLException{
           String sql = "delete from usuario where id= ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, usuario.getId());
            statement.execute();
    }
    
    public ArrayList<Usuario> selectAll() throws SQLException{
        String sql = "select * from usuario";
            PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);    
    }

    private ArrayList<Usuario> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String usuario = resultSet.getString("usuario");
            String senha = resultSet.getString("senha");
            
            
            CadastroNovo usuarioComDadosDoBanco = new CadastroNovo(usuario, senha);
            usuarios.add(usuarioComDadosDoBanco);
        }
        return usuarios;
    }
    
    public CadastroNovo selectPorId(CadastroNovo usuario) throws SQLException{
        String sql = "select * from usuario where id= ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, usuario.getId());
       
           return pesquisa(statement).get(0);
                           
    }
*/
    public boolean existeNoBancoUsuarioESenha(CadastroNovo usuarioNovo) throws SQLException {
        String sql = "select * from usuario where usuario = ? and senha =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuarioNovo.getLogin());
        statement.setString(2, usuarioNovo.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
       return resultSet.next();
            
    }

   
        
}
