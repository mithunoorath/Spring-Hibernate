package mithun.learn.samples;



/**
 * Hello world!
 *
 */
public class App 
{
    public String printMessage(String message) {
    	MessageBeans messageBeans = new MessageBeans();
    	messageBeans.setMessage(message);
    	//messageBeans.setMessage("hi");
    	return messageBeans.getMessage();
    }
}
