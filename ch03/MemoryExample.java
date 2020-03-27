package ch03;



public class MemoryExample {

	  int money = 500;

	  int 용돈받기(String msg){
	    System.out.println(msg);
	    System.out.println("용돈을 받았습니다.");
	    return money;
	  }

	  public static void main(String[] args) {
	    MemoryExample me = new MemoryExample();
	    int money = me.용돈받기("아빠 만수무강하세요.");
	    String output = 자판기.작동(money);
	    System.out.println(output+"을 받았습니다. 잘 마실께요!!");
	  }
	}