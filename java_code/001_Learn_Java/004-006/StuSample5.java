public class StuSample5{
  public static void main(String[] args){
    Student5 stu1 = new Student5("菅原",1);
    Person5 psn = stu1;
    psn.display();
    // psn.chgStuNo(1001);

    /* 補足：instanceofキーワード
       オブジェクトのクラスを特定する
       対象オブジェクト instanceof クラス名 */
    if(psn instanceof Student5){
      Student5 stu2 = (Student5)psn;
      stu2.chgStuNo(1001);
      stu2.display();
      // 以下、挙動確認で追記
      stu1.display(); // →学籍番号:1001
      stu1.chgStuNo(2);// →学籍番号:2
      stu1.display();// →学籍番号:2
      psn.display();// →学籍番号:2
      stu2.display();// →学籍番号:2
    }
    
  }
}
