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
	
	public static int getOption( int min, int max )
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
		if ( number < min || number > max )
		{
			number = -1;
			System.out
				.println( " Opción inválida. " );
		}	
		return number;
	}
}
