/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaFuncionarioV1 {
   public static void main(String[] args){
        FuncionarioV1 F1 = new FuncionarioV1();
        F1.Nome_Func = "John Herbert";
        F1.RG = "123456789"; 
        F1.Salario = 1000;
        F1.Ativo = true;
        F1.Data_Entrada = "13/03/1997";
        F1.Departamento = "RH";
        
        F1.bonifica(10);
                System.out.println(F1.Salario);
        F1.demite();
                System.out.println(F1.Ativo);
    }
    
}
