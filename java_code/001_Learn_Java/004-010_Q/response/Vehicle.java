package mypack;

public abstract class Vehicle{
  protected int crewNum;
  
  /*
  public Vehicle(int crewNum){ // crewNumをprotectedにしているので、サブクラスから書き込める→よって不要
    this.crewNum = crewNum;
  }
  */
  public abstract void showCrewNum();
}
