package mxbean;


public class SuperFancyBeanAppHealth implements QueueMXBean {

	@Override
	public int getQueueLength() {
		/* do stuff to check the length of a queue */
		return 1337;	
	}

	@Override
	public boolean checkConnection() {
		/* do stuff to check that the connection is working */
		return false;
	}
	

}
