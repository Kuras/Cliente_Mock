
public class Cliente {

	private String name;
	private String lastName;
	private int id;
	private IApiValidate api;

	public Cliente(IApiValidate api) {
		this.api = api;
	}
	
	public Cliente() {
	}

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

	public boolean validate() {
		return api.validateCliente(getId());
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
