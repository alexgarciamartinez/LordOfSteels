/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author alexg
 */
public class HumaCaos extends Huma implements Caos{

    public HumaCaos(String nom, double forca, double constitucio, double velocitat, 
               double inteligencia, double sort, Arma arma){
        super(nom, forca, constitucio, velocitat, inteligencia, sort, arma);
        
    }

    public boolean atacReduitPA(int valor) {
        if (valor <= pe){
            this.pa = (int)(0.5 * this.pa);
            return true;
        }
        else{
            return false;
        }
        
    }
}
