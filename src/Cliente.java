
public class Cliente {

	private String name;
	private String lastName;
	private int id;

	public String formatedName() {
		if(name != null && lastName != null){
			StringBuilder builder = new StringBuilder();
			builder.append(getName());
			builder.append(" ");
			builder.append(getLastName());
			return new String(builder );
		}else if (name != null){
			return getName();
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

	public void validate() {
			
	}

	public int getId() {
		return this.id;
	}
	
	
	
}
