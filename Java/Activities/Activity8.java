package activities;

public class Activity8 {

	public static void main(String[] args) throws Exception {
		try {
		exceptionTest("Print the message in console");
		exceptionTest(null);
		}
		catch(Exception e) {
			System.out.println("Error message in catch block: "+ e);
		}
	}
	
	public static void exceptionTest(String str) throws Exception {
		if(str == null) {
			throw new CustomException("string value is null");
		}
		else {
			System.out.println(str);
		}
	}

}

class CustomException extends Exception{
	private String message = null;
	
	CustomException(String msg){
		message = "";
	}
	
	public String getMessage() {
		return message;
		
	}
}