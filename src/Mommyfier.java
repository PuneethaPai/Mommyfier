import java.util.Arrays;
import java.util.List;

class Mommyfier {
  private final List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

  String mommyfy(String aString) {
    String result = "";
    String[] splitString = aString.split("");
    for(String character : splitString) {
      System.out.println(character);
    }
    for (int index =0; index < aString.length(); index++) {
      if(index >0 && vowels.contains(splitString[index-1]) && vowels.contains(splitString[index])){
        continue;
      }
      if(vowels.contains(splitString[index])){
        result += "mommy";
        continue;
      }
        result += splitString[index];
    }
    return result;
  }
}
