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
        int repetirInt,  i = 0; // DECLARAÇÃO DE VARIAVEIS ESSENCIAIS PARA TODOS OS LOOPS
        JOptionPane.showMessageDialog(null, "O OBJETIVO DESTE CÓDIGO É MOSTRAR QUE NÃO ADIANTA TER TALENTO SE NÃO HOUVER AMBIÇÃO"); // PEQUENA MENSAGEM MOTIVACIONAL SEM IMPORTANCIA NO FUNCIONAMENTO DO CODIGO
        do { //LOOP DE REPETIÇÃO DE TODOS OS SWITCH, DA UMA SEGUNDA CHANCE PARA OS USUARIOS
            qual = JOptionPane.showInputDialog(null, "QUAL PROGRAMA DESEJA USA? \n \n 1.LAÇOS DE REPETIÇÃO \n 2.CALCULADORA \n 3.CHURRASCO ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE); //ENTRADA DE DADOS FUNDAMENTAL PARA A ESCOLHA DO CASE(DO PRIMEIRO SWITCH) 

            switch (qual) { //PRIMEIRO SWITCH, TEM A FUNÇÃO DE DECIDIR QUAL DAS QUESTOES SERÁ EXECULTADA 

                case "1": //PRIMEIRO CASE 1, ENTRA NA QUESTAO N° 11, LAÇOS DE REPETIÇAO

                    qualcase = JOptionPane.showInputDialog(null, "QUAL LOOP DESEJA USA? \n \n 1.FOR \n 2.DO WHILE \n 3.WHILE ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE); //ENTRADA DE DADOS RESPONSAVEL PARA SABER EM QUAL CASE O PROGRAMA IRA ENTRAR
                    switch (qualcase) {// SEGUNDO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE OS LOOP'S FOR, DO WHILE E WHILE DA QUESTAO 13

                        case "1":// SEGUNDO CASE 1,RESPONSAVEL PELA ESCOLHA DO LOOP FOR DA QUESTAO 11
                            qualabc = JOptionPane.showInputDialog(null, "QUAL ALTERNATIVA PARA O LOOP FOR? \n \n 1.100 A 0 \n 2.0 A 101 \n 3.RANGE ", "BEM VINDO", JOptionPane.INFORMATION_MESSAGE);
                            switch (qualabc) { //TERCEIRO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE A, B E C DA QUESTAO 11
                                case "1": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 11
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
                                    try {
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

                                    } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

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
                            switch (qualabc) { //TERCEIRO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE A, B E C DA QUESTAO 11
                                case "1": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 11
                                    i = 100;
                                    System.out.println("");
                                    System.out.println("100 A 0 DO WHILE:");
                                    do {
                                        System.out.println("i=" + i);
                                        i--;
                                    } while (i >= 0);

                                    break;//BREAK DO CASE 1

                                case "2":
                                    i = 0;
                                    System.out.println("");
                                    System.out.println("0 A 101 DO WHILE:");
                                    System.out.println("");
                                    do {
                                        System.out.println("i=" + i);
                                        i += 3;
                                    } while (i <= 101);

                                    break;//BREAK DO CASE 2

                                case "3":
                                    try {
                                        System.out.println("");
                                        System.out.println("FOR RANGE");
                                        System.out.println("");
                                        int min, max;
                                        String num1 = JOptionPane.showInputDialog("DIGITE UM VALOR PARA O RANGE (INTEIRO)");
                                        int num1Int = Integer.parseInt(num1);
                                        String num2 = JOptionPane.showInputDialog("DIGITE OUTRO VALOR (INTEIRO)");
                                        int num2Int = Integer.parseInt(num2);
                                        min = Math.min(num1Int, num2Int); //AQUI O METODO DECIDE QUAL É O NUMERO MENOR E ARMAZENA ELE NA VARIAVEL "min".
                                        max = Math.max(num1Int, num2Int); //AQUI O METODO DECIDE QUAL É O NUMERO MAIOR E ARMAZENA ELE NA VARIAVEL "max".
                                        i = min;
                                        System.out.println("");
                                        System.out.println("RANGE DO WHILE:");
                                        System.out.println("");
                                        do {
                                            System.out.println("i=" + i);
                                            i += 2;
                                        } while (i <= max);
                                    } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

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

                            switch (qualabc) { //TERCEIRO SWITCH, RESPONSAVEL PELA ESCOLHA ENTRE A, B E C DA QUESTAO 11

                                case "1": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 11 
                                    i = 100;
                                    System.out.println("");
                                    System.out.println("100 A 0 WHILE");
                                    while (i >= 0) {
                                        System.out.println("");
                                        System.out.println("i=" + i);
                                        System.out.println("");
                                        i--;

                                    }
                                    break; //break do case 1

                                case "2": //TERCEIRO CASE 1, RESPONSAVEL PELA ESCOLHA A DA QUESTAO 11
                                    i = 0;
                                    System.out.println("");
                                    System.out.println("0 A 101 WHILE");
                                    while (i <= 101) {
                                        System.out.println("");
                                        System.out.println("i=" + i);
                                        System.out.println("");
                                        i += 3;

                                    }//FIM WHILE 0 A 101
                                    break; //break do case 2

                                case "3":
                                    try { // TRATAMENTO DE ERROS. MUITO IMPORTANTE
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
                                        i = min;
                                        System.out.println("");
                                        System.out.println("RANGE WHILE:");
                                        System.out.println("");

                                        while (i <= max) {
                                            System.out.println("i=" + i);
                                            i += 2;
                                        }//FIM WHILE RANGE
                                    } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

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
                    //FIM DO LOOP WHILE ----------------------------- INICIO DO CASE 2 DO PRIMEIRO SWITCH  ----------------------------------------------------------------------------------- /
//----------------------------------------------------------------------------------------------------------------------------------------------------------/ 
                    break;//break do segundo switch

                case "2":
                    String qualoperador = JOptionPane.showInputDialog("QUAL OPERADOR DESEJA USAR? \n\n 1.'+' \n 2.'-' \n 3. '/' \n 4.'*' ");
                    switch (qualoperador) {
                        case "1":
                            try{
                            Metodos_Calculadora soma = new Metodos_Calculadora(); //INICIANDO O METODO DA SOMA
                            String num1 = JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO DA SOMA");
                            String num2 = JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO DA SOMA");
                            String resultado = soma.soma(num1, num2); //ENVIANDO OS VALORES PARA O METODO E RECEBENDO O RESULTADO
                            double resultDouble = Double.parseDouble(resultado); //CONVERTENDO O VALOR DE STRING PARA DOUBLE
                            JOptionPane.showMessageDialog(null, "O RESULTADO DA SOMA É " + resultDouble);
                            } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

                                        JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");

                                    }//FIM DO CATCH    
                            break;//break case 1 do switch qualoperador
                        case "2":
                            try{
                            Metodos_Calculadora sub = new Metodos_Calculadora(); //INICIANDO O METODO DA SUBTRAÇÃO
                            String num1 = JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO DA SUBTRAÇÃO");
                            String num2 = JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO DA SUBTRAÇÃO");
                            String resultado = sub.sub(num1, num2); //ENVIANDO OS VALORES PARA O METODO E RECEBENDO O RESULTADO
                            double resultDouble = Double.parseDouble(resultado); //CONVERTENDO O VALOR DE STRING PARA DOUBLE
                            JOptionPane.showMessageDialog(null, "O RESULTADO DA SUBTRAÇÃO É " + resultDouble);
                            } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

                                        JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");

                                    }//FIM DO CATCH    
                            break;//break do case 2 do switch qualoperador

                        case "3":
                            try {
                            Metodos_Calculadora div = new Metodos_Calculadora(); //INICIANDO O METODO DA DIVISÃO
                            String num1 = JOptionPane.showInputDialog("DIGITE O DIVIDENDO DA DIVISÃO");
                            String num2 = JOptionPane.showInputDialog("DIGITE O DIVISOR DA DIVISÃO");
                            String resultado = div.div(num1, num2); //ENVIANDO OS VALORES PARA O METODO E RECEBENDO O RESULTADO
                            double resultDouble = Double.parseDouble(resultado); //CONVERTENDO O VALOR DE STRING PARA DOUBLE
                            JOptionPane.showMessageDialog(null, "O RESULTADO DA DIVISÃO É " + resultDouble);
                            } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

                                        JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");

                                    }//FIM DO CATCH    
                            break;//break do case 3 do switch qualoperador    

                        case "4":
                            try{
                            Metodos_Calculadora mult = new Metodos_Calculadora(); //INICIANDO O METODO DA MULTIPLICAÇÃO
                            String num1 = JOptionPane.showInputDialog("DIGITE O DIVIDENDO DA MULTIPLICAÇÃO");
                            String num2 = JOptionPane.showInputDialog("DIGITE O DIVISOR DA MULTIPLICAÇÃO");
                            String resultado = mult.mult(num1, num2); //ENVIANDO OS VALORES PARA O METODO E RECEBENDO O RESULTADO
                            double resultDouble = Double.parseDouble(resultado); //CONVERTENDO O VALOR DE STRING PARA DOUBLE
                            JOptionPane.showMessageDialog(null, "O RESULTADO DA MULTIPLICAÇÃO É " + resultDouble);
                            } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

                                        JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");

                                    }//FIM DO CATCH    
                            break;//break do case 3 do switch qualoperador    

                        default: //default do Switch qualoperrador
                            JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");
                            break; // break default
                    }//fim switch qualoperador
                    break;//break do case 2 do primeiro switch

                case "3":
                    boolean sair=false;
                    double quantpessoasDouble,refriDouble,sucoDouble,cervejaDouble=0.0;//DECLARAÇÃO DE VARIAVEIS DO TIPO DOUBLE
                    String quantpessoas,refri,cerveja,suco;//DECLARAÇÃO DE VARIAVEIS DO TIPO STRING
                    double carneboi,carneporco,asinha,linguica = 0.0;//DECLARAÇÃO DE VARIAVEIS DO TIPO DOUBLE
                    double quantsuco,quantrefri,quantcerveja = 0.0;////DECLARAÇÃO DE VARIAVEIS DO TIPO DOUBLE
                    double totalboi,totalporco,totalasinha,totalliguica = 0.0;////DECLARAÇÃO DE VARIAVEIS DO TIPO DOUBLE
                   try{
                    do { //LOOP RESPONSAVEL PELA VALIDAÇÃO DE DADOS
                    
                        sair=false;
                    quantpessoas = JOptionPane.showInputDialog("PARA CALCULAR OS GASTOS, PRECISO SABER QUANTAS PESSOAS IRÃO PARTICIPAR NO CHURRASCO");//ENTRADA DE DADOS
                    quantpessoasDouble = Double.parseDouble(quantpessoas);//CONVERTENDO STRING PARA DOUBLE
                    
                    refri = JOptionPane.showInputDialog("DAS " + quantpessoas + " PESSOAS QUANTAS VÃO BEBER REFRIGERANTE?");//ENTRADA DE DADOS
                    refriDouble = Double.parseDouble(refri);//CONVERTENDO STRING PARA DOUBLE
                                        
                    suco = JOptionPane.showInputDialog("DAS " + quantpessoas + " PESSOAS QUANTAS VÃO BEBER SUCO?");//ENTRADA DE DADOS
                    sucoDouble = Double.parseDouble(suco);//CONVERTENDO STRING PARA DOUBLE
                    
                    cerveja = JOptionPane.showInputDialog("DAS " + quantpessoas + " PESSOAS QUANTAS VÃO BEBER CERVEJA?");//ENTRADA DE DADOS
                    cervejaDouble = Double.parseDouble(cerveja);//CONVERTENDO STRING PARA DOUBLE
                    
                    if((refriDouble+sucoDouble+cervejaDouble)>quantpessoasDouble ||(refriDouble+sucoDouble+cervejaDouble)< quantpessoasDouble ){ //VALIDAÇÃO DE DADOS
                                       
                        JOptionPane.showMessageDialog(null, "ERROR!!!ALGUM DOS VALORES UTRAPASSOU OU NAO ALCANÇOU O VALOR DE PARTICIPANTES DIGITADO ANTERIORMENTE, POR FAVOR CORRIJA"); 
                         sair=true ;
                                        
                    }//FIM IF, RESPONSAVEL PELA VALIDAÇÃO DE DADOS
                    
                    
                    }while(sair);
                    
                    
                    quantsuco = (sucoDouble * 250) / 1000;//  PROCESSAMENTO DOS DADOS
                    quantrefri = (refriDouble * 500) / 1000;//  PROCESSAMENTO DOS DADOS
                    quantcerveja = (cervejaDouble * 3000) / 1000;//  PROCESSAMENTO DOS DADOS
                    carneboi = (150 * quantpessoasDouble) / 1000;//  PROCESSAMENTO DOS DADOS
                    carneporco = (80 * quantpessoasDouble) / 1000;//  PROCESSAMENTO DOS DADOS
                    asinha = (100 * quantpessoasDouble) / 1000;//  PROCESSAMENTO DOS DADOS
                    linguica = (80 * quantpessoasDouble) / 1000;//  PROCESSAMENTO DOS DADOS
                    double totalRefri= (7 * quantrefri);
                    double indRefri= (totalRefri/refriDouble);
                    double totalCerveja= (10 * quantcerveja);
                    double indCerveja= (totalCerveja/cervejaDouble);
                    double totalSuco= (5 * quantsuco);
                    double indSuco= (totalSuco/sucoDouble);
                    double totalBebida= (totalRefri+totalCerveja+totalSuco) ;
                    totalboi = (carneboi * 40.00);//  PROCESSAMENTO DOS DADOS
                    double indboi=(totalboi/quantpessoasDouble);
                    totalporco = (carneporco * 30.00);//  PROCESSAMENTO DOS DADOS
                    double indporco=(totalporco/quantpessoasDouble);
                    totalasinha = (asinha * 20.00);//  PROCESSAMENTO DOS DADOS
                    double indasinha=(totalasinha/quantpessoasDouble);
                    totalliguica = (linguica * 15.00);//  PROCESSAMENTO DOS DADOS
                    double indlinguica=(totalliguica/quantpessoasDouble);
                    double totalchurrasco = totalasinha + totalboi + totalporco + totalliguica +totalBebida;//AQUI ACABA O PROCESSAMENTO DOS DADOS.
                    double total = totalasinha + totalboi + totalporco + totalliguica;//AQUI ACABA O PROCESSAMENTO DOS DADOS.
                    
//APARTIR DESSE PONTO COMEÇA A EXIBIR AS INFORMAÇOES PARA O USUARIO
                    JOptionPane.showMessageDialog(null,
                            quantpessoasDouble + " PESSOAS IRÃO PARTICIPAR DO CHURRASCO.\n\n"
                            + cerveja + " PESSOAS IRÃO BEBER CERVEJA.\n" 
                            + suco + " PESSOAS IRÃO BEBER SUCO.\n" 
                            + refri + " PESSOAS IRÃO BEBER REFRIGERANTES.\n\n"
                            + "QUANTIDADE DE BEBIDAS:\n\n"
                            + "   ITEM                      LITROS                  R$(INDIVIDUAL)              TOTAL(R$)           \n"       
                            + "------------------------------------------------------------------------------------------------------\n"       
                            + "CERVEJA:                    " + quantcerveja + "                              "+indCerveja+"                               "+totalCerveja+"\n"
                            + "SUCO:                           " + quantsuco + "                                "+indSuco+"                               "+totalSuco+"\n"
                            + "REFRIGERANTES:       " + quantrefri + "                                "+indRefri+ "                                 "+totalRefri+"\n\n"
                            +"PREÇO TOTAL EM BEBIDAS:\n"
                            +"R$ "+totalBebida+"\n\n"
                            +        "QUANTIDADE DE COMIDA E PREÇO:\n\n"
                            + "     ITEM                              KG               R$(INDIVIDUAL)               TOTAL(R$)  \n"
                            + "---------------------------------------------------------------------------------------------------------\n"
                            + "CARNE DE BOI:                " + carneboi + "                      " + indboi + "                              "+totalboi+"\n"
                            + "CARNE DE PORCO:         " + carneporco + "                      " + indporco +"                                  "+totalporco+"\n"
                            + "ASINHA:                             " + asinha + "                      " + indasinha + "                                  "+totalasinha+"\n"
                            + "LINGUIÇA:                          " + linguica + "                      " + indlinguica + "                                 "+totalliguica+"\n\n"
                            + "VALOR TOTAL DE CARNES:\n R$" + total+"\n\n"
                            + "VALOR TOTAL DO CHURRASCO:\n R$" + totalchurrasco
                    );// AQUI PARA DE EXIBIR AS INFORMAÇOES PARA O USUARIO
                 
               } catch (NumberFormatException e) { //CASO O USUARIO DIGITE ALGUM VALOR ERRADO, ENTRA AQUI E EXIBE UM ERRO

                                        JOptionPane.showMessageDialog(null, "ERROR!!! DIGITE UM VALOR VALIDO");

                                    }//FIM DO CATCH    
                    break; //break do case 3 do primeiro switch
                default://PRIMEIRO SWITCH
                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VALIDO!!!");
                    break;
            }//FIM DO PRIMEIRO SWITCH
            repetir = JOptionPane.showInputDialog("CASO QUEIRA VOLTAR AO INICIO DO PROGRAMA DIGITE 1, OU 0 PARA SAIR");
            repetirInt = Integer.parseInt(repetir);
        } while (repetirInt == 1);
        JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR O PROGRAMA \n   ****************************\n   *****(O)************(O)****\n   ****************************\n   ****************************\n   **************^*************\n   *****\\____________/*****\n   ****************************\n   PROGRAMA DESENVOLVIDO POR:\n   ELDER FELIPE C. MOURA ");

    }
}
