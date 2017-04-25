package guice.guice_tutorial.assorted;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class MainClass {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module() {
            public void configure(Binder binder) {
                binder.bind(ServiceInterface1.class).toInstance(new ServiceImpl1());
            }
        }, new FactoryModuleBuilder().build(ServiceHelperFactory2.class));

        ServiceImpl2 service2 = new ServiceImpl2();
        service2.doSomething(injector.getInstance(ServiceHelperFactory2.class));
    }
}
