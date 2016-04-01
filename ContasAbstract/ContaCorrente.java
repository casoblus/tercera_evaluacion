class ContaCorrente extends Conta
{
	int intereses;

	public void INGRESO( int cantidad ) 
	{
		saldo = OBTER_SALDO();
		MODIFICAR_SALDO( saldo + cantidad );
	}

	public int REINTEGRO( int cantidad ) 
	{
		saldo = OBTER_SALDO();
		if ( saldo >= cantidad )
		{
			MODIFICAR_SALDO( saldo - cantidad );
			return cantidad;
		}
		return -1;
	}

	public int OBTER_SALDO()
	{
		return saldo;
	}
}
