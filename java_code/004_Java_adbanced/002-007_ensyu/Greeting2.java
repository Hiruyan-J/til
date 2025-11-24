public class Greeting2{
  public static void main(String[] args){
    PrintGreet1 pg1 = new PrintGreet1("‚¨‚Í‚æ‚¤");
    PrintGreet1 pg2 = new PrintGreet1("‚¨‚â‚·‚Ý");
    PrintGreet1 pg3 = new PrintGreet1("‚ ‚è‚ª‚Æ‚¤");
    Thread th1 = new Thread(pg1);
    Thread th2 = new Thread(pg2);
    Thread th3 = new Thread(pg3);
    th1.start();
    th2.start();
    th3.start();
  }
}
