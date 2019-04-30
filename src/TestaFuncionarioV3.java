/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaFuncionarioV3 {
      public static void main(String[] args){
        FuncionarioV3 F3 = new FuncionarioV3();
        F3.Nome_Func = "Lucas Cardoso";
        F3.RG = "13583087659"; 
        F3.Salario = 2000;
        F3.Ativo = true;
        F3.Departamento = "RH";
        
        Data D3 = new Data();
        D3.dia = 13;
        D3.mes = 03;
        D3.ano = 1997;
      
        
        F3.mostrar(D3);
       
        
      }
}
