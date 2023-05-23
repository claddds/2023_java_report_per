package report0517.und;

import java.util.Scanner;

public class Upndown {
	public static void main(String[] args) {
		/*
		랜덤함수를 활용해 높음,낮음을 맞추는 게임
		(랜덤숫자는 1-10사이로 선정, 3번안에 맞추면 승리)
		계속할까요(y/n)를 활용해 무한루프
		끝내면 횟수와 이긴횟수로 승률구하기(+퍼센트)
		-> day7/com.ict.edu2/Ex01_Scanner3
		*/
		System.out.println("업앤다운 게임");
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int my_win = 0;
		boolean isSuccess = false;	// 3번안에 맞추는지 확인하기 위한 변수
		
		esc:
		while(true) {
			count++;
			int com_card = (int)(Math.random()*10)+1;	//1~10사이의 난수 발생
			
			// 3번안에 맞추면 승리
			for (int i = 1; i <= 3; i++) {
				System.out.print("1부터 10 중 하나의 답을 선택하세요 >>");
				int my_card = scan.nextInt();
				
				if (my_card > com_card) {
					System.out.println("더 낮은 숫자입니다.");
				}else if(my_card < com_card) {
					System.out.println("더 높은 숫자입니다.");
				}else if(my_card == com_card){	//my_card == com_card
					System.out.println("정답 일치합니다");
					my_win++;
					isSuccess = true;
					break;
				}
			}
			
			// 3번안에 못 맞춰서 실패시
			if (isSuccess == false) {
				System.out.println("실패하였습니다.");
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
