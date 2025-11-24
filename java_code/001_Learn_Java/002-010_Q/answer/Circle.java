class Circle{
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;
    
    area = radius * radius * pi;
    
    //¬”“_‘æ‚RˆÊˆÈ~‚ğØ‚èÌ‚Ä
    area = (int)(area * 100);
    area = area / 100;
    
    System.out.println("”¼ŒaF" + radius);
    System.out.println("–ÊÏF" + area);
  }
}
