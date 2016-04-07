import java.util.*;
import java.lang.*;
/**
 * Empresa.
 */
public class Empresa 
{
	private static ArrayList<Comercial> comercial = new ArrayList<Comercial>();
	private static ArrayList<Velador> velador = new ArrayList<Velador>();
	private static ArrayList<Empregado> empregado = new ArrayList<Empregado>();

/**
 * crearComercial
 */
	private static void crearComercial()
	{
		Comercial novoComercial = new Comercial();
		novoComercial.engadir();

		comercial.add( novoComercial );
	}
/**
 * crearVelador
 */
	private static void crearVelador()
	{
		Velador novoVelador = new Velador();
		novoVelador.engadir();
		
		velador.add( novoVelador );
	}
/**
 * crearEmpregado
 */
	private static void crearEmpregado()
	{
		Empregado novoEmpregado = new Empregado();
		novoEmpregado.engadir();

		empregado.add( novoEmpregado );
	}
	
/**
 * getOption
 */
	private static int getOption( int a, int b )
	{
		Scanner teclado = new Scanner ( System.in );
		String opt = teclado.nextLine();
		int option;
		try 
		{
			option = Integer.parseInt( opt );
		}
		catch ( Exception  exc )
		{
			option = -1;
		}
		
		if ( option < a || option > b )
			option = -2;
		
		return option;
	}
/**
 * menuEmpregado
 */
	private static void menuEmpregado() 
	{
		int option;
		System.out
				.print( " 1. Básico. \n 2. Comercial. \n 3. Velador. \n 0. Voltar." );
		do {
			option = getOption( 0, 3 );
		} while ( option < 0 );

		switch ( option ) 
		{
			case 0:
				menuPrincipal();
				break;
			case 1:
				crearEmpregado();
				break;
			case 2:
				crearComercial();
				break;
			case 3:
				crearVelador();
				break;
		}

	}
/**
 * menuPrincipal
 */
	private static int menuPrincipal()
	{
		int option;
		System.out
				.println( "Xa hai " + Empregado.getNum_emp() + " empregados na empresa.");
		System.out
				.print ( "\n 1. Novo empreado. \n 2. Seleccionar empregado. \n 0. Saír."   );

		do {
			option = getOption( 0, 2 );
		} while ( option < 0 );

		switch ( option )
		{
			case 0:
				break;
			case 1:
				menuEmpregado();
				break;
			case 2:
				//seleccionarEmpregado();
				break;
		}
		return option;
	}
/**
 * main
 */
	public static void main( String[] args )
	{
		int control;

		do {
			control = menuPrincipal();
		} while ( control != 0 );
	}
}
