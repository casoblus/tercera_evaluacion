public class Caja
{
	private static void mostrarMenu()
	{
		System.out
				.print( "Escoja una opción correcta:\n 1. Nueva cuenta;\n 2. Ingresar;\n 3. Reintegrar;\n 4. Ver movimientos;\n" );
	}

	private static void switchMenu()
	{
		
	}

	public static void main( String[] args )
	{
		mostrarMenu();

		ContaCorrente contacorrente1 = new ContaCorrente();

		contacorrente1.ALTA_CONTA( 1, "Paco Madreja Moncillos", 20000 );

		System.out
			.println( contacorrente1.OBTER_SALDO() );
	}
}
