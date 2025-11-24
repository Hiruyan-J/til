package mypack;

public class Taxi extends Vehicle implements Stopable{
  public Taxi(int crewNum){
    super(crewNum);
  }
  public void showCrewNum(){
    System.out.println("タクシーの乗客：" + crewNum + "名");
  }
  public void stop(){
    System.out.println("ここで降ります");
  }
}
