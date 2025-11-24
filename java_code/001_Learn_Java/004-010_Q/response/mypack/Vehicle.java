package mypack;

public abstract class Vehicle{
  protected int crewNum;
  
  public Vehicle(int crewNum){
    this.crewNum = crewNum;
  }
  public abstract void showCrewNum();
}
