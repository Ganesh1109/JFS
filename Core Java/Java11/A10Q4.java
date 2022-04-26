import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class A10Q4 {

	public static void main(String[] args) throws IOException {
		var path = "G:\\StudentList.txt";
		
        String data = Files.readString(Path.of(path));

		
		System.out.println(data);
		int cnt=1;
        
       
		int ln= data .length();
        for(int i=0;i<ln;i++)
        {
          if(data.charAt(i)==' ')
          {
            cnt++;
          }
        }
		System.out.println(cnt);
	}

}