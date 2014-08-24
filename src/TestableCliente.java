import com.sun.org.apache.xml.internal.dtm.Axis;


public class TestableCliente extends Cliente {
	
	public TestableCliente(IApiValidate api) {
		super(api);
	}
	
	public TestableCliente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateWithoutDependency() {
		return true;
	}
	
}
