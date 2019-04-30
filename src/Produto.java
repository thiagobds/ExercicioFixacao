/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class Produto {
    double preco;
    String nome;
    
    void diminuir10(){
      double res;
      res = (preco * 10) / 100;
      preco = preco - res;
     
    }
    
    void aumenta25(){
     double res2;
     res2 = (preco * 25) / 100;
     preco = preco + res2;
    
    }
}
