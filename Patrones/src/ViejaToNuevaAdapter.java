import java.util.GregorianCalendar;

public class ViejaToNuevaAdapter implements IPersonaNueva{

	private IPersonaVieja vieja;
	
	public ViejaToNuevaAdapter (IPersonaVieja vieja) {
		this.vieja=vieja;
	}
	
	public String getNombre() {
		return vieja.getNombre()+" "+vieja.getApellido();
	}

	public int getEdad() {
		GregorianCalendar c =new GregorianCalendar();
		GregorianCalendar c2 =new GregorianCalendar();
		c2.setTime(vieja.getFechaNacimiento());
		return c.get(1)-c2.get(1);
	}

	public void setNombre(String nombreCompleto) {
		String[] name = nombreCompleto.split(" ");
		String firstName=name[0];
		String secondName=name[1];
		vieja.setNombre(firstName);
		vieja.setApellido(secondName);
		
		
	}
	
	public void setEdad(int edad) {
		GregorianCalendar c =new GregorianCalendar();
		int anioActual= c.get(1);
		c.set(1,anioActual-edad);
		vieja.setFehcaNacimiento(c.getTime());
	}
}
