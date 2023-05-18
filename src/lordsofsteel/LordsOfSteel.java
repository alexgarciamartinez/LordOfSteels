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
        Huma h1 = new Huma("Goku",8,6, 13,16,16,new Arma("Espasa"));
        Mitja mi1 = new Mitja("Roberto",9,7,7,15,16,new Arma("Martell"));
        Maia ma1 = new Maia("Nil",7,9,12,15,17,new Arma("Daga"));
        
        ArrayList<Personatges> personatges = new ArrayList<Personatges>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);
        
        boolean sortirMenu = false;
        while (!sortirMenu){
            System.out.println("");
            System.out.println("**MENÚ PRINCIPAL**");
            System.out.println("1.- Afegir personatge");
            System.out.println("2.- Esborrar personatge");
            System.out.println("3.- Editar personatge");
            System.out.println("4.- Iniciar combat");
            System.out.println("5.- Sortir");
            System.out.println("");
            System.out.println("Tria l'opció [1-5]: ");
            //String entrada = sc.nextLine();
            int opcio = sc.nextInt();

            switch(opcio){
                case 1: // Afegir nou personatge
                    afegirPersonatge(personatges);
                    break;
                case 2: // Esborrar un personatge
                    esborrarPersonatge(personatges);
                    break;
                case 3: // Editar un personatge
                    break;
                case 4: // Iniciar un combat
                    iniciarCombat(personatges);
                    break;
                case 5: // Sortir
                    sortirMenu = true;
                    break;
            }    
        }
    }
    public static void afegirPersonatge(ArrayList<Personatges> personatges){
        System.out.println("1- Nan ");
        System.out.println("2- Humà ");
        System.out.println("3- Mitjà ");
        System.out.println("4- Maia ");
        System.out.print("Classe de personatge: ");
        int classePersonatge = sc.nextInt();
        sc.nextLine();
        System.out.print("Nom del personatge: ");
        String nomPersonatge = sc.nextLine();
        System.out.print("Força del personatge: ");
        double forca = sc.nextDouble();
        System.out.print("Constitució del personatge: ");
        double constitucio = sc.nextDouble();
        System.out.print("Velocitat del personatge: ");
        double velocitat = sc.nextDouble();
        System.out.print("Intel·ligencia del personatge: ");
        double inteligencia = sc.nextDouble();
        System.out.print("Sort del personatge: ");
        double sort = sc.nextDouble();
        sc.nextLine();
        System.out.print("Arma del personatge: ");
        String tipus = sc.nextLine();
        
        switch (classePersonatge){
            case 1:
                personatges.add(new Nan(nomPersonatge,forca,constitucio, 
                    velocitat,inteligencia,sort,new Arma(tipus)));
                break;
            case 2:
                personatges.add(new Huma(nomPersonatge,forca,constitucio, 
                    velocitat,inteligencia,sort,new Arma(tipus)));
                break;
            case 3:
                personatges.add(new Mitja(nomPersonatge,forca,constitucio, 
                    velocitat,inteligencia,sort,new Arma(tipus)));
                break;
            case 4:
                personatges.add(new Maia(nomPersonatge,forca,constitucio, 
                    velocitat,inteligencia,sort,new Arma(tipus)));
                break;
        }
    }
    
    public static void esborrarPersonatge(ArrayList<Personatges> personatges){
        System.out.println("Quin personatge vols eliminar? ");
        for (int i = 0; i < personatges.size(); i++){
            System.out.println(i + ": " + personatges.get(i).getNom());
        }
        System.out.print("Personatge a eliminar: ");
        int personatgeEliminat = sc.nextInt();
        personatges.remove(personatgeEliminat);
        
    }
    public static void iniciarCombat(ArrayList<Personatges> personatges){
        boolean[] seleccionats = new boolean [personatges.size()];
        Personatges[] lluitadors = new Personatges[2];
        for (int selec = 1; selec <= 2; selec++){
            for (int i = 0; i < personatges.size(); ++i){
                if (!seleccionats[i]){
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
                    System.out.printf("%d %s (%s)\n",(i+1), personatges.get(i).getNom(),
                                                  tipus);
                }
            }    
            System.out.println("\nTria un personatge: " + selec + " :");
            int opcio = sc.nextInt();
            seleccionats[opcio-1] = true;
            lluitadors[selec - 1]= personatges.get(opcio-1);
            System.out.println("Personatge triat: " + personatges.get(opcio-1).getNom());
        }
        
        // Inici combat
        Personatges atacant  = lluitadors[0];
        Personatges defensor = lluitadors[1];
        atacant.calculaEstadistiquesDerivades();
        defensor.calculaEstadistiquesDerivades();
        int contador = 0;
        do{
            System.out.println("===== RONDA " + contador + " =====");
            System.out.println("Atacant: " + atacant.getNom() + " " + atacant.getPs());
            System.out.println("Defensor: " + defensor.getNom() + " " + defensor.getPs());
            Dau dau1 = new Dau();
            Dau dau2 = new Dau();
            Dau dau3 = new Dau();

            int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            System.out.println("Valor daus: " + valor);

            if (valor <= atacant.getPa()) { 
                valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
                if (valor > defensor.getPe()) { // 
                    defensor.setPs(defensor.getPs() - atacant.getPd());
                }
            }
            

            // Final ronda
            Personatges aux = atacant;
            atacant  = defensor;
            defensor = aux;
            contador++;
            if (atacant.getPs() == 0){
                System.out.println(defensor.getNom() + " guanya");
            } else if (defensor.getPs() == 0){
                System.out.println(atacant.getNom() + " guanya");
            }
        } while(atacant.getPs() > 0 && atacant.getPs() > 0);
    }
    
}

