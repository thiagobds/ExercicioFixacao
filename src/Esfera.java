/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class Esfera {
    double raio;
    double volume;
    
    void calculaVol(){
        volume = (4.0/3) * Math.PI * Math.pow(raio, 3);
    }
    
}
