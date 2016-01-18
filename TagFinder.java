import java.io.*;

public class TagFinder{

  private String startCodon = "ATG";
  private String dnaString;

  TagFinder(String dna){
    dnaString = dna;
    dnaString = dnaString.toUpperCase();
  }

  public String findProtein(String stopCodon){

    String protein = "";
    int startIndex;
    int stopIndex;

    startIndex = dnaString.indexOf(startCodon);
    if(startIndex == -1){
      return "";
    }

    stopIndex = dnaString.indexOf(stopCodon, startIndex+3);

    if((stopIndex - startIndex) % 3 == 0){
			protein = dnaString.substring(startIndex, stopIndex+3);
      return protein;
		} else {
      return "";
    }

  }

}
