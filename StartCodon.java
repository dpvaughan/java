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

    int start = 0;
    int stopIndex = 0;

    String[] stopCodons = new String[3];

    stopCodons[0] = "TAG";
    //stopCodons[1] = "TGA";
    //stopCodons[2] = "TAA";

    for(int i = 0; i < stopCodons.length; i++){

      while(true){

        stopIndex = dna.indexOf(stopCodons[i], start+3);

        if(stopIndex == -1){
          break;
        }

        start = stopIndex + 3;

        System.out.println(stopCodons[i] + " " + stopIndex);

      }

      //System.out.println(stopCodons[i] + " " + stopIndex);

    }

  }

}
