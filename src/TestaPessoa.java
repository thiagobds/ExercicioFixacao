/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaPessoa {
 public static void main(String[] args){
     Pessoa p1 = new Pessoa ();
     p1.nome = "Lucas Cardoso";
     p1.idade = 21;
     p1.FazAniversario();
     System.out.println("Parabéns" +" "+ p1.nome+" " + "Você está fazendo " + p1.idade);
      p1.FazAniversario();
      System.out.println("Parabéns" +" "+ p1.nome+" " + "Você está fazendo " + p1.idade);
       p1.FazAniversario();
     
     System.out.println("Parabéns" +" "+ p1.nome+" " + "Você está fazendo " + p1.idade);
 
     
     
     
 }   
}
