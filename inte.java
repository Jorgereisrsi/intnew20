import java.util.Scanner;

public class inte
{
  public static void main(String[]args)
  {
    //declaração das variáveis
    int numero1, numero2, soma;

    //declaração do objeto Scanner
    Scanner sc = new Scanner(System.in);

    //recebe pelo teclado dois números inteiros
    System.out.print("Entre com o primeiro n�mero inteiro: ");
    numero1 = sc.nextInt();
    System.out.print("Entre com o segundo n�mero inteiro: ");
    numero2 = sc.nextInt();

    soma = numero1 + numero2;
    System.out.printf("A soma de %d e %d resulta em %d\n",numero1, numero2, soma);
  }
}
