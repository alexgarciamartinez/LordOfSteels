/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author alexg
 */
public class Mitja extends Personatges{
    
    public Mitja(double forca, double constitucio, double velocitat, 
               double inteligencia, double sort, Arma arma){
        super(forca, constitucio, velocitat, inteligencia, sort, arma);
        
    }
    
    @Override
    protected void calculaEstadistiquesDerivades() {
        super.calculaEstadistiquesDerivades(); 
        pe = velocitat+ sort + inteligencia + forca;
    } 
}
    

