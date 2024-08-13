import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> logininfo = new HashMap<String,String>(); 
	
	IDandPasswords(){ 
		
		logininfo.put("MarcusNeves", "password1"); 
		logininfo.put("user2", "password2");
		logininfo.put("User3", "password3");
		
	}
	
	
	//creating a function to call loginInfo
	protected HashMap getLoginInfo(){
		return logininfo;
	}
	
}
