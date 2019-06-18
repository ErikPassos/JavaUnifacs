/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Livro;
/**
 *
 * @author erikpassos
 */
public class LivroController {
    
    // referenciar a classe Agenda para acessar a lista
       static Biblioteca biblio; // acessando minha classe principal atraves dessa classe
    
    
   
    public static void inserirTabela(JTable tabela, List<Livro> con){
     //Preencher tabela, static para chamar ele direto, sem precisar instanciar
    //vai ser public, pois irei chamar ele em outra classe
    //Passar a tabela no parametro e minha lista
    
    //Pegando as configurações da tabela -> afirmando que o modelo desse getModel, é um modelo padrão do java
    DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
    dtm.setRowCount(con.size());//contando quantos itens tem minha lista, adaptar de acordo com a dinâmica do for
    tabela.setModel(dtm);//Garantindo que a tabela vai ser preenchida corretamente
    
    int linha=0; // posicão inicial da linha
    for (Livro a: con){ //pegando um item de con e atribuindo a variálvel a
         tabela.setValueAt(a.getNome(), linha,0); //0 coluna
         tabela.setValueAt(a.getEditora(), linha,1);//1 coluna
         tabela.setValueAt(a.getEdicao(), linha,2);//2 coluna
         tabela.setValueAt(a.getArea(), linha,3);//3 coluna
         
         linha++; // pecorrendo minha linha.
    
    }
    
    
    
    }
    
    public static void cadastrarLivro(String nome, String editora, String edicao, String area){
       //Criando objeto do tipo Livro
        Livro c= new Livro();
        c.setNome(nome);
        c.setEditora(editora);
        c.setEdicao(edicao);
        c.setArea(area);
        
        //add novo livro
        biblio.livros.add(c);
        
        //retornando uma msg para o usuário
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! :)");
       
        
    }
    
    public static void editarLivro(String nome, String editora, String edicao, String area, int pos){
     //Criando objeto do tipo livro
         Livro c= new Livro();
        c.setNome(nome);
        c.setEditora(editora);
        c.setEdicao(edicao);
        c.setArea(area);
        
        //editar livro 
        biblio.livros.set(pos, c);
        
        //retornando uma msg para o usuário
        JOptionPane.showMessageDialog(null, "Livro editado com sucesso! :)");
       
    
    }
    
      public static void excluirLivro(JTable tabela){
          //Quando não se tem nenhuma linha selecionada, é igual a -1
          if(tabela.getSelectedRow()==-1){
              JOptionPane.showMessageDialog(null, "Selecione qual linha deseja excluir -> ERROR");
          
          }else{
              
             int res = JOptionPane.showConfirmDialog(null, "Desaja mesmo excluir ?", "Excluir", JOptionPane.YES_NO_OPTION);
             if(res == JOptionPane.YES_OPTION){
              Biblioteca.livros.remove(0);
              JOptionPane.showMessageDialog(null, "Livro Excluido com Sucesso!!");
          }
           
          
          
          
          }
    
    }

   
    
}
