package mithun.learn.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import mithun.learn.samples.AppDao;
import mithun.learn.samples.MessageBeans;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
//	@Autowired
	private AppDao appDao;
	
	
    public String printMessage(String message) {
    	MessageBeans  messageBeans = new MessageBeans();
    	messageBeans.setMessage(message);
    	//messageBeans.setMessage("hi");
    	System.out.println(appDao.fetch());
    	return messageBeans.getMessage() /*+ appDao.fetch()*/;
    }


	

}
