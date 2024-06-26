/*
A palavra Static, deixa explícito que a classe Main, é estática. Isso significa que ela pode ser chamada, pela JVM, mesmo sem ter sido instanciada.
Outro detalhe, é que a JVM, sempre irá executar, a classe Main, sendo por assim dizer, o ponto de partida para nossa aplicação.
Outro detalhe bastante importante, é que o nome da classe, deve ser igual ao nome do arquivo .java, nesse caso Main.java
*/
public class Main {//Cria uma classe, com acesso público de nome Main
    public static void main(String[] args){// Cria um método main, com visibilidade publica, void é devido ao método não ter nenhum tipo de retorno
        System.out.println("Olá Mundo");//Imprime "Olá Mundo", já direciona o cursor para a próxima linha
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Lucas";
        pessoa.idade = 38;
        System.out.println("Nome " + pessoa.nome + " e idade: " + pessoa.idade); 
    }
}
