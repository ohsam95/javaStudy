package array03;

//*
//**
//***
//****

public class StarEx01 {

	static void printStars(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printStars(1);
		printStars(2);
		printStars(3);
		printStars(4);

//		for (int i = 0; i < 6; i++) {   //ÇàÀÇ °¹¼ö
//			printStars(i);			// ¿­ÀÇ °¹¼ö
//		}

		printStars(4);
		printStars(3);
		printStars(2);
		printStars(1);

		for (int i = 5; i >= 0; i--) {
			printStars(i);
		}
		
	}
}
