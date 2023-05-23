package report0518.remote;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 한 개의 리모컨으로 3개의 기기 볼륨조절
		 반복문을 활용한다(1. TV   2. 스피커   3. 이어폰   4. exit >>> )
		 (볼륨 기본:3 MAX:10 MIN: 0)
		*/
		Remote_Control tv = new Tv();
		Remote_Control speaker = new Speaker();
		Remote_Control ear = new EarPhones();
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("볼륨조절할 기기를 선택하세요");
			System.out.print("1. TV  2. 스피커  3. 이어폰  4. exit  >>> ");
			
			int device = scan.nextInt();
			
			if(device == 4) {
				break;
			}
			
			while(true) {
				
				System.out.print("1. 볼륨 키우기   2. 볼륨 줄이기   3. 다른 기기 선택하기 >>> ");
				
				int volume_btn = scan.nextInt();
				
				if(volume_btn == 3) {
					break;
				}
				
				switch (device) {
				case 1:
					if(volume_btn == 1) {
						System.out.println("현재 TV의 음량은" + tv.volumeUp());
						//tv.volumeUp();
					}else if(volume_btn == 2){
						System.out.println("현재 TV의 음량은" + tv.volumeDown());
						//tv.volumeDown();
					}else {
						System.out.println("잘못선택하셨습니다.");
					}
					break;
				case 2:
					if(volume_btn == 1) {
						System.out.println("현재 스피커의 음량은" + speaker.volumeUp());
						//speaker.volumeUp();
					}else if(volume_btn == 2){
						System.out.println("현재 스피커의 음량은" + speaker.volumeDown());
						//speaker.volumeDown();
					}else {
						System.out.println("잘못선택하셨습니다.");
					}
					break;
				case 3:
					if(volume_btn == 1) {
						System.out.println("현재 이어폰의 음량은" + ear.volumeUp());
						//ear.volumeUp();
					}else if(volume_btn == 2){
						System.out.println("현재 이어폰의 음량은" + ear.volumeDown());
						//ear.volumeDown();
					}else {
						System.out.println("잘못선택하셨습니다.");
					}
					break;
				}
				
			}
			
			
		}
	}
}
