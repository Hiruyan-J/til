class Branch1{
  public static void main(String[] args){
    int price = Integer.parseInt(args[0]);
    double rate = 0.10;         // Á”ïÅ—¦F10%;
    int discount, amount;
    
    if( price >= 3000 ){        // ’lˆøŠz‚Ìİ’è
      discount = 300;
    } else {
      discount = 0;
    }

    amount = (int)((price - discount) * (1 + rate));
    System.out.println("’lˆø‹àŠzF" + discount + "‰~");
    System.out.println("Å‹àŠzF" + amount + "‰~");
  }
}
