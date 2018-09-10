package edu.deepak._20_JSR_250_Annotations;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * * While using @Autowired, compiler will follow below matching rules:
 *  1) by Type
 *  2) by Name
 *  3) Using Qualifier
 *  
 *  @Resource:  if you don't pass any argument here, default wiring is by name
 *  @Resource(name="objectName") : it will look for the declared bean name to initialize
 *  
 *  @PostConstruct: method is executed after initialization
 *  @PreDestruct: method is executed before destruction
 *  
 *  Note: we need to use AbstractApplicationContext and register shut down hook to see the destroy method.
 * 
 */

public class DrawingApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring20.xml");		
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
				
		shape = (Shape) context.getBean("triangle");
		shape.draw();
	}

}
