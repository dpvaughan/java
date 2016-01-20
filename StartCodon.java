public class StartCodon{

  private String startCodon = "ATG";

  StartCodon(){

  }

  public int findStartCodon(String dna){

    int start = 0;

    while(true){

      int sCodonIndex = dna.indexOf(startCodon, start);

      if(sCodonIndex == -1){
        break;
      }

      findStopIndex(sCodonIndex, dna);

      start = sCodonIndex + 3;

    }

    return 1;

  }

  public int findStopIndex( int startIndex, String dna ){

    int stopCodonTAG = dna.indexOf("TAG", startIndex);
    if(stopCodonTAG == -1 || ( stopCodonTAG - startIndex ) % 3 != 0){
      stopCodonTAG = dna.length();
      System.out.println(stopCodonTAG);
      //System.out.println("Start : " + startIndex +  " Stop TAG: " + stopCodonTAG);
    }

    //int stopCodonTGA = dna.indexOf("TGA", startIndex);
    //if(stopCodonTGA == -1 || ( stopCodonTGA - startIndex ) % 3 != 0){
    //  System.out.println("Start : " + startIndex +  " Stop TGA: " + stopCodonTGA);
    //}

    //int stopCodonTTA = dna.indexOf("TTA", startIndex);
    //if(stopCodonTTA == -1 || ( stopCodonTTA - startIndex ) % 3 != 0){
    //  System.out.println("Start : " + startIndex +  " Stop TTA: " + stopCodonTTA);
    //}

    return 1;

  }

}
