/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class FuncionarioV1 {
    String Nome_Func;
    String Departamento;
    double Salario;
    String Data_Entrada;
    String RG;
    boolean Ativo;
    
    
    void bonifica (double aumento){
    double res;
    res = (Salario * aumento) / 100;
    Salario = Salario + res;
}
    void demite (){
        if(Ativo == false)
        {
            Ativo = false;
        }
    }
    
    
    
    
}


