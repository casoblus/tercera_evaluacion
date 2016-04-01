public abstract class Conta
{
	int num;
	String titular;
	int saldo;
	
	public abstract int OBTER_SALDO();
	
	public void ALTA_CONTA( int _num, String _titular, int _saldo )
	{
		num = _num;
		titular = _titular;
		MODIFICAR_SALDO(_saldo);
	}
	
	public void MODIFICAR_SALDO( int _saldo )
	{
		saldo = _saldo;	
	}
}
