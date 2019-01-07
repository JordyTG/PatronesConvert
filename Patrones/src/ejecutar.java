import java.util.Date;
import java.util.GregorianCalendar;

public class ejecutar {
	
	public static void main(String[] arg) {
		PersonaVieja pVieja = new PersonaVieja();
		pVieja.setApellido("Taez");
		pVieja.setNombre("Jordy");
		GregorianCalendar g =new GregorianCalendar();
		g.set(1994, 01,01);
		Date d = g.getTime();
		pVieja.setFehcaNacimiento(d);
		
		ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(pVieja);
		
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		
		personaNueva.setEdad(10);
		personaNueva.setNombre("Jordy Taez");
		
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		
		PersonaNueva pNueva = new PersonaNueva();
		pNueva.setNombre("Jordy Taez");
		pNueva.setEdad(24);
		
		NuevaToViejaAdapter personaVieja = new NuevaToViejaAdapter (pNueva);
		
		System.out.println(personaVieja.getNombre() + " " +personaVieja.getApellido());
		System.out.println(personaVieja.getFechaNacimiento());
		
		personaVieja.setNombre("Jordys");
		personaVieja.setApellido("Taezz");
		
		System.out.println(personaVieja.getNombre() + " " +personaVieja.getApellido());
		System.out.println(personaVieja.getFechaNacimiento());
	}
}
