
public class ManosPRL {
	private String NumeroDedosPRL;
	private String MaterialManoPRL;
	
	
	//Constructo
	public ManosPRL(String NumeroDedosPRL, String MaterialManosPRL) {
		this.NumeroDedosPRL = NumeroDedosPRL;
		this.MaterialManoPRL = MaterialManosPRL;
	}
	
	
	//Constructo vacio
	public ManosPRL() {
		
	}
	
	
	

	
	//Metodo
	
	public String getNumeroDedosPRL() {
		return NumeroDedosPRL;
	}


	public void setNumeroDedosPRL(String numeroDedosPRL) {
		NumeroDedosPRL = numeroDedosPRL;
	}


	public String getMaterialManoPRL() {
		return MaterialManoPRL;
	}


	public void setMaterialManoPRL(String materialManoPRL) {
		MaterialManoPRL = materialManoPRL;
	}


	public void moverManoPRL() {
		System.out.println("El Robot mueve la mano");

	}
	




	

}
