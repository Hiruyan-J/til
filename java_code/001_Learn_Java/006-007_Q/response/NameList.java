import java.util.ArrayList;

public class NameList{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add("÷ˆä");
    names.add("“cŒ´");
    names.add("’†ì");
    names.add("—é–Ø");
    String search = args[0];
    boolean result = false;

    for(int i = 0; i < names.size(); i++){
      if(names.get(i).equals(search)){
        result = true;
      }
    }
    if(result){
      System.out.println(search + "‚³‚ñ‚ÍŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚·");
    } else {
      System.out.println(search + "‚³‚ñ‚ÍŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚¹‚ñ");
    }
  }
}
