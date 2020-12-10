package jp.hogehoge.javastudy;

import java.util.Scanner;

/**
 * BMI(体格指数)を計算するプログラム
 * BMI = 体重/(身長*身長)
 * 
 * @author Yuta
 */
public class BmiCalculation2 {

	public static void main(String[] args) {
		double weight,height,bmi;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？(kg)");
		weight = stdIn.nextDouble();
		System.out.println("身長は？(cm)");
		height = stdIn.nextDouble();
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("痩せ型です。");
		}else if (bmi < 25) {
			System.out.println("標準です。");
		} else {
			System.out.println("肥満です。");
		}
		
		
	}

}
