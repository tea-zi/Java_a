package A3_나누기_프로젝트;

public class 나누기_프로젝트_데이트 {
	public static void main(String[] args) {	
		/*
		  [설명] 
		 	- 철수와 영희는 50000원 을 가지고있다. 
		 	- 철수와 영희는 같이 영화 1편을 봤다.
		 	- 간식은 팝콘1개와 콜라 2개를 사먹었다.
		  [문제] 남은돈은 얼마인가? 
		  [힌트] 
		 		1) 콜라1개는  팝콘1개 보다 4000원 싸다.
		 		2) 영화 1편의 가격은 12000 원이다.
		 		3) 팝콘의 가격은 영화의  0.6 가격이다.  
		*/
		/*
		 * 영화표 2개 = 12000*2
		 * 팝콘 1개 = 12000*0.6
		 * 콜라 1개 = 12000*0.6-4000
		 * 남은 돈 = 50000-영화표 2개 -팝콘1개 -콜라2개 = 50000-(영화표2개+팝콘1개+콜라2개)
		 */
		System.out.printf("영화표 2개 = %.2f\n",12000*2.0);
		System.out.printf("팝콘 1개 = %.2f\n",12000*0.6);
		System.out.printf("콜라 1개 = %.2f\n",12000*0.6-4000);
		System.out.println(50000-12000*2-12000*0.6-(12000*0.6-4000)*2);
		System.out.println("나누기사용");
		System.out.println(50000-12000*2-12000*6/10-(12000*6/10-4000)*2);
		
     }
}