/**
 * 
 */

/**
 * @author casoblus
 *
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Coche {
	protected String matricula;
	protected String marca;
	protected String modelo;
	private static ArrayList<Reparacion> reparaciones = new ArrayList<Reparacion>();

	public void alta ( String _matricula , String _marca , String _modelo )
	{
		matricula = _matricula;
		marca = _marca;
		modelo = _modelo;
	}

	public void alta ( String _matricula , String _marca , String _modelo, Reparacion _reparacion )
	{
		matricula = _matricula;
		marca = _marca;
		modelo = _modelo;
		reparaciones.add( _reparacion );
	}

	public Coche()
	{	
		Scanner teclado = new Scanner( System.in );

		System.out
				.print( "\n Matricula: ");
		String mat = teclado.nextLine();
		
		System.out
				.print( "\n Marca: ");
		String mar = teclado.nextLine();
		
		System.out
				.print( "\n Modelo: ");
		String mod = teclado.nextLine();
		
		this.alta( mat, mar, mod );
	}
	
	public void addReparacion()
	{
		Reparacion nuevaReparacion = new Reparacion();
		reparaciones.add( nuevaReparacion );
	}

	public void visualizar()
	{
		System.out
			.print( "\n\tMostrando datos de vehiculo \n =============================================\n" );
		System.out
			.println( " Matricula: " + matricula );
		System.out
			.println( " Marca: " + marca );
		System.out
			.println( " Modelo: " + modelo );
		if ( reparaciones.size() != 0 )
		{
			Reparacion.histReparaciones( reparaciones );
		}
	}
}
