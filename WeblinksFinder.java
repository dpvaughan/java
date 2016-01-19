public class WeblinksFinder{

  WeblinksFinder(){

  }

  public int links( String html ){

    int numberLinks = 0;
    int start = 0;
    int count = 0;

    while(true){

      int index = html.indexOf("href=", start);

      if(index == -1){
        break;
      }

      int firstQuote = index+6;
      int endQuote = html.indexOf("\"", firstQuote);

      String link = html.substring(firstQuote, endQuote);
      System.out.println(link);

      start = endQuote+1;
      count++;

    }

    System.out.println(count);
    return numberLinks;

  }

}
