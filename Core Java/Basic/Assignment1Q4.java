import java.util.Scanner;

class ResultDeclaration{

    public static String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        String results = "Failed";
        if((subject1Marks>60) || (subject2Marks>60) || (subject3Marks>60)){
            results = ("Failed");
        }
        else if(((subject1Marks+subject2Marks)>60) || ((subject2Marks+subject3Marks)>60 )|| ((subject3Marks+subject1Marks)>60)){
            results=("Passed"+" "+"Promoted");
        }
        else if((subject1Marks+subject2Marks+subject3Marks)>60){
            results= ("Passed");
        }

        return results;
    }

}

public class  Assignment1Q4{
    public static void main(String[] args) {
        Scanner s4= new Scanner(System.in);
        System.out.print("Please enter Subject1 marks - ");
        double subject1marks = s4.nextDouble();
        System.out.print("Please enter Subject2 marks - ");
        double subject2marks = s4.nextDouble();
        System.out.print("Please enter Subject3 marks - ");
        double subject3marks = s4.nextDouble();
        System.out.print(ResultDeclaration.declareResults(subject1marks,subject2marks,subject3marks));
    }
}
