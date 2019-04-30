/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class Casa {
    String cor;
    boolean por1;
    boolean por2;
    boolean por3;
    
    void pinta (String s){
    cor = s;
    System.out.println(cor);
    }
int quantasPortasEstaoAbertas (){
    int a=0;
   
    if (por1==true)

    a++;
        
               
       if (por2==true)
        a++;
             
      
    
   if (por3==true)
        a++;
               
        
    System.out.println("o numero de portas abertas é" + a);
   
    
         return 0;
}
    
   
}
