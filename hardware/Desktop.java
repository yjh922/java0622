package com.sp.app0622.hardware;


//컴퓨터 본체를 정의한다.
public class Desktop {
	//부품 들을 has a 관계로 보유
	Ram ram;
	Hard hard;
	Keyboard keyboard;
	
	//데스크탑은 부품을 가지고 있으므로, 즉 초기화 할 대상이 있으므로 생성자의 코드 작성은 필수이다.
	public Desktop() {
		ram=new Ram("삼성");
		hard=new Hard(1000,"SSD");
		keyboard=new Keyboard("로지텍",59000);
	}
	
	public static void main(String[] args) {
		//컴퓨터 본체의 인스턴스를 생성하는 시점에 해당 부품들도 메모리에 올라와야 하며
		//데스크탑의 인스턴스 생성 이후에는 메모리의 브랜드명, 하드의 사이즈, 키보드 가격을 출력
		Desktop d=new Desktop();
		System.out.println("메모리의 브랜드는"+d.ram.brand);
		System.out.println("하드디스크의 용량은"+d.hard.size);
		System.out.println("키보드의 가격은"+d.keyboard.price);
		
		/*
		String a=d.ram.brand;
		int b=d.hard.size;
		int c=d.keyboard.price;
		System.out.println(a+b+c);
		*/
		
		
	}
}
