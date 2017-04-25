package guice.guice_tutorial.assorted;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class ServiceImpl2 {
    public void doSomething(ServiceHelperFactory2 factory) {
        System.out.println("Do something in Service 2");
        factory.createAgent1().doSomething();
    }
}
