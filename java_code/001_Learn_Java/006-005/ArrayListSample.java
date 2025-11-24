import java.util.ArrayList;

public class ArrayListSample{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    System.out.println(list.size());
    list.add("Java“ü–åuÀ");
    list.add("‚±‚±‚Ü‚Å");
    list.add("‚æ‚­Šæ’£‚è‚Ü‚µ‚½‚ËI");
    System.out.println(list.size());
    
    list.remove(1);
    System.out.println(list.size());
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}