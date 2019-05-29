package maven.megasena;

import java.util.Arrays;

public class App 
{
	public static void main(String[] args) {	
		System.out.println("Dezenas " + Arrays.toString(getJogo()));
	}

	public static int getNumero()
	{
		return (int) (Math.random() * 60 + 1);
	}

	public static int[] getJogo()
	{
		int[] jogo = new int[6];
		
		for(int i= 0; i < 6; i++)
		{
			jogo[i] = getNumero();
		}
		
		return jogo;
	}
}
