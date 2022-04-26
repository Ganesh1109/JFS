package collections;
import java.util.*;

public class A6Q4 {
    int date,month,year;
    
    public A6Q4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<A6Q4> dob = new LinkedList<>();
        

        dob.add(new A6Q4(26,11,2000));
        dob.add(new A6Q4(15,9,2001));
        dob.add(new A6Q4(28,8,2050));
        dob.add(new A6Q4(11,9,2022));
        dob.add(new A6Q4(28,4,1972));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println("Your Data of Birth is "+dob.get(i)+" and it was a Leap Year ");
            }else{
                System.out.println("Your Date of Birth is "+dob.get(i)+" and it was not a Leap Year");
            }
            
        }
    }
    
}