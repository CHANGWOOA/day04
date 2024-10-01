package while_;

public class Ex06 {
public static void main(String[] args) {
	for(int k=0;k<3;k++) {
		System.out.println("-----상위 반복 시작");
		for(int i=0; i<3;i++) {
			System.out.println(i+". 하위 for");
			
		}
		System.out.println("상위 반복 끝---");
	}
	System.out.println("--------------------");
	
	for(int i=0;i<3;i++) {
		for(int k=0;k<5;k++) {
			System.out.println(i+" , "+k);
		}
	}
	
	System.out.println("--구구단--");
	
	for(int a=2; a<=9;a++) {
		for(int b=1;b<10;b++) {
			System.out.println(a+"x"+b+"="+a*b);
		}
	}
	
	
}
}
