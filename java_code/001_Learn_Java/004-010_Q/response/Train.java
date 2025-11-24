package mypack;

public class Train extends Vehicle{
  public Train(int crewNum){
    // super(crewNum);  // Vehicleでコンストラクタを使用しなくしたため
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("電車の乗客：" + crewNum + "名");
  }
}
