/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Michel2
 */
public class Conexao {
    public Connection getConnection() throws SQLException{
        java.sql.Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cursojava","postgres", "postgres");
        return conexao;
    }

  
    
}
