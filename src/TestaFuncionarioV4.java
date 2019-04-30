/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaFuncionarioV4 {
    
    public static void main(String[] args){
        FuncionarioV4 F4 = new FuncionarioV4();
        F4.Nome_Func = "Hudson Galiza";
        F4.RG = "8812456789"; 
        F4.Salario = 4000;
        F4.Ativo = true;
        F4.Departamento = "Operacao";
        
        Data D4 = new Data();
        D4.dia = 15;
        D4.mes = 04;
        D4.ano = 1994;
        
        FuncionarioV4 F5 = new FuncionarioV4();
        F5.Nome_Func = "Thiago Augusto";
        F5.RG = "9214887452"; 
        F5.Salario = 2500;
        F5.Ativo = true;
        F5.Departamento = "Servicos Gerais";
        
        Data D5 = new Data();
        D5.dia = 14;
        D5.mes = 06;
        D5.ano = 1998;
      
        
        System.out.println(F4.equals(F5));
    }
    
    
}
