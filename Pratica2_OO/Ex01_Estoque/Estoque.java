package Ex01_Estoque;

public class Estoque{

    //atributos da classe
    private String nome; 
    private int qtdAtual;
    private int qtaMinima;

    //constructor == Construtor é um metodo que deve ter o mesmo nome da classe e serve para inicializar os atributos da classe
    public Estoque(){

    }

    public Estoque(String nome, int qtdAtual, int qtaMinima) {
        super();
        this.nome = nome; //this. Operador que referencia os atributors da própria classe
        this.qtdAtual = qtdAtual;
        this.qtaMinima = qtaMinima;
    }

    //--------------------------------------
    //Gets and Seters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtaMinima(int qtaMinima) {
        this.qtaMinima = qtaMinima;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtaMinima() {
        return qtaMinima;
    } 


    //--------------------------------------
    // Outros metodos
    
    public void darBaixa(int qtde){
        if(qtde<=this.qtdAtual)
            this.qtdAtual -= qtde;
            else
                System.out.println("Impossivel prosseguir com operação, estoque negativo");
    }

    public boolean precisaRepor(){
        if (this.qtdAtual<=this.qtaMinima)
            return true;
                else   
                    return false;
    }

    public String mostra(){
        return "Item: "+getNome()+" | Quantidade em estoque: "+getQtdAtual()+" | Estoque minimo: "+getQtaMinima();
    }

    
    
}
