/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class FuncionarioV4 {
    String Nome_Func;
    String Departamento;
    double Salario;
    String RG;
    boolean Ativo;
    Data Data_Entrada;
    
     void mostrar(Data d){
        System.out.println(Nome_Func);
        System.out.println(Departamento);
        System.out.println(Salario);
        System.out.println(d.dia + " " +  d.mes + " " +  d.ano);
         
 
        System.out.println(RG);
        System.out.println(Ativo);
     }
     
     boolean equals(FuncionarioV4 comp) {
        FuncionarioV4 aux = (FuncionarioV4) comp;
		if(this.Nome_Func.equals(aux.Nome_Func))
			return true;
		return false;
	}
     }
    

