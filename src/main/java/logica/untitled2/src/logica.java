package logica.untitled2.src;

import java.util.Scanner;

public class logica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeFilme = "";

        System.out.print("quanto filme deve ter no total: ");
        int numeros = input.nextInt();
        String filmes[] = new String[numeros];
        String horarios[][] = new String[numeros][3];

        System.out.print("Nome do filme: ");
        nomeFilme = input.next();

        for(int index = 0; index < filmes.length; index++){
            if(filmes[index] == null) {
                filmes[index] = nomeFilme;
                break;
            }
        }
        for(int index = 0; index < horarios.length; index++){
            for(int aux = 0; aux < horarios[index].length; aux++){
                System.out.print("Insira o "+ (aux+1) +" horario: ");
                horarios[index][aux] = input.next();

                System.out.println(horarios[index][aux]);
                if(aux == 2){
                    System.out.println("---------------------------------------------");
                }
            }
        }







    }
}
