/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dao;

import java.sql.*;

/**
 *
 * @author Michel2
 */
public class ModuloConexao {

    //método que estabelece a conexão com o BD
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chamada do driver
        
        //armazenando as informações referentes ao BD
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabecendo a conexão com o BD
        try {
            
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

}
