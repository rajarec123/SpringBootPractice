package in.ashokit.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {
	public static void main(String[] args) {
		//Loading Bean Configuration File
		Resource resource = new ClassPathResource("Beans.xml");
		
		//Starting IOC
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// factory.getBean("credit", CreditCardPayment.class);
		
		//Getting Target Bean Object
		PaymentProcessor processor = factory.getBean("paymentProcessor", PaymentProcessor.class);
		
		processor.doPayment(1300.70);
		
	}
}
