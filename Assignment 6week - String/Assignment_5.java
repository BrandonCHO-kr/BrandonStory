package string;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
    String str = sc.next();	// 문자 스캐너
    int len = str.length();	// 문자열 갯수
    int count;				// 카운트 변수 선언
    
    char[] c = new char[100];		//문자열 100자 제한

    
    for (int i = 0; i < len; i++) {		// 범위 설정
        c[i] = str.charAt(i);			// 문자열을 각 문자로 가져올 수 있게 사용
    }

    for (int i = 0; i < len; i++) {		
        count = len - 1 - i;			// INDEX는 0부터 시작하기 때문에 첫 시작 7번째 값을 맞추기 위해 - 1 을 함 (인덱스는 6) 
        
        for (int j = 0; j < len; j++) {
            if (count == len) {
                count = 0;
            }
            System.out.print(c[count]);
            count++;
        }
        System.out.println();
    }
}
}