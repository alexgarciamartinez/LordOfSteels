/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author alexg
 */
public class Nan extends Personatges{
    
    public Nan(double forca, double constitucio, double velocitat, 
               double inteligencia, double sort){
        super(forca, constitucio, velocitat, inteligencia, sort);
        
    }
    
    protected void calculaEstadistiquesDerivades() {
        super.calculaEstadistiquesDerivades();
        pd = (forca + arma.wpow + constitucio)/4;                
    } 
}
