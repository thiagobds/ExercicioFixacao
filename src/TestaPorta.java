/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaPorta {
    public static void main (String [] args){
        
        Porta po = new Porta();
        po.aberta = false;
        po.cor = "verde";
        po.dimensaoX = 12;
        po.dimensaoY = 11;
        po.dimensaoz = 10;
   
       
        
        
        
        
        po.abre();
        po.fecha();
        po.pinta("preto");
        po.estaAberta();
       
        
    }
}
