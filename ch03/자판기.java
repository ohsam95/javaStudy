package ch03;

public class 자판기 {

	  static String cola = "코카콜라";
	  static String water = "물";
	  
	  static String 작동(int money){
	    System.out.println("자판기가 작동합니다.");
	    System.out.println(money+"원을 받았습니다.");
	    return cola;
	  }
	}

