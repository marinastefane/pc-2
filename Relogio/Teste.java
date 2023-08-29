package Relogio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Relogio rolex = new Relogio();
        
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Modelo de relogio 12h ou 24h? ");
            String formato = s.next();
            
            if (formato.equals("24h")){
                for(int h = 0; h < 24; h++){
                    for(int m = 0; m < 60; m++){
                        rolex.ticTac();
                        System.out.print(rolex.getHora().getValor());
                        System.out.print(":");
                        System.out.println(rolex.getMinuto().getValor());
                    }
                }   
            }

            else{
                for(int h = 1; h < 12; h++){
                    for(int m = 0; m < 60; m++){
                        rolex.ticTac();
                        String time = rolex.mostrarHora();
                        System.out.println(time);
                        
                    }
                }
            }
        }
    }
        
    
}
