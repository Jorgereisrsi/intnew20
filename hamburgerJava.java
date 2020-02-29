import java.util.Scanner; // 

public class hamburgerJava 
{
	public static void main(String[]args)
	  {
		 
	int quantidadeBurger1, quantidadeBurger2, subtracao;
    Scanner bj = new Scanner (System.in);

    System.out.print ("Coloque a primeira quantidade de hamburguer: ");
    quantidadeBurger1 = bj.nextInt();
    System.out.print ("Coloque segunda quantidade de hamburguer: ");
    quantidadeBurger2 = bj.nextInt();
	
	
    subtracao = quantidadeBurger1 - quantidadeBurger2;
    System.out.printf("A Subtração dos Hamburgeres %d e %d resulta em %d\n",quantidadeBurger1 , quantidadeBurger2 ,subtracao);
  }
}
