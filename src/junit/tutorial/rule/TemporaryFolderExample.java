package junit.tutorial.rule;

import java.io.File;
import java.io.IOException;

public class TemporaryFolderExample {

  public static void mkDefaultFiles(File folder) {
    File f;
    try {
      f = new File(folder.toString()+"/UnitTest");
      f.createNewFile();
      f = new File(folder.toString()+"/readme.txt");
      f.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
