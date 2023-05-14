/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author alexg
 */
public class MaiaOrdre extends Maia implements Ordre{
    public MaiaOrdre(String nom, double forca, double constitucio, double velocitat, 
               double inteligencia, double sort, Arma arma){
        super(nom, forca, constitucio, velocitat, inteligencia, sort, arma);
        
    }
    public void restauraPS(){
        this.ps = (int)(this.ps * 1.10);
    }
}
