import java.util.Date;
import java.util.GregorianCalendar;

public class NuevaToViejaAdapter implements IPersonaVieja{

	private PersonaNueva nuevo;
	private String[] nombresVector= {"",""};
	
	public NuevaToViejaAdapter (PersonaNueva nuevo) {
		this.nuevo=nuevo;
	}
	
	public String getNombre() {
		String[] nombres= nuevo.name.split(" ");
		return nombres[0];
	}

	
	public String getApellido() {
		String[] nombres= nuevo.name.split(" ");
		return nombres[1];
	}

	
	public Date getFechaNacimiento() {
		int edad=nuevo.getEdad();
		GregorianCalendar c=new GregorianCalendar();
		Date fechaActual=c.getTime();
		Date edadFecha=new Date();
		int anioNacimiento=(fechaActual.getYear()-edad);
		Date fechaNacimiento=new Date(anioNacimiento,01,01);
		return fechaNacimiento;
	}

	
	public void setNombre(String nombre) {
		this.nombresVector[0]=nombre;
		nuevo.setNombre(this.nombresVector[0]+" "+this.nombresVector[1]);
	}


	public void setApellido(String apellido) {
		this.nombresVector[1]=apellido;
		nuevo.setNombre(this.nombresVector[0]+" "+this.nombresVector[1]);
		
	}


	public void setFehcaNacimiento(Date fechaNacimiento) {
		Date ahora=new GregorianCalendar().getTime();
		int edad =ahora.getYear()-fechaNacimiento.getYear();
		nuevo.setEdad(edad);
	}
	
}
