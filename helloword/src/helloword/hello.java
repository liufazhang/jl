package helloword;

import java.util.Arrays;
import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		/*
		 * ����༶��ѧ���ɼ�����ӡ��ƽ����
		int classNum = 2;
		int classMem =3;
		int avg=0;
		int sum=0;
		Scanner input = new Scanner(System.in);
		int score ;
		int i;
		int j;
		for(i=0; i<classNum;i++){
			sum = 0;
			System.out.println("��"+i+"����");
			for(j=0;j<classMem;j++){
				System.out.println("�����"+j+"��ѧ���ɼ�");
				score = input.nextInt();
				sum += score;
			}
			avg = sum/j;
			System.out.println("��"+i+"�����ƽ����:"+avg);
		}*/
		
		
		/*
		 * Arrays��������
		
		
		int scores[]={88,89,73,67,90,99};
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++){
			System.out.println(scores[i]);
		}
		
		System.out.println("toString������"+ Arrays.toString(scores));
		
		for(int aa:scores){
			System.out.println(aa);
		}
	   */
		
		/*
		 * 
		 */
		int[] scores={-10,80,70,90,101,99};
		hello hl = new hello();
		hl.scoreSort(scores);
	
	}
	public void scoreSort(int[]scores){
		Arrays.sort(scores);
		int num = 0;
		for(int i=scores.length-1;i>=0;i--){
			if(scores[i]<0 || scores[i]>100){
				continue;
			}
			num++;
			if(num>3){
				break;
			}
			System.out.println(scores[i]);
		}
		
	}
}
