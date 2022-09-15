package Ex02_Rendimento;

import java.util.Scanner;
import java.text.NumberFormat;//pacote java.text para usar na formatação de números  

//Classe para cacular o rendimento do investimento

public class CalcRendimento {
    
    public static void main(String[] args){
        
        //Instancia os dados da classe com os dados mocados
        //  Rendimento render1 = new Rendimento(1000f, 2f, 12);
        
        // as imprime os resultados 
        //  System.out.println("Investimento Inicial: "+render1.getInvestInicial()+". Rendendo a "+render1.getTaxaRendimento()+"% por "+render1.getNumMes()+" mes(es)");

        //Segunda instancia
        Rendimento render2;
        render2 = new Rendimento();
        //Ler variáveis utilizando a classe Scanner e depois retornar os valores usando o metodo redMes()

        
        
        Scanner inVal = new Scanner(System.in);
        
        System.out.println("Insira valor desejado para simulação: ");
        render2.setInvestInicial(inVal.nextFloat());
        
        System.out.println("Insira o valor da taxa de rendimento: ");
        render2.setTaxaRendimento(inVal.nextFloat());
        
        System.out.println("Daqui quantos meses você desja retirar o valor investido? ");
        render2.setNumMes(inVal.nextInt());

        
        render2.rendMes();
        
    }
}
