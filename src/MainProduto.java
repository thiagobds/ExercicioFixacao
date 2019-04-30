/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class MainProduto {
    public static void main(String [] args){
        Produto p = new Produto();
        p.nome = "John";
        p.preco = 230.0;
        
        p.diminuir10();
        System.out.println(p.preco);
        p.aumenta25();
         System.out.println(p.preco);
        
        
        
    }
    
}
