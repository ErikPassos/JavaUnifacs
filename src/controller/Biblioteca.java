/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import view.*;
import model.Livro;
/**
 *
 * @author erikpassos
 */
public class Biblioteca {
    
    //Criando objeto da minha tela, static pq vai ser a única tela em execução
    public static TelaBiblioteca telaBiblio;
    //Criando uma única lista para acessar livro
    public static List<Livro> livros;
    
    public static void main(String[] args){
        
        livros= new ArrayList<Livro>(); //Uma lista do objeto livro


        //Setando meu form principal
        telaBiblio = new TelaBiblioteca();
        
        //deixando visível
        telaBiblio.setVisible(true);
    
    
    
    }
    
    
}
