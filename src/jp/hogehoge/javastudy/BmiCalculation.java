package jp.hogehoge.javastudy;

/**
 * BMI(体格指数)を計算するプログラム
 * BMI = 体重/(身長*身長)
 * 
 * @author Yuta
 */
public class BmiCalculation {

	public static void main(String[] args) {
		double weight,height,bmi;
		
		weight = 71;
		height = 1.8;
		bmi = weight / (height * height);
		
		System.out.println(bmi);
	}

}
