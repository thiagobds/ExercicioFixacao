/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaFuncionarioV2 {
      public static void main(String[] args){
        FuncionarioV2 F2 = new FuncionarioV2();
        F2.Nome_Func = "John Herbert";
        F2.RG = "123456789"; 
        F2.Salario = 1000;
        F2.Ativo = true;
        F2.Data_Entrada = "13/03/1997";
        F2.Departamento = "TI";
        
        F2.mostrar();
        
      }
}
