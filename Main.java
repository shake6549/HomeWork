package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//初始化得到所有的数字LCD样式，并放在一个集合LCD中
		ArrayList<String[][]> LCD = init();

		// 接收输入数据
		System.out.println("请输入数据（数字）：");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		
		// 遍历所输入数据,遍历三次，每次输出一行数据
		go: for (int k = 0; k < 3; k++) {

			for (int i = 0; i < line.length(); i++) {
				switch (line.charAt(i)) {
				case '0':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(0)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '1':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(1)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '2':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(2)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '3':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(3)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '4':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(4)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '5':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(5)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '6':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(6)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '7':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(7)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '8':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(8)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;
				case '9':
					for (int j = 0; j < 3; j++) {
						System.out.print(LCD.get(9)[k][j]);
					}
					if (i < line.length() - 1) {
						System.out.print(" ");
					}
					break;

				default:
					System.out.println("输入有误。");
					break go;
				}

			}
			System.out.println();
		}

	}

	// 设定一个静态的初始化LCD灯样式
	public static ArrayList<String[][]> init() {

		// 定义一个存储所有LCD样式的集合
		ArrayList<String[][]> LCD = new ArrayList<String[][]>();

		//数字0
		String[][] zero_LCD = new String[3][3];
		for (int i = 0; i < zero_LCD.length; i++) {
			for (int j = 0; j < zero_LCD[0].length; j++) {
				zero_LCD[i][j] = "·";
			}
		}
		zero_LCD[0][1] = "_";
		zero_LCD[2][1] = "_";
		zero_LCD[1][0] = "|";
		zero_LCD[2][0] = "|";
		zero_LCD[1][2] = "|";
		zero_LCD[2][2] = "|";
		
		//数字1
		String[][] one_LCD = new String[3][3];
		for (int i = 0; i < one_LCD.length; i++) {
			for (int j = 0; j < one_LCD[0].length; j++) {
				one_LCD[i][j] = "·";
			}
		}
		one_LCD[1][2] = "|";
		one_LCD[2][2] = "|";
		
		//数字2
		String[][] two_LCD = new String[3][3];
		for (int i = 0; i < two_LCD.length; i++) {
			for (int j = 0; j < two_LCD[0].length; j++) {
				two_LCD[i][j] = "·";
			}
		}
		two_LCD[0][1] = "_";
		two_LCD[1][1] = "_";
		two_LCD[2][1] = "_";
		two_LCD[1][2] = "|";
		two_LCD[2][0] = "|";
		
		//数字3
		String[][] three_LCD = new String[3][3];
		for (int i = 0; i < three_LCD.length; i++) {
			for (int j = 0; j < three_LCD[0].length; j++) {
				three_LCD[i][j] = "·";
			}
		}
		three_LCD[0][1] = "_";
		three_LCD[1][1] = "_";
		three_LCD[2][1] = "_";
		three_LCD[1][2] = "|";
		three_LCD[2][2] = "|";
		
		//数字4
		String[][] four_LCD = new String[3][3];
		for (int i = 0; i < four_LCD.length; i++) {
			for (int j = 0; j < four_LCD[0].length; j++) {
				four_LCD[i][j] = "·";
			}
		}
		four_LCD[1][1] = "_";
		four_LCD[1][0] = "|";
		four_LCD[1][2] = "|";
		four_LCD[2][2] = "|";
		
		//数字5
		String[][] five_LCD = new String[3][3];
		for (int i = 0; i < five_LCD.length; i++) {
			for (int j = 0; j < five_LCD[0].length; j++) {
				five_LCD[i][j] = "·";
			}
		}
		five_LCD[0][1] = "_";
		five_LCD[1][1] = "_";
		five_LCD[2][1] = "_";
		five_LCD[1][0] = "|";
		five_LCD[2][2] = "|";
		
		//数字6
		String[][] six_LCD = new String[3][3];
		for (int i = 0; i < six_LCD.length; i++) {
			for (int j = 0; j < six_LCD[0].length; j++) {
				six_LCD[i][j] = "·";
			}
		}
		six_LCD[0][1] = "_";
		six_LCD[1][1] = "_";
		six_LCD[2][1] = "_";
		six_LCD[1][0] = "|";
		six_LCD[2][0] = "|";
		six_LCD[2][2] = "|";
		
		//数字7
		String[][] seven_LCD = new String[3][3];
		for (int i = 0; i < seven_LCD.length; i++) {
			for (int j = 0; j < seven_LCD[0].length; j++) {
				seven_LCD[i][j] = "·";
			}
		}
		seven_LCD[0][1] = "_";
		seven_LCD[1][2] = "|";
		seven_LCD[2][2] = "|";
		
		//数字8
		String[][] eight_LCD = new String[3][3];
		for (int i = 0; i < eight_LCD.length; i++) {
			for (int j = 0; j < eight_LCD[0].length; j++) {
				eight_LCD[i][j] = "·";
			}
		}
		eight_LCD[0][1] = "_";
		eight_LCD[1][1] = "_";
		eight_LCD[2][1] = "_";
		eight_LCD[1][0] = "|";
		eight_LCD[1][2] = "|";
		eight_LCD[2][0] = "|";
		eight_LCD[2][2] = "|";
		
		//数字9
		String[][] nine_LCD = new String[3][3];
		for (int i = 0; i < nine_LCD.length; i++) {
			for (int j = 0; j < nine_LCD[0].length; j++) {
				nine_LCD[i][j] = "·";
			}
		}
		nine_LCD[0][1] = "_";
		nine_LCD[1][1] = "_";
		nine_LCD[1][0] = "|";
		nine_LCD[1][2] = "|";
		nine_LCD[2][2] = "|";

		//将LCD样式数字添加到集合中
		LCD.add(zero_LCD);
		LCD.add(one_LCD);
		LCD.add(two_LCD);
		LCD.add(three_LCD);
		LCD.add(four_LCD);
		LCD.add(five_LCD);
		LCD.add(six_LCD);
		LCD.add(seven_LCD);
		LCD.add(eight_LCD);
		LCD.add(nine_LCD);

		return LCD;
	}
}
