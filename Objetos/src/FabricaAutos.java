
public class FabricaAutos {
	String color;
	String marca;
	
	public FabricaAutos(String colorrecibido, String marcarecibida){
		color=colorrecibido;
		marca=marcarecibida;	
	}
	public FabricaAutos(){
		color="Rojo";
		marca="toyota";	
	}
	public void Acelerar() {
		
	}
	public void Frenar() {
		
	}
	void Imprimir() {
		System.out.println("El color es: "+color);
		System.out.println("La marca es: "+marca);
	}
}
