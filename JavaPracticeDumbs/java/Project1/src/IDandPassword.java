import java.util.*;
public class IDandPassword {

	HashMap<String,String> loginfo = new HashMap<String,String>();
   
	IDandPassword(){
		loginfo.put("Srihari","royal");
		loginfo.put("Sri","PASSWORD");
		loginfo.put("hari","royal123");
	}
	
	protected  HashMap getLogInfo(){
		return loginfo;
	}
}

