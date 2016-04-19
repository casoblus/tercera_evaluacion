/**
 * 
 */

/**
 * @author casoblus
 *
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Reparacion 
{
	private static Integer counter = 0;
	private Integer id;
	private String concepto;
	private String total;
	
	public Reparacion()
	{
		Scanner teclado = new Scanner( System.in );

		System.out
			.print( "\n Concepto: " );
		String concept = teclado.nextLine();

		System.out
			.print( "\n Total: " );
		String tot = teclado.nextLine();
		
		this.alta( concept, tot );
	}

	private void alta ( String concept , String tot )
	{
		total = tot;
		concepto = concept;
		counter++;
		id = counter;
	}

	public static void histReparaciones( ArrayList<Reparacion> repar )
	{
		System.out
			.print( "\n\tHistorial de reparaciones: \n ==================================================");
		for ( int i = repar.size() - 1; i > 0; i-- )
		{
			Reparacion rep = repar.get( i );
			visualizar( rep );
		}
	}
	private static void visualizar( Reparacion rep )
	{
			System.out
				.print( "\n\n Codigo: " + rep.id );
			System.out
				.print( "\n Concepto: " + rep.concepto );
			System.out
				.print( "\n Total: " + rep.total );
	}
}
