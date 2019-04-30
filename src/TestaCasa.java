/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaCasa {
    public static void main(String[] args){
        Casa c1 = new Casa();
        c1.cor = "Azul";
        c1.por1 = true;
        c1.por2 = false;
        c1.por3 = true;
        
        c1.pinta("verde");
        c1.quantasPortasEstaoAbertas();
        
        
        
    }
    
}
