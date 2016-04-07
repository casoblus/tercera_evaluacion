import java.util.*;
/**
 * Empregado. 
 */
public class Empregado
{
	/* No es abstracta porque genera el empleado básico */
	private String dni;
	private String nome;
	private String apelidos;
	private float salario;
	private int id_num;
	private static int num_emp = 0;

	/**
	 * engadir
	 */
	public void engadir()
	{
		Scanner teclado = new Scanner( System.in );
		System.out.print( "\n DNI: " );
		dni = teclado.nextLine();
		System.out.print( "\n Nome: " );
		nome = teclado.nextLine();
		System.out.print( "\n Apelidos: " );
		apelidos = teclado.nextLine();
		System.out.print( "\n Salario base: " );
		salario = teclado.nextFloat();
		id_num = num_emp;
		num_emp++;
	}

	/**
	 * eliminar
	 */
	public static void eliminar()
	{
		
	}

	/**
	 * modificar
	 */
	public void modificar()
	{}

	/**
	 * visualizar
	 */
	public void visualizar()
	{}

	/**
	 * calcular_salario
	 */
	public void calcular_salario()
	{}

	public static int getNum_emp()
	{
		return num_emp;
	}
}
