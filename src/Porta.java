/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class Porta {
 boolean aberta;
 String cor;
 double dimensaoX;
 double dimensaoY;
 double dimensaoz;
 
 
 void abre(){
 aberta = true;
 }
 
  void fecha(){
  aberta = false;

 
  
  }

void pinta (String s){
    cor = s;
    System.out.println(cor);
      

}
 boolean estaAberta (){
     if(aberta == true)
     {
         System.out.println("Aberta");
         
     }
     if(aberta == false)
     {
         System.out.println("Fechado");
     }
     return false;
 
           

        
}
}