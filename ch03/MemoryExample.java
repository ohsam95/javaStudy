package ch03;



public class MemoryExample {

	  int money = 500;

	  int �뵷�ޱ�(String msg){
	    System.out.println(msg);
	    System.out.println("�뵷�� �޾ҽ��ϴ�.");
	    return money;
	  }

	  public static void main(String[] args) {
	    MemoryExample me = new MemoryExample();
	    int money = me.�뵷�ޱ�("�ƺ� ���������ϼ���.");
	    String output = ���Ǳ�.�۵�(money);
	    System.out.println(output+"�� �޾ҽ��ϴ�. �� ���ǲ���!!");
	  }
	}