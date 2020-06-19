
package livros;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JOptionPane;
import java.util.*;

public class Livros {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
     
        
         JSONObject livro = new JSONObject();
         JSONObject livro2 = new JSONObject();
         JSONObject livro3 = new JSONObject();
         JSONObject livro4 = new JSONObject(); 
         JSONObject livro5 = new JSONObject();
         
         List<JSONObject> livros=new ArrayList();
         
         
       
       /* int opcao = 0;
        JSONObject titulo = livro;
        String opcoes;
        opcoes = " selecione o livros da lista : "+livro.get("titulo")+
                "\nLocalização: "+ livro.get("genero")+
                "\n\n***Opções*** "+
                "\n2. Pesquisar Livro (código)"+
                "\n3. Pesquisar Livro (genero)"+
                "\n4. Listar Livros"+
                "\n6. Finalizar"+
                "\n\nSelecione a opção: ";
             
         */     
                 
        //preenche o objeto com os campos: titulo, ano e genero
        livro.put("titulo", "JSON x XML: a Batalha Final");
        livro.put("ano", 2012);
        livro.put("genero", "Ação");
         livro.put("valor",  330);
         livros.add(livro);
         
         livro2.put("titulo", "java x C++: A Batalha Inicial");
        livro2.put("ano", 2020);
        livro2.put("genero", "ficcao");
         livro2.put("valor",  500);
         livros.add(livro2);
         
         livro3.put("titulo", "PHP x JS: orientado a obejeto ");
        livro3.put("ano", 2017);
        livro3.put("genero", "fantasia");
         livro3.put("valor",  670);
         livros.add(livro3);
         
         livro4.put("titulo", "delph x C#: a Parceria ");
        livro4.put("ano", 1988);
        livro4.put("genero", "ficcao");
         livro4.put("valor",  900);
         livros.add(livro4);
         
         livro5.put("titulo", "java x JS: Brincando com codigos ");
        livro5.put("ano", 2021);
        livro5.put("genero", "ficcao");
         livro5.put("valor",  900);
         livros.add(livro5);
         
                  Collections.sort(livros,(l1,l2)->{return l1.getInt("valor")-l2.getInt("valor");});
                          
         for(JSONObject item : livros)
                 {
                         System.out.println(item.get("titulo"));
                 
                         System.out.println(item.get("ano"));
                 
                         System.out.println(item.get("genero"));
                         
                         System.out.println(item.get("valor"));
                         
                         
                         
    }
    }

    private static class json {

        private static String get(String titulo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public json() {
        }
    }
         
                         
       
}
         
      