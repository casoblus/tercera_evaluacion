/**
 * 
 */
import java.util.*;
import java.lang.*;
/**
 * @author casoblus
 */
public class Controlador {
	
	private static ArrayList<Coche> coches = new ArrayList<Coche>();
	
	private static int getOption()
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

	private static void addCoche()
	{
		Coche coche = new Coche();
		coches.add( coche );
		int pos = coches.size();
		coches.get( pos - 1 );
	}

	private static Coche selectCoche()
	{
		Integer i;
		do {
			System.out
				.print( "Selecciona coche: ");
			i = getOption();
		} while ( i < 0 );
		Coche coche = coches.get( i );
		return coche;
	}

	private static void verCoche()
	{
		Coche coche = selectCoche();
		coche.visualizar();
			
	}

	private static void addReparacion()
	{	
		Coche coche = selectCoche();
		coche.addReparacion();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer option;	
		do {
			
			do {
			
				System.out
					.print( "\n 1. Nuevo coche. \n 2. Ver coche. \n 3. Añadir reparación. \n 0. Salir." );
				
				System.out
					.print( "\n Selecciona una opción válida: " );
				
				option = getOption();
			
			} while ( option < 0 );
			
			switch ( option )
			{
				case 1:
						addCoche();
						break;
				case 2:
						verCoche();
						break;
				case 3:
						addReparacion();
						break;
				case 0:
						System.out
							.print( "\n Hasta pronto!");
						break;
				default:
						break;
			}
		} while ( option != 0 );
	}
}
