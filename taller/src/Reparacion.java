package taller;
/**
 *
 */

/**
 * @author casoblus
 *
 */
import java.util.Scanner;
import java.util.ArrayList;
class Reparacion
{
	private static Integer counter = 0;
	private Integer id;
	private String concepto;
	private String total;

	/**
	 * Reparacion()
	 * Constructor de clase
	 */
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

	/**
	 * alta
	 * @param concept - String - Concepto de la reparacion.
	 * @param tot - String - Coste total de la reparacion.
	 */
	private void alta ( String concept , String tot )
	{
		total = tot;
		concepto = concept;
		counter++;
		id = counter;
	}


	/**
	 * histReparaciones()
	 * Recorre el la coleccion de reparaciones de un coche e invoca visualizar para cada uno de ellos.
	 * @param repar - ArrayList<Reparacion> que contenga las reparaciones del coche.
	 */
	public static void histReparaciones( ArrayList<Reparacion> repar )
	{
		System.out
			.print( "\n\tHistorial de reparaciones: \n ==================================================");
		for ( int i = repar.size() - 1; i >= 0; i-- )
		{
			Reparacion rep = repar.get( i );
			rep.visualizar();
		}
	}


	/**
	 * visualizar
	 * Imprime por pantalla los atributos del un objeto reparacion.
	 *
	 * @param rep - Objeto de clase Reparacion.
	 */
	private void visualizar()
	{
			System.out
				.print( "\n\t Codigo: " + id );
			System.out
				.print( "\n\t Concepto: " + concepto );
			System.out
				.print( "\n\t Total: " + total );
			System.out
				.print( "\n * * * * * * * * * * * * * * * * * * " );
	}
}
