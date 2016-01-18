public class GeneFinder{

  public static void main( String args[]){

    String dna = "AATGCTAGTTTAAATCTGA";
    String[] stopCodons = new String[3];
    String propProtein = "";

    stopCodons[0] = "TAG";
    stopCodons[1] = "TGA";
    stopCodons[2] = "TAA";

    TagFinder tag = new TagFinder(dna);

    for(int i = 0; i < stopCodons.length; i++){
      propProtein = tag.findProtein(stopCodons[i]);
      System.out.println("End Codon " + stopCodons[i] + " - " + propProtein);
    }

  }

}
