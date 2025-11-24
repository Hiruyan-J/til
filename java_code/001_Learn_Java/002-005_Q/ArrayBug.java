class ArrayBug{
  public static void main(String[] args){
    String[] name = new String[4];
    
    name[0] = "÷ˆä";
    name[1] = "“cŒ´";
    name[2] = "’†ì";
    name[3] = "—é–Ø";
    name[4] = "¬—Ñ";
    
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}
