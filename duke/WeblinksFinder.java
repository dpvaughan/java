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

      if(link.startsWith("http")){
        if(link.startsWith("http://www.youtube") || link.startsWith("https://www.youtube")){
            System.out.println(link);
        } else {
            System.out.println(link);
        }
      }

      count++;
      start = endQuote+1;

    }

    System.out.println(count);
    return numberLinks;

  }

}
