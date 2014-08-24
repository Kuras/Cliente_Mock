
public class Cliente {

	private String name;

	public String formatedName() {
		if(name != null){
			return this.getName();
		}		
		return "";
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;		
	}
	
	
	
}
