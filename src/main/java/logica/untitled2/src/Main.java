package logica.untitled2.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeFilme = "";
        String nomeDelet = "";
        String filmes[] = new String[10];
        int cont = 0;
        int aux = 0;

       while (cont != 3){
           while (aux != 2){
               System.out.print("Insira um filme: ");
               nomeFilme = input.next();

               for(int index = 0; index < filmes.length; index++){
                   if(filmes[index] == null) {
                       filmes[index] = nomeFilme;
                       break;
                   }
               }
               aux += 1;
           }

           aux = 0;

           System.out.print("Nome do filme a deletar: ");
           nomeDelet = input.next();

           for(int index = 0; index < filmes.length; index++){
               if(filmes[index] == null){
                   index += 1;
               }
               else {
                   if(filmes[index].equals(nomeDelet)){
                       filmes[index] = null;
                   }
               }

               if(index == filmes.length){
                   break;
               }
               System.out.println(filmes[index]);
           }
           cont += 1;
       }






    }
}
