package ifElseStatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		//Pre Condition - Browser launched
		
		//Login Successful
		
		//Compose button enabled
		
		//Compose email
		
		boolean launchBrowser=true;
		boolean login=true;
		boolean composeButton=true;
		
		
		if(launchBrowser)
		{
			System.out.println("Pass: Browser is successfully launched");
			if(login)
			{
				System.out.println("Login successful");
				
				if(composeButton)
				{
					System.out.println("Compose button is enabled");
					/*
					 * Enter email address in To
					 * Enter Subject
					 * Enter mailbody
					 * click Send		
					 * 
					 */
					
				}else {
					System.out.println("Fail: Compose button is not enabled");
				}
				
			}else {
				System.out.println("Fail: Login failed");
			}
			
		}else {
			System.out.println("Fail: Browser could not launch");
		}
		
		

	}

}
