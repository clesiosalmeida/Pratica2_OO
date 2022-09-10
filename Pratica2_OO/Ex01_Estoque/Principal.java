package Ex01_Estoque;

public class Principal {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Caneta", 100,1);
        System.out.println("Item: "+estoque1.getNome()+" | Quantidade em estoque: "+estoque1.getQtdAtual()+" | Estoque minimo: "+estoque1.getQtaMinima());

        estoque1.setNome("Caneta Azul");
        System.out.println("Valor item 1 alterado para: "+estoque1.getNome());

        Estoque estoque2 = new Estoque();
        estoque2.setNome("Lápis");
        estoque2.setQtdAtual(50);
        estoque2.setQtaMinima(10);

        System.out.println("Item: "+estoque2.getNome()+" | Quantidade em estoque: "+estoque2.getQtdAtual()+" | Estoque minimo: "+estoque2.getQtaMinima());

        Estoque estoque3 = new Estoque();
        estoque3.setNome("Regua Acrilica 30cm");
        estoque3.setQtdAtual(48);
        estoque3.setQtaMinima(5);

        estoque3.darBaixa(47);
        estoque3.darBaixa(3);
        System.out.println("Precisa repor estoque? "+estoque3.precisaRepor());
        System.out.println(estoque3.mostra());

    }
}
