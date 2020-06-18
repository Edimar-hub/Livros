
package livros;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JOptionPane;
import java.util.*;

public class Livros {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
         JSONObject livro2 = new JSONObject();
         JSONObject livro = new JSONObject();
            
         List<JSONObject> livros=new ArrayList();
         
                 
        //preenche o objeto com os campos: titulo, ano e genero
        livro.put("titulo", "JSON x XML: a Batalha Final");
        livro.put("ano", 2012);
        livro.put("genero", "Ação");
         livro.put("valor", "R$ 330");
         livros.add(livro);
         
         livro2.put("titulo", "java x C++: A Batalha Inicial");
        livro2.put("ano", 2020);
        livro2.put("genero", "ficcao");
         livro2.put("valor", "R$ 500");
         livros.add(livro2);
         
         for(JSONObject item : livros)
                 {
                         System.out.println(item.get("titulo"));
                 
                         System.out.println(item.get("ano"));
                 
                         System.out.println(item.get("genero"));
                         
                         System.out.println(item.get("valor"));
                         
    }
         
                         
       
         
         
         
       /* //serializa para uma string e imprime
        String json_string = livro.toString();
        System.out.println("objeto original -> " + json_string);
        System.out.println();
         
        //altera o titulo e imprime a nova configuração do objeto
        livro.put("titulo", "JSON x XML: o Confronto das Linguagens");
        json_string = livro.toString();
        System.out.println("objeto com o título modificado -> " + json_string);
        System.out.println();
         
        //recupera campo por campo com o método get() e imprime cada um
        String titulo = livro.getString("titulo");
        Integer ano = livro.getInt("ano");
        String genero = livro.getString("genero");
         
        System.out.println("titulo: " + titulo);
        System.out.println("ano: " + ano);
        System.out.println("genero: " + genero);
        
        
        
        
        
         Biblioteca biblio = new Biblioteca();
       
        biblio.setNome(JOptionPane.showInputDialog("Nome da Biblioteca:"));
        biblio.setLocal(JOptionPane.showInputDialog("Localização da Biblioteca:"));
        biblio.criaLivros(Integer.parseInt(
                JOptionPane.showInputDialog("Capacidade de Livros:")));
       
        Livro livro;
        int opcao = 0;
        String opcoes =
          "Biblioteca: "+ biblio.getNome()+
          "\nLocalização: "+ biblio.getLocal()+
          "\n\n***Opções*** "+
          "\n1. Cadastrar Livro"+
          "\n2. Pesquisar Livro (código)"+
          "\n3. Pesquisar Livro (título)"+
          "\n4. Listar Livros"+
          "\n5. Informações"+
          "\n6. Finalizar"+
          "\n\nSelecione a opção: ";

        while (opcao != 6)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes,
                    "Biblioteca "+biblio.getNome(),JOptionPane.QUESTION_MESSAGE));

            switch(opcao)
            {
              case 1:
                biblio.incluirLivro(digitarLivro());
                JOptionPane.showMessageDialog(null, "Livro Cadastrado!\nTotal: "+
                        biblio.getQuantidade()+" livro(s)");
                break;
              case 2:
                  livro = biblio.obterLivro(Integer.parseInt(
                          JOptionPane.showInputDialog("Digite código para pesquisar:")));
                  if (livro != null)
                      mostrarLivro(livro,biblio.getNome());
                  else
                      JOptionPane.showMessageDialog(null, "Livro Não Localizado!");
                break;
              case 3:
                  livro = biblio.obterLivro(Integer.parseInt(JOptionPane.showInputDialog("Digite Título do Livro para pesquisar:")));
                  if (livro != null)
                      mostrarLivro(livro,biblio.getNome());
                  else
                      JOptionPane.showMessageDialog(null, "Livro Não Localizado!");
                break;
              case 4:
              {
                  StringBuilder lista = new StringBuilder();
                  lista.append("Lista de Livros Cadastrados:\n");
                  for (int i=0;i<biblio.getQuantidade();i++)
                  {
                      livro = biblio.getLivro(i);
                      lista.append(livro.getCodigo()).append(" - ").append(livro.getTitulo()).append(" - ").append(livro.getAutor()).append(" - ").append(livro.getNumPaginas()).append(" pags.\n");
                  }
                  lista.append("Total: ").append(biblio.getQuantidade()).append(" livro(s)");
                  JOptionPane.showMessageDialog(null, lista.toString());
                  break;
              }
              case 5:
                    JOptionPane.showMessageDialog(null, "\n"+"Capacidade de Livros: "+
                            "Informações da Biblioteca\n"+
                            "Nome da Biblioteca: "+biblio.getNome()+"\n"+
                                    "Localização: "+biblio.getNome()+biblio.getCapacidade()+"\n"+
                            "Existem até o momento\n"+biblio.getQuantidade()+
                            " livro(s) cadastrado(s)");
                    break;
            }
        }
        System.out.println("# Fim do Programa #");
        System.out.println("bye...");
    }
   
    static Livro digitarLivro()
    {
        Livro liv = new Livro();
        liv.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do Livro:")));
        liv.setTitulo(JOptionPane.showInputDialog("Título do Livro:"));
        liv.setAutor(JOptionPane.showInputDialog("Autor do Livro:"));
        liv.setISBN(JOptionPane.showInputDialog("Número ISBN do Livro:"));
        liv.setNumPaginas(Integer.parseInt(JOptionPane.showInputDialog("Numero de Páginas do Livro:")));
        liv.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Valor de Compra:")));
        return liv;
    }
       
    static void mostrarLivro(Livro x,String bib)
    {
        String texto = "Livro:\n"+
        "\nCódigo: "+x.getCodigo()+
        "\nTítulo: "+x.getTitulo()+
        "\nAutor: "+x.getAutor()+
        "\nISBN: "+x.getISBN()+
        "\nPáginas: "+x.getNumPaginas()+
        "\nValor: "+x.getValorCompra();
        JOptionPane.showMessageDialog(null, texto, "Biblioteca: "+bib,
                JOptionPane.WARNING_MESSAGE);
*/    
}
    
}
