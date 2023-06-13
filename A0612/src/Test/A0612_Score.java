package Test;

class Score {
	double sum;
	
	public Score() {
	}
	
	public void show(int[][] grade) {
		int length = 0;
		for(int i = 0; i < grade.length; i++) {
			for(int j = 0; j < grade[i].length; j++) {
				sum += grade[i][j];
				length += 1;
			}
		}
		
		System.out.println(sum/length);
		
	}
}

public class A0612_Score {

	public static void main(String[] args) {
		
		int [][] grade = {{90, 100, 80},{70,95,87},{80,90,70},{90,100,100}};
		
		Score s = new Score();
		s.show(grade); //이차원배열의 평균 출력

	}

}
