package string;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        char[] arr = new char[100];			//문자열 길이 제한
        String str = sc.next();				//스캐너 1
        int len = str.length();				//스캐너 1에 대한 문자열 길이
        int num = sc.nextInt();				//스캐너 2
 
        for (int i = 0; i < len; i++) {		// 0에서 스캐너 1의 문자 길이까지 범위 설정
            arr[i] = str.charAt(i);			
        }
        if (num > len) {					// 스캐너2 값이 스캐너1의 문자열 개수보다 크면 모두 출력해라
            num = len;
        }
        for (int i = len - 1; i >= len - num; i--) {	//index는 0부터 시작하므로 범위를 맞추기 위해 -1 을 함
            System.out.print(arr[i]);
        }
    }
}