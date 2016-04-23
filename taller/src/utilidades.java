package taller;

import java.util.Scanner;

class utilidades
{

	/**
	 * getOption()
	 * Recoge entrada por teclado y devuelve un entero positivo.
	 */

	public static int getOption()
	{
		Scanner teclado = new Scanner( System.in );
		Integer number;
		try
		{
			number = Integer.parseInt( teclado.nextLine() );
		}
		catch ( Exception e )
		{
			number = -1;
		}
		return number;
	}

}
