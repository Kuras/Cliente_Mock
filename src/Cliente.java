
public class Cliente {

	private String name;
	private String lastName;

	public String formatedName() {
		if(name != null){
			StringBuilder builder = new StringBuilder();
			builder.append(getName());
			builder.append(" ");
			builder.append(getLastName());
			return new String(builder );
		}		
		return "";
	}

	public String getLastName() {
		return this.lastName;
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
