/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho_final;

import javax.swing.JOptionPane;

/**
 *
 * @autor: Elder Feliper Cardoso Moura instagram: @felipemour005 Objetivo:O
 * objetivo deste código é mostrar que não adianta ter talento se não houver
 * ambição!!!
 */
public class Trabalho_Final {

    public static void main(String[] args) {

        String repetir, qualcase, qualabc, qual; // DECLARAÇÃO DE VARIAVEIS ESSENCIAIS PARA TODOS OS LOOP'S E SWITCH'S
        int repetirInt, i = 0; // DECLARAÇÃO DE VARIAVEIS ESSENCIAIS PARA TODOS OS LOOPS
        JOptionPane.showMessageDialog(null, "O OBJETIVO DESTE CÓDIGO É MOSTRAR QUE NÃO ADIANTA TER TALENTO SE NÃO HOUVER AMBIÇÃO"); // PEQUENA MENSAGEM MOTIVACIONAL SEM IMPORTANCIA NO FUNCIONAMENTO DO CODIGO
        do{ //LOOP DE REPETIÇÃO DE TODOS OS SWITCH, DA UMA SEGUNDA CHANCE PARA OS USUARIOS
        qual = JOptionPane.showInputDialog(null, "QUAL PROGRAMA DESEJA USA? \n \n 1.LAÇOS DE REPETIÇÃO \n 2. ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE); //ENTRADA DE DADOS FUNDAMENTAL PARA A ESCOLHA DO CASE(DO PRIMEIRO SWITCH) 

        switch (qual) { //PRIMEIRO SWITCH, TEM A FUNÇÃO DE DECIDIR QUAL DAS QUESTOES SERÁ EXECULTADA 

            case "1": //PRIMEIRO CASE 1, ENTRA NA QUESTAO N° 13, LAÇOS DE REPETIÇAO
                
                    qualcase = JOptionPane.showInputDialog(null, "QUAL LOOP DESEJA USA? \n \n 1.FOR \n 2.DO WHILE \n 3.WHILE ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE); //ENTRADA DE DADOS RESPONSAVEL PARA SABER EM QUAL CASE O PROGRAMA IRA ENTRAR
                    switch (qualcase) {// SEGUNDO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE OS LOOP'S FOR, DO WHILE E WHILE DA QUESTAO 13
                    
                        case "1":// SEGUNDO CASE 1,RESPONSAVEL PELA ESCOLHA DO LOOP FOR DA QUESTAO 13
                            qualabc = JOptionPane.showInputDialog(null, "QUAL ALTERNATIVA PARA O LOOP FOR? \n \n 1.100 A 0 \n 2.0 A 101 \n 3.RANGE ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE);
                            switch (qualabc) { //TERCEIRO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE A, B E C DA QUESTAO 13
                                case "1": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 13
                                    System.out.println("");
                                    System.out.println("FOR: 100 A 0");
                                    System.out.println("");
                                    for (i = 100; i >= 0; i--) { //PRIMEIRO FOR,  DE 100 A 0 DE 1 EM 1

                                        System.out.println(" i=" + i + " ");
                                    } //FIM DO LOOP FOR

                                    break;

                                case "2":
                                    System.out.println("");
                                    System.out.println("FOR 0 A 101");
                                    System.out.println("");
                                    for (i = 0; i <= 101; i += 3) { //SENGUNDO FOR, DE 0 ATÉ 101 DE 3 EM 3
                                        System.out.println("i= " + i + " ");
                                    } //FIM DO LOOP FOR
                                    break;

                                case "3":
                                    try{
                                    System.out.println("");
                                    System.out.println("FOR RANGE");
                                    System.out.println("");
                                    int min, max;
                                    String num1 = JOptionPane.showInputDialog("DIGITE UM VALOR PARA O RANGE (INTEIRO)");
                                    int num1Int = Integer.parseInt(num1);
                                    String num2 = JOptionPane.showInputDialog("DIGITE OUTRO VALOR (INTEIRO)");
                                    int num2Int = Integer.parseInt(num2);
                                    min = Math.min(num1Int, num2Int);
                                    max = Math.max(num1Int, num2Int);
                                    for (i = min; i <= max; i += 2) { //TERCEIRO FOR, DE 0 ATÉ 101 DE 3 EM 3
                                        System.out.println(" i=" + i + " ");
                                    } //FIM DO LOOP FOR
                                    break;
                                     
                                    }catch(NumberFormatException e){ //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO
                                  
                                    JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");  
                                  
                                  } //FIM DO CATCH  

                                default://TERCEIRO SWITCH
                                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VALIDO!!!");
                                    break;
                            } //FIM TERCEIRO SWITCH
                            break;
                        default: //SEGUNDO SWITCH
                            JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VALIDO!!!");
                            break;
                        
 //---------------------------------------------------------------------------------------------------------------------------------------------------------- /            
            //FIM DO FOR ----------------------------- INICIO DO DO WHILE----------------------------------------------------------------------------------- /
//----------------------------------------------------------------------------------------------------------------------------------------------------------/            
                        
                        case "2":
                            qualabc = JOptionPane.showInputDialog(null, "QUAL ALTERNATIVA PARA O LOOP DO WHILE? \n \n 1.100 A 0 \n 2.0 A 101 \n 3.RANGE ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE);
                            switch (qualabc) { //TERCEIRO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE A, B E C DA QUESTAO 13
                                case "1": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 13
                                   i =100;
                                    System.out.println("");
                                    System.out.println("100 A 0 DO WHILE:");
                                    do{
                                        System.out.println("i="+i);
                                        i--;
                                    }while (i>=0);
                                        
                                    break;//BREAK DO CASE 1
                        
                                    
                                case "2":
                                    i =0;
                                    System.out.println("");
                                    System.out.println("0 A 101 DO WHILE:");
                                    System.out.println("");
                                    do{
                                        System.out.println("i="+i);
                                        i+=3;
                                    }while (i<=101);
                                        
                                    break;//BREAK DO CASE 2
                                    
                                case "3":
                                    try{
                                    System.out.println("");
                                    System.out.println("FOR RANGE");
                                    System.out.println("");
                                    int min, max;
                                    String num1 = JOptionPane.showInputDialog("DIGITE UM VALOR PARA O RANGE (INTEIRO)");
                                    int num1Int = Integer.parseInt(num1);
                                    String num2 = JOptionPane.showInputDialog("DIGITE OUTRO VALOR (INTEIRO)");
                                    int num2Int = Integer.parseInt(num2);
                                    min = Math.min(num1Int, num2Int);
                                    max = Math.max(num1Int, num2Int);
                                    i =min;
                                    System.out.println("");
                                    System.out.println("RANGE DO WHILE:");
                                    System.out.println("");
                                    do{
                                        System.out.println("i="+i);
                                        i+=2;
                                    }while (i<=max);
                                    }catch(NumberFormatException e){ //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO
                                  
                                    JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");  
                                  
                                  } //FIM DO CATCH    
                                    break;//BREAK DO CASE 3
                            
                                default://TERCEIRO SWITCH
                                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VALIDO!!!");
                                    break;
                                    
                            }//FIM DO SWITCH QUALABC
                            break; // do switch
                        
                        
//---------------------------------------------------------------------------------------------------------------------------------------------------------- /            
   //FIM DO LOOP DO WHILE ----------------------------- INICIO DO LOOP WHILE----------------------------------------------------------------------------------- /
//----------------------------------------------------------------------------------------------------------------------------------------------------------/ 
                        
                        case "3": // CASE REFERENTE AO WHILE
                            qualabc = JOptionPane.showInputDialog(null, "QUAL ALTERNATIVA PARA O LOOP WHILE? \n \n 1.100 A 0 \n 2.0 A 101 \n 3.RANGE ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE);
                          
                            
                            switch (qualabc) { //TERCEIRO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE A, B E C DA QUESTAO 13
                            
                                
                                case "1": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 13 
                                    i=100;
                                    System.out.println("");
                                    System.out.println("100 A 0 WHILE");
                                    while (i>=0){
                                            System.out.println("");
                                            System.out.println("i="+i);
                                            System.out.println("");
                                        i--;
                                    
                                    }
                            break; //break do case 1
                            
                            case "2": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 13 
                                    i=0;
                                    System.out.println("");
                                    System.out.println("0 A 101 WHILE");
                                    while (i<=101) {
                                            System.out.println("");
                                            System.out.println("i="+i);
                                            System.out.println("");
                                        i+=3;
                                    
                                    }//FIM WHILE 0 A 101
                            break; //break do case 2
                           
                            case "3":
                                try{ // TRATAMENTO DE ERROS. MUITO IMPORTANTE
                                    System.out.println("");
                                    System.out.println("WHILE RANGE");
                                    System.out.println("");
                                    int min, max;
                                    String num1 = JOptionPane.showInputDialog("DIGITE UM VALOR PARA O RANGE (INTEIRO)");
                                    int num1Int = Integer.parseInt(num1);
                                    String num2 = JOptionPane.showInputDialog("DIGITE OUTRO VALOR (INTEIRO)");
                                    int num2Int = Integer.parseInt(num2);
                                    min = Math.min(num1Int, num2Int);
                                    max = Math.max(num1Int, num2Int);
                                    i =min;
                                    System.out.println("");
                                    System.out.println("RANGE WHILE:");
                                    System.out.println("");
                              
                                    while (i<=max) {
                                        System.out.println("i="+i);
                                        i+=2;
                                    }//FIM WHILE RANGE
                                  }catch(NumberFormatException e){ //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO
                                  
                                    JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");  
                                  
                                  }//FIM DO CATCH    
                                    break;//BREAK DO CASE 3
                            
                            default://TERCEIRO SWITCH
                                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VALIDO!!!");
                                    break;
                            } //FINAL DO 3 SWITCH
                            
                    
                            break; //break do segundo switch
                    
                    }//FIM DO SEGUNDO SWITCH
                    
//---------------------------------------------------------------------------------------------------------------------------------------------------------- /            
 //FIM DO LOOP WHILE ----------------------------- INICIO DO  ----------------------------------------------------------------------------------- /
//----------------------------------------------------------------------------------------------------------------------------------------------------------/ 
    
                break;//break do segundo switch
   
            default://PRIMEIRO SWITCH
                JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VALIDO!!!");
                break;
        }//FIM DO PRIMEIRO SWITCH
                    repetir = JOptionPane.showInputDialog("CASO QUEIRA REPETIR O ALGORITIMO DIGITE 1, OU 0 PARA SAIR");
                    repetirInt = Integer.parseInt(repetir);  
     } while (repetirInt == 1);
        JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR O PROGRAMA \n   ****************************\n   *****(O)************(O)****\n   ****************************\n   ****************************\n   **************^*************\n   *****\\____________/*****\n   ****************************\n   PROGRAMA DESENVOLVIDO POR:\n   ELDER FELIPE C. MOURA ");

    }
}
// lulu bunitao