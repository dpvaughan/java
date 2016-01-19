public class StartCodon{

  private String startCodon = "ATG";

  StartCodon(){

  }

  public int findStartCodon(String dna){

    int start = 0;

    while(true){

      int startIndex = dna.indexOf(startCodon, start);

      if(startIndex == -1){
        break;
      } else {
        findStopIndex(startIndex, dna);
      }

      start = startIndex + 3;

    }

    return 1;

  }

  public void findStopIndex( int startIndex, String dna ){

    String[] stopCodons = new String[3];

    int stopIndex = 0;

    stopCodons[0] = "TAG";
    stopCodons[1] = "TGA";
    stopCodons[2] = "TAA";

    for(int i = 0; i < stopCodons.length; i++){
      stopIndex = dna.indexOf(stopCodons[i], startIndex+3);
      System.out.println("In here" + " " + " " + stopCodons[i] + " " + " " + stopIndex);
    }

    System.out.println(startIndex + " " + dna);

  }

}
