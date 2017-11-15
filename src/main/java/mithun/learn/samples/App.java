package mithun.learn.samples;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import mithun.learn.samples.MessageBeans;
import mithun.learn.samples.Dao.*;

@Component
public class App implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
   public AppDao appDao;
   


	public  String printMessage(Long message) {
    	//MessageBeans  messageBeans = new MessageBeans();
    	//messageBeans.setMessage(message);
    	//messageBeans.setMessage("hi");
		
   	  System.out.println(appDao.findById(message));
    	
    	return ""+message;//appDao.existsById(message);
    }

   
	

}
