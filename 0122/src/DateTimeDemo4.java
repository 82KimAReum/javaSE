import java.text.SimpleDateFormat;
import java.util.Date;

//5. 
public class DateTimeDemo4 {
	public static void main(String[] args) {
		String pattern = "지금은 yyyy년 MM월 dd일 HH시 mm분 ss초 입니다.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
	}
}






