import java.util.Scanner;
public class AttendanceStatusEvaluator{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int Percentage=sc.nextInt();
    if(Percentage>85){
      System.out.println("Excellent");
    }
    else if(Percentage>=60 && Percentage<=85){
      System.out.println("Satisfactory");
    }
    else if(Percentage<60){
      System.out.println("Poor");
    }
    else{
      System.out.println("Enter positive value");
    }
  }
}

