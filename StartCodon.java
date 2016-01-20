public class StartCodon{

  private String startCodon = "ATG";

  StartCodon(){

  }

  public int findStartCodon(String dna){

    int start = 0;
    String protein = "";

    while(true){

      int sCodonIndex = dna.indexOf(startCodon, start);

      if(sCodonIndex == -1){
        break;
      }

      int stop = findStopIndex(sCodonIndex, dna);

      protein = dna.substring(sCodonIndex, stop);

      System.out.println(sCodonIndex + " " + " " +stop + " " + protein);

      start = sCodonIndex + 3;

    }

    return 1;

  }

  public int findStopIndex( int startIndex, String dna ){

    int stop1 = dna.indexOf("TGA", startIndex);

    if (stop1 == -1 || (stop1 - startIndex) % 3 != 0) {
        stop1 = dna.length();
    }

    int stop2 = dna.indexOf("TAA", startIndex);
    if (stop2 == -1 || (stop2 - startIndex) % 3 != 0) {
        stop2 = dna.length();
    }

    int stop3 = dna.indexOf("TAG", startIndex);
    if (stop3 == -1 || (stop3 - startIndex) % 3 != 0) {
        stop3 = dna.length();
    }

    return Math.min(stop1, Math.min(stop2, stop3));

  }

}
