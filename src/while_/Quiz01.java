package while_;

import java.util.Scanner;
//미완성. 마저 진행 해보기
public class Quiz01 {
public static void main(String[] args) {
// 로그인, 회원가입, 나가기

	Scanner input=new Scanner(System.in);
	
	System.out.println("1. 로그인");
	System.out.println("2. 회원가입");
	System.out.println("3. 나가기");
	
	int num;
	num=input.nextInt();
	
	switch(num)
	{
	case 1:
		System.out.println("아이디 입력 : ");
		String id=null, pw=null;
		id=input.next();
		System.out.println("비밀번호 입력 : ");
		pw=input.next();
	}
		
	
	
	
	
	
	
		
	
	
}
}
