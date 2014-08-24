
public class Cliente {

	private String name;
	private String lastName;

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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
