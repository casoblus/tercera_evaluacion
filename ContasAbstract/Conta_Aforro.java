class ContaAforro extends Conta
{
	public void ACTUALIZAR( int _saldo ) 
	{
		MODIFICAR_SALDO( _saldo );
	}

	public int OBTER_SALDO()
	{
		return super.saldo;
	}
}
