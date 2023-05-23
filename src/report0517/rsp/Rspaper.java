package report0517.rsp;

import java.util.Scanner;

public class Rspaper {
	public static void main(String[] args) {
		/*
			랜덤함수를 활용한 가위바위보 게임
			
			계속할까요(y/n)를 활용해 무한루프
			끝내면 횟수와 이긴횟수로 승률구하기(+퍼센트)
			-> day7/com.ict.edu2/Ex01_Scanner3
			
		*/
		System.out.println("가위바위보 게임");
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int my_win = 0;
		esc:
		while(true) {
			count++;
			System.out.print("가위/바위/보 중 하나를 선택하세요 >>");
			int com_card = (int)(Math.random()*3);	//0~2사이의 난수 발생
			String my_card = scan.next();
			
			if(my_card.equals("가위")) {
				if(com_card==0) {
					System.out.println("나:가위");
					System.out.println("컴퓨터:가위");
					System.out.println("비겼습니다");
				}else if(com_card==1) {
					System.out.println("나:가위");
					System.out.println("컴퓨터:바위");
					System.out.println("졌습니다");
				}else {
					System.out.println("나:가위");
					System.out.println("컴퓨터:보");
					System.out.println("이겼습니다");
					my_win++;
				}
			}else if(my_card.equals("바위")) {
				if(com_card==0) {
					System.out.println("나:바위");
					System.out.println("컴퓨터:가위");
					System.out.println("이겼습니다");
					my_win++;
				}else if(com_card==1) {
					System.out.println("나:바위");
					System.out.println("컴퓨터:바위");
					System.out.println("비겼습니다");
				}else {
					System.out.println("나:바위");
					System.out.println("컴퓨터:보");
					System.out.println("졌습니다");
				}
			}else if(my_card.equals("보")) {
				if(com_card==0) {
					System.out.println("나:보");
					System.out.println("컴퓨터:가위");
					System.out.println("졌습니다");
				}else if(com_card==1) {
					System.out.println("나:보");
					System.out.println("컴퓨터:바위");
					System.out.println("이겼습니다");
					my_win++;
				}else {
					System.out.println("나:보");
					System.out.println("컴퓨터:보");
					System.out.println("비겼습니다");
				}
			}
			
			while(true) {
				System.out.println("계속할까요?(Y(y), N(n) >> ");
				String progress = scan.next();
				if(progress.equalsIgnoreCase("y")) {
					continue esc;
				}else if(progress.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("제대로 입력하세요");
					continue;
				}
			}
		}
		
		double per = (my_win / (count * 1.0)) * 100;
		System.out.println("나의 승률: " + (int) (per * 10) / 10.0 + "%");
	}
}
