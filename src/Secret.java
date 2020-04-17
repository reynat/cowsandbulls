import java.util.Random;

public class Secret {
	private char[] code;
	
	public Secret() {
		Random codeGenerator = new Random();
		int number = codeGenerator.nextInt(10000);
		String newCode = String.valueOf(number); 
		this.setCode(newCode.toCharArray());
	}

	public char[] getCode() {
		return code;
	}

	private void setCode(char[] code) {
		this.code = code;
	}
	
}
