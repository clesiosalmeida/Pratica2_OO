package Ex02_Rendimento;

import java.text.NumberFormat;

public class Rendimento {
    private float investInicial;
    private float taxaRendimento;
    private int numMes;
    
    // Creator
    public Rendimento(){};

    public Rendimento(float investInicial, float taxaRendimento, int numMes) {
        this.investInicial = investInicial;
        this.taxaRendimento = taxaRendimento;
        this.numMes = numMes;
    }
    
    //gets and setters
    
    public float getInvestInicial() {
        return investInicial;
    }

    public void setInvestInicial(float investInicial) {
        this.investInicial = investInicial;
    }

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getNumMes() {
        return numMes;
    }

    public void setNumMes(int numMes) {
        this.numMes = numMes;
    }


    //Fazer um método para calcular e mostrar o rendimento
    
        //modificador do metodo, retorno tipo, nome, parametros
        //1. ler numero de meses de rendimento
        //2. para um indice inteiro = 0, menor ou igual quantidade de meses lidos, faça: 
            //2.1.  investimento inicial = ((seu valor) * (1 + (taxa de rendimento/100)))
            //2.2retorna o valor de cada mês rendido;
           
    public void rendMes (){
        System.out.println("Investimento Inicial    |   "+NumberFormat.getCurrencyInstance().format(getInvestInicial())+"\nPercentual de rendimento/mês    |   "+ NumberFormat.getPercentInstance().format((getTaxaRendimento()/100)));

        for(int i=0;i<=getNumMes();i++){
            this.investInicial = ((this.investInicial)*(1+(this.taxaRendimento/100)));

            //System.out.printf("mês %d:    %.2f %n",(i+1),getInvestInicial()); //printf
            System.out.println("Mês "+(i+1)+":  "+NumberFormat.getCurrencyInstance().format(getInvestInicial()));//Utilizando NumberForma
        }
    } 
    



}

