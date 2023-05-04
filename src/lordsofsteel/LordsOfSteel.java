/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lordsofsteel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alexg
 */
public class LordsOfSteel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Nan n1 = new Nan("Alberto",8,6, 13,16,16,new Arma("Daga"));
        Huma h1 = new Huma("Goku",13,16,6,10,6,new Arma("Espasa"));
        Mitja mi1 = new Mitja("Roberto",9,7,7,15,16,new Arma("Martell"));
        Maia ma1 = new Maia("Nil",7,9,12,15,17,new Arma("Daga"));
        
        ArrayList<Personatges> personatges = new ArrayList<Personatges>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);
        
        System.out.println("");
        System.out.println("**MENÚ PRINCIPAL**");
        System.out.println("1.- Afegir personatge");
        System.out.println("2.- Esborrar personatge");
        System.out.println("3.- Editar personatge");
        System.out.println("4.- Iniciar combat");
        System.out.println("5.- Sortir");
        System.out.println("");
        System.out.println("Tria l'opció [1-5]: ");
        
        String entrada = sc.nextLine();
        int opcio = Integer.parseInt(entrada);
        
        switch(opcio){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                iniciarCombat(personatges);
                break;
            case 5:
                break;
        }
    }
    
    public static void iniciarCombat(ArrayList<Personatges> personatges){
        for (int i = 0; i < personatges.size(); ++i){
            String tipus = "";
            if (personatges.get(i) instanceof Nan){
                tipus = "Nan";
            }
            else if (personatges.get(i) instanceof Huma){
                tipus = "Huma";
            }
            else if (personatges.get(i) instanceof Mitja){
                tipus = "Mitja";
            }
            else if (personatges.get(i) instanceof Maia){
                tipus = "Maia";
            }
            System.out.printf("%d %s\n", (i+1), personatges.get(i).getNom(),
                                          tipus);
        }
        
        System.out.println("\nTria un personatge: ");
        int entrada = sc.nextInt();
    }
}
