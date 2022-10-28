import java.util.Scanner;
public class git1 
{
	
	public static void main(String[] args) 
	{
		Scanner leia=new Scanner(System.in);
		int contador=0;
		double valor1=1,maiorValor=0,menorValor=99999;
		
		
		for(;valor1!=0;contador++) 
		{
			System.out.println("Digite um número ");
			valor1=leia.nextDouble();
			if(valor1>maiorValor) 
			{
				maiorValor=valor1;
			}if(valor1!=0 && valor1<menorValor) 
			{
				menorValor=valor1;
			}if(valor1<0) 
			{
				System.out.println("Esse valores não entraram no calculo. ");
			}
		}System.out.println("Este é o maior valor "+maiorValor+"\nEste é o menor valor "+menorValor);	
			
	}
}
