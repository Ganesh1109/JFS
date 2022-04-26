import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int authorID();
	String date() ;
	String time();
	float version();
}

@info(authorID = 15, date = "20-12-2020", time = "2.39", version = 1)
class mall
{
	int authorID;
	String date;
	String time;
	float version;
	public mall(int authorID, String date, String time, float version)
	{
		this.authorID = authorID;
		this.date = date;
		this.time = time;
		this.version = version;
	}
}

public class A7Q2 {
	public static void main(String[] args) {
		mall a = new mall(20,"21-02-2022","2.30",2);
		System.out.println("Author ID : " + a.authorID);
		System.out.println("Date : " + a.date);
		System.out.println("Time : " + a.time);
		System.out.println("Version : " + a.version);
		/*Class c = a.getClass();
        java.lang.annotation.Annotation d = c.getAnnotation(info.class);
        info i = (info)d;
        System.out.println(i);*/

	}

}
