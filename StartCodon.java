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

    System.out.println(startIndex + " " + dna);

  }

}
