class Car2{
  int no;
  int speed;
  
  public Car2(){
    no = 0;
  }
  public Car2(int n){
    no = n;
  }

  void run(int s){
    speed = s;
  }
  // brakeメソッドを定義する
	void brake(){
		speed = 0;
	}
	
	void brake(int s){
		speed -= s;
	}

  void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}
