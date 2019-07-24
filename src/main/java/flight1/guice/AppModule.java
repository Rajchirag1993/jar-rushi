package flight1.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import flight1.HelloService;
import flight1.HelloServiceImpl;
import flight1.ThrowableMapper;
import flight1.HelloResource;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloResource.class);

    bind(ThrowableMapper.class);
  }

  @Provides
  @Singleton
  public HelloService helloService() {
    return new HelloServiceImpl();
  }

}
