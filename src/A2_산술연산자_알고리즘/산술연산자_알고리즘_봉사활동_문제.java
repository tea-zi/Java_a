package A2_산술연산자_알고리즘;

public class 산술연산자_알고리즘_봉사활동_문제 {
	public static void main(String[] args) {			
		/*	
		 [문제]
		   철수네 반 학생은 31명입니다.
		   이중에서 남학생은 3명 , 여학생은 남학생의 3배의 학생이 봉사할동을 하였습니다.
		   철수네 반에서 봉사활동을 하지않은 학생과 봉사활동 한 학생의 차이는 얼마인지 구하시오.
		 */			
		/*
		 봉사활동 참가인원
		 남학생 3명
		 여학생 3*3=9명
		 총 12명
		 봉사활동 미참가학생 31-12=19명
		 봉사활동 참가학생과 미참가학생의 차이 19-12= 7명차이		 
		 */
		System.out.print("참가학생과 미참가학생의 차이 ");
		System.out.println((31-(3+(3*3)))-(3+(3*3)));
     }
}