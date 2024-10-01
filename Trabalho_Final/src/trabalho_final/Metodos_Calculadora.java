/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_final;

import javax.swing.JOptionPane;

/**
 *
 * @author 18320283647
 */
public class Metodos_Calculadora { 


public String soma (String num1,String num2){ //INICIO DO METODO SOMA
    double num1Double = Double.parseDouble(num1);
    double num2Double = Double.parseDouble(num2);
    double resultado = num1Double + num2Double;
    
    return String.valueOf(resultado); //converte o Double em String de maneira mais facil

}//FIM DO METODO SOMA
   
public String sub (String num1,String num2){//INICIO DO METODO SUBTRAÇÃO
    double num1Double = Double.parseDouble(num1);
    double num2Double = Double.parseDouble(num2);
    double resultado = num1Double - num2Double;
    
    return String.valueOf(resultado); //converte o Double em String de maneira mais facil

}//FIM DO METODO SUBTRAÇÃO

public String div (String num1,String num2){//INICIO DO METODO DIVISÃO
    if (num1.equals("0")||num2.equals("0")){
       JOptionPane.showMessageDialog(null,"ERRO!!!NENHUM NUMERO È DIVISIVEL POR ZERO");
       return "";
    }else{
    double num1Double = Double.parseDouble(num1);
    double num2Double = Double.parseDouble(num2);
    double resultado = num1Double / num2Double;
    return String.valueOf(resultado); //converte o Double em String de maneira mais facil
    }
}//FIM DO METODO DIVISÃO


public String mult (String num1,String num2){ //INICIO DO METODO MULTIPLICAÇÃO
    double num1Double = Double.parseDouble(num1);
    double num2Double = Double.parseDouble(num2);
    double resultado = num1Double * num2Double;
    
    return String.valueOf(resultado); //converte o Double em String de maneira mais facil

}//FIM DO METODO MULTIPLICAÇÂO





}
