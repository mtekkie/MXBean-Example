# MXBean-Example

### Description
This is an example application that exposes an simple MXBean. Nothing fancy.

### Walkthrough

- The Java EE application server starts and starts the Singleton EJB.

- The singletons init function creates an MXBean and registers it with the JVM's MBean server as Application:name=QueueChecker.


### Tests

To test the MXBean the JConsole is an excellent tool.

- Fire it up and connect to the local process.
![ Shows Jconsoles select instance page ](jc-ss1.png  "Jconsole - Ugly but useful! our motto since 1984")

- Navigate to MBeans.
![ Shows the MBean page ](jc-ss2.png "Jconsole - Ugly but useful! our motto since 1984")
  Our EJB's startup has not finished just yet. Our MXBean has not been registered with the MBEan Server.

- Look at the attributes and or values.
  ![ Shows Queuelenght property of our MXBean ](jc-ss3.png "Jconsole - Ugly but useful! our motto since 1984")
    Our MXbean has now been registered and we can browse the attributes and execute the operations.

  ### More information
  Check out these, more in-depth resources with more advanced examples.
- https://docs.oracle.com/javase/tutorial/jmx/mbeans/mxbeans.html

- https://docs.oracle.com/javase/7/docs/api/javax/management/MXBean.html
