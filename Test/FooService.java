package Test;

public class FooService implements Service<String> {
	
	private final String input1;
	private final int input2;
	
	public FooService(String input1, int input2){
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Override
	public String execute(){
		return String.format("'%s%d'", input1, input2);
	}
}
