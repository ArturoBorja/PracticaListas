import java.util.ArrayList;
import java.util.List;
public class Persona {
	String nombre;
	String apellido;
	List<FabricaAutos> misautos=new ArrayList<FabricaAutos>();
	public Persona(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		misautos.add(new FabricaAutos());
		misautos.add(new FabricaAutos("verde","NISSAN"));
		misautos.add(new FabricaAutos("rojo","SUPERTICO"));
		misautos.add(new FabricaAutos("Azul","AUDI"));
	}
	void Imprimir() {
		System.out.println("el nombre es: "+nombre + " "+ apellido);
		for(int a=0; a<misautos.size();a++) {
			misautos.get(a).Imprimir();
		}
		for(FabricaAutos elauto : misautos) {
			elauto.Imprimir();
		}
	}
}
