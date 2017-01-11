/**
 * (c) Robert Forsström, mtekkie.
 */

package mxbean;

import java.lang.management.ManagementFactory;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

@Singleton
@Startup
public class SuperFancyBean {
	
	@PostConstruct
	public void init(){
		try {
			MBeanServer server = ManagementFactory.getPlatformMBeanServer();
			SuperFancyBeanAppHealth ah = new SuperFancyBeanAppHealth();
			ObjectName ahObjName = new ObjectName ("Application:name=QueueChecker");
			server.registerMBean(ah, ahObjName);
			
		} catch (MalformedObjectNameException | InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException e) {
			System.out.println("There was a problem creating or registrering the MXBean.");
		}
		
	}
	
}
