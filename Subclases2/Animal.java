/**
 * Animal
 */
public class Animal
{
	protected String nome;
	
	public void mover()
	{
		System.out
				.println( "Movéndome..." );
	}
}

/**
 * Ra
 */
class Ra extends Animal
{
	public void mover()
	{
		System.out
				.println( "saltando" );
	}
}

/**
 * Paxaro
 */
class Paxaro extends Animal
{
	public void mover()
	{
		System.out
				.println( "voando" );
	}
}

