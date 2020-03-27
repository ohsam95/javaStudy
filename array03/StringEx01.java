package array03;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("나무");
		String s2 = new String("나무");
		System.out.println(s1==s2);  //false 인 이유 - 다른 공간에 생성되서 다른 주소를 가지기 때문

		String s3="나무";
		String s4="나무";
		System.out.println(s3==s4);  // 같은 주소를 가짐

		System.out.println(s1==s4); // 다른 주소를 가지기 때문에 false
		
		System.out.println(s1.equals(s4)); //equals 사용시 주소값까지 가서 안의 내용을 비교
	}
	
}
