package logica.untitled2.src;

import java.util.Scanner;

public class MainLogica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String nomeDoFilmeAC = "";
            boolean fileira1[] = new boolean[10];
            System.out.println("Qual filme vc quer cadastrasr");

            nomeDoFilmeAC = sc.next();

            String filmes[] = new String[10];
            for(int index = 0; index <= filmes.length; index++){
                if(filmes[index] != null){
                    System.out.println(index);
                    System.out.println(filmes[index]);
                    filmes[index] = nomeDoFilmeAC;
                    break;

                }
            }

        }
    }
}
