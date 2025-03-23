public class Main {

    public static void main(String[] args) {
        // Declarando uma variável
        // tipo nome = valor;
        // int idade = 22;
        // Posso atribuir valor posteriormente. Ex.:
        // int salario;
        // salario = 400;

        // Declarando uma variável dentro do escopo local (método onde ela foi declarada)
        //var nome = "Fernanda";
        //Não precisei declarar o tipo, pois "var" irá inferir automaticamente o tipo dela
        //através do valor. Neste caso não posso inferir o valor posteriormente.

        //Tipos primitivos: byte (-127 a 128); short (-32,768 a 32,767);
        // int (-2 milhões a 2 milões); long (O maior de todos)
        //boolean eBrasileiro : true;
        //char letra = 'A';
        // double - representa números de ponto flutuando com mais precisão (armazena mais
        // depois da vírgula.
        // float - representa números de ponto flutuante com menos precisão.
        //Ex.:
        //double idade = 22.50;
        //float salario = 400.20F;

        // Condicionais
        // if (idade > 22.60) {
        //      System.out.println ("maior");
        //  else if (idade == 22.60) {
        //      System.out.println ("igual");
        //  else {
        //      System.out.println ("menor");
        //}

        // Vetores (Arrays)
        // tipo [] nome;
        // int [] idades;
        // É preciso INICIALIZAR O ARRAY!
        // INICIALIZAÇÃO DIRETA:
        // int[] idades = {2,3,4}; (length 3; para pedir tamanho só colcar comando "idades.length")
        // idades [0] = 4
        // ou
        //int[] idade = new int [10];
        //Posso fazer também:
        //String [] nomes = new String[10];
        //boolean [] saoBrasileiros = new boolean[10];
        //ARRAYLIST
        // É uma classe que vem de dentro de uma biblioteca padrão do java (java.util) e é uma estrutura
        // de dados para representar uma lista dinâmica. Importamos ele do java util.
        // Inicializando o Array
        // ArrayList<Integer> idades = new ArrayList<Integer>();
        //idades.add (22);
        //idades.add (50);
        //idades.add (30);
        //idades.remove(index: 0);        removo
        //idades.get (1);                 pego o valor do array
        //idades.size ();                 pega o tamanho do array

        // LOOPS DENTRO DO JAVA
        //for
        //for(var i = 0; i < idade; i++){
        //  System.out.println("oi");
        //while
        //int i = 0;
        //while (i < idade){
        //  i++;
        //}

        //CASTING - É transformar o valor de um tipo para outro tipo. Ex.:
        // int = 22  -> 22.50
        // double = 22.50  ->  22
        // Existem dois tipos de casting:

        //CASTING IMPLICITO- Acontece quando fazemos a transformação de um tipo para outro, sem declarar;
        //a própria linguagem faz de maneira automática.Funciona também para long, bite e shot. Ex.:
        //int idade1 = 22;
        //double idade2 = idade1;
        //idade1 = idade2;(ERRO)
        //Neste caso é possível, porém caso eu queira colocar um double dentro de um int, ocorrerá erro.
        //Isto pois o double é maior, sua faixa de representação é maior.Como se quisse colocar uma caixa
        //de roupas dentro de uma pequena gaveta. Neste caso será preciso realizar um CASTING EXPLICITO.

        //CASTING EXPLICITO - quando ocorre a transformação de modo que precisamos exlpicitar à linguagem
        //que estamos cientes que estaremos perdendo uma parte da faixa de representaçãO/cortando valores.
        //idade1 = (int) idade2;

        //Transformando letra em String:
        //char letra = 'a'
        //String nome = letra; (ERRO)
        //char letra = 'a'
        //String nome = String.valueOf(letra); (CERTO)

        //Transformando String em caractere (char):
        // letra = nome.charAt(0);

        //Transformando um inteiro em String:
        //String nome2 = String.valueOf(idade1);

        //Transformando uma String em inteiro:
        //idade1 = Integer.parseInt(nome2); (Caso a string seja um número)


        //                                  PROGRAMAÇÃO ORIENTADA A OBJETOS

        //Classes - elementos fundamentais do nosso programa; servem para modelar os objetos
        //através de atributos e comportamentos; declaramos estes comportamentos através dos métodos.

        //Atributos do objeto - São as variáveis que o objeto tem. Ex.:
        //Logo abaixo da classe Main, consigo fazer a declaração de alguns atributos que vão pertencer
        //às instâncias dessa classe.
        //public class Main {
        //String nome; (este atributo posso referenciar a todos os métodos que pertencem à instancia da classe Main.)
        //public static void main(String[] args){
        //}


    }
}





