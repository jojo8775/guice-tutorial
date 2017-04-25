package guice.guice_tutorial.assorted;

import com.google.inject.Inject;

public class Agent1 {
    @Inject ServiceInterface1 service1;
    
    public void doSomething() {
        System.out.println("Do something in Agent1");
        service1.doSomething();
    }
}
