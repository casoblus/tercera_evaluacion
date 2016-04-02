class ContaCorrente extends Conta
{
	int intereses;
	int numero_de_ingresos = 0;
	int numero_de_reintegros = 0;

	public void INGRESO( int cantidad ) 
	{
		int haber = OBTER_SALDO();
		MODIFICAR_SALDO( haber + cantidad );
		INCREMENTAR_INGRESOS();
	}

	public int REINTEGRO( int cantidad ) 
	{
		int haber = OBTER_SALDO();
		if ( haber >= cantidad )
		{
			MODIFICAR_SALDO( haber - cantidad );
			INCREMENTAR_REINTEGROS();
			return cantidad;
		}
		return -1;
	}

	private void INCREMENTAR_INGRESOS()
	{
		numero_de_ingresos++;
	}
	
	private void DECREMENTAR_INGRESOS()
	{
		numero_de_ingresos--;
	}
	
	private void INCREMENTAR_REINTEGROS()
	{
		numero_de_reintegros++;
	}
	
	private boolean DECREMENTAR_REINTEGROS()
	{
		if ( numero_de_reintegros > 0 ) 
		{
			numero_de_reintegros--;
			return true;
		}
		return false;
	}

	public int OBTER_SALDO()
	{
		return super.saldo;
	}

	public void OBTER_MOVEMENTOS()
	{
		System.out
				.println( "OPERACIONES DE INGRESO: " + numero_de_ingresos );
		System.out
				.println( "OPERACIONES DE REINTEGRO: " + numero_de_reintegros );
	}
}
