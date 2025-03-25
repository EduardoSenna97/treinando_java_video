class Casting {

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
}
