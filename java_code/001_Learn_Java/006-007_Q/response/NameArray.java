public class NameArray{
  public static void main(String[] args){
    String[] names = {"÷ˆä", "“cŒ´", "’†ì", "—é–Ø"};
    String search = args[0];
    int i ;

    for(i = 0; i < names.length; i++){
      if(names[i].equals(search)){
        brake;
      }
    }
    if(i < names.length){
      System.out.println(search + "‚³‚ñ‚ÍŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚·");
    } else {
      System.out.println(search + "‚³‚ñ‚ÍŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚¹‚ñ");
    }
  }
}
