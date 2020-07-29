package br.com.alura.maven;

public class App {
    public static void main( String[] args ){
    	
    	Produto produto = new Produto("Bala juquinha sabor morango", 0.20);
        System.out.println( "Nome: " + produto.getNome() );
        System.out.println( "Nome: " + produto.getPreco() );
    }
}
