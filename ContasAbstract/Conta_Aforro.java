class ContaAforro extends Conta
{
	public void ACTUALIZAR( int saldo ) 
	{
		MODIFICAR_SALDO( saldo );
	}

	public int OBTER_SALDO()
	{
		return saldo;
	}
}
