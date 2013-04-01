package junit.tutorial.resources;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ServerResourceTest extends ExternalResource {

  @Test
  public void ServerTest() throws Exception {
  }

  @Rule
  public ServerResource resource = new ServerResource();


  public class ServerResource extends ExternalResource {
    Server server;

    @Override
    protected void before() throws Throwable {
      System.out.println("Server start.");
      server = new Server(8080);
      server.start();
    }

    @Override
    protected void after() {
      System.out.println("Server shutdown.");
      server.shutdown();
    }
  }

}
