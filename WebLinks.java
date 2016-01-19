import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class WebLinks{

  public static void main(String args[]){

    String htmlString = "";

    try {

      String sCurrentLine = "";

      BufferedReader bReader  = new BufferedReader(new FileReader("manylinks.html"));
      StringBuilder sBuilder = new StringBuilder();

      while ((sCurrentLine = bReader.readLine()) != null) {
			     sBuilder.append(sCurrentLine);
			}

      htmlString = sBuilder.toString();

    } catch (IOException e) {
      e.printStackTrace();
    }

    WeblinksFinder linksFinder = new WeblinksFinder();
    linksFinder.links(htmlString);

  }

}
