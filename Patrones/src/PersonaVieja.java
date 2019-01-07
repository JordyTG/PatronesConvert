import java.util.Date;

public class PersonaVieja implements IPersonaVieja  {

	public String name;
	public String apellido;
	public Date fechaNacimiento;
	
	
	
	public String getNombre() {
		
		return name;
	}

	
	public String getApellido() {
		
		return apellido;
	}

	
	public Date getFechaNacimiento() {
		
		return fechaNacimiento;
	}

	
	public void setNombre(String nombre) {
		this.name=nombre;
		
	}

	
	public void setApellido(String apellido) {
		this.apellido=apellido;
		
	}

	
	public void setFehcaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
		
		
	}

}
