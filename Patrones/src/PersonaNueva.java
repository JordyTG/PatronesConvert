
public class PersonaNueva implements IPersonaNueva {
	public String name;
	public int edad;
	
	
	public String getNombre() {
		
		return name;
	}

	public int getEdad() {
		
		return edad;
	}

	public void setNombre(String nombre) {
		this.name=nombre;
		
	}
	
	public void setEdad(int edad) {
		this.edad=edad;		
	}
	
}
