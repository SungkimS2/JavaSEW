package section15;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
 *   ★Date 클래스
 *	 현재 날짜와 시간을 가진 Date 객체
 * 	 날자 관련 객체
 * 
 */
import java.util.Date;

public class JavaUtilClass03 {
	public static void main(String[] args) throws ParseException {
		// 날짜 객체 생성
		Date date = new Date();
		System.out.println(date);

		//	날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strDate = sdf.format(date);
		
		System.out.println("strDate : " + strDate);
		
//		문자열로 고정된 데이터를 데이트 클래스로 바꾸기
		String yesterday = "2023.06.02 16:28:00";
		
		Date yDate = sdf.parse(yesterday);
		System.out.println("yDate : " + yDate);
	}
}
