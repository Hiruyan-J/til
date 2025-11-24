/* ここを埋める */

public class CharStreamTime{
  public static void main(String[] args){
    FileReader fr = null;
    FileWriter fw = null;
    try {
      fr = /* ここを埋める */
      fw = /* ここを埋める */
      
      int data;
      String msg = "";
      
      long t1 = System.currentTimeMillis();
      while( (data = /* ここを埋める */) != -1) {
        msg = msg + (char)data;
      }
      
      long t2 = System.currentTimeMillis();
      for(int i = 0; i < 100000; i++){
        /* ここを埋める */
        fw.write("\n");
      }
      
      long t3 = System.currentTimeMillis();
      System.out.println("入力：" + (t2 - t1) + "ミリ秒");
      System.out.println("出力：" + (t3 - t2) + "ミリ秒");
      System.out.println("合計：" + (t3 - t1) + "ミリ秒");
      
    } catch(IOException e) {
      System.err.println("エラーが発生しました");
    } finally {
      try {
        if(fr != null) /* ここを埋める */
        if(fw != null) /* ここを埋める */
      } catch(IOException e) {
        System.err.println("エラーが発生しました");
     }
    }
  }
}
