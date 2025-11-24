class Cast{
  public static void main(String[] args){
    int price = Integer.parseInt(args[0]);
    double rate = 0.08;         // Á”ïÅ—¦F8%
    int amount;

    amount = (int)(price * (1 + rate)); // ¬”“_ˆÈ‰ºØ‚èÌ‚Ä
    System.out.println("Å‹àŠzF" + amount + "‰~");
  }
}