package while_;

import java.util.Scanner;

public class SelfQuiz01 {
public static void main(String[] args) {
	//문제: 100~200 사이 숫자 중에 하나를 골라 그 숫자를 공통 배수로 가지는 숫자들을 출력하시오
	Scanner input=new Scanner(System.in);
	
	int num;
	
	while(true)
	{
		System.out.println("100~200 사이의 숫자 중에 원하는 숫자 하나를 입력하세요");
		num=input.nextInt();
		
		System.out.println("고르신 숫자는"+num+"입니다.");
		// 입력한 숫자의 범위가 올바른지, 올바르지 않다면 다시 입력하여 출력
		if(num>=100&&num<=200) {
			System.out.println(num+"를 공통 배수로 가지는 숫자를 출력합니다");
			break;
		}
		else if(num<100||num>200) {
			System.out.println("숫자가 정해진 범위보다 작거나 큽니다. 다시 입력하세요");
		}
		
	}
	// 입력한 숫자를 공통 배수로 가져야하는 조건식 확인
	for(int i=1; i<=num;i++) {
		if(num%i==0)
			System.out.println(i);
	}
	
}
}
