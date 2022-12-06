/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Menu;
import view.FormCadastroView;
import view.MenuView;

/**
 *
 * @author Michel2
 */
public class MenuController {
    
   private final MenuView view;

   public MenuController(MenuView view) {
        this.view = view;
   }
    public void navegarParaFormCadastroView(){
        
        FormCadastroView form = new FormCadastroView();
        form.setVisible(true);       
    }
}
