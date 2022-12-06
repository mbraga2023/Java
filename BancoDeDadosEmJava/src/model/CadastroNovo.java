/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class CadastroNovo{
    private int id;
    private String login;
    private String senha;

    public CadastroNovo(int id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public CadastroNovo(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setUsuario(String usuario) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
