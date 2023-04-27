package lordsofsteel;

import <any?>;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexg
 */
public class Huma extends Personatges{
    
    public Huma(double forca, double constitucio, double velocitat, 
               double inteligencia, double sort, Arma arma){
        super(forca, constitucio, velocitat, inteligencia, sort, arma);
        
    }
    
    protected void calculaEstadistiquesDerivades() {
        super.calculaEstadistiquesDerivades(); 
        ps = constitucio + forca + inteligencia;
    } 
}
