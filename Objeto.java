
public class Objeto
{
	private final String nombreObjeto;
	
	public Objeto(String nombreObjeto)
	{
		this.nombreObjeto = nombreObjeto;
	}
	
	@Override
	public String toString()
	{
		return nombreObjeto;
	}
}