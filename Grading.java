 import java.util.*;
 class Grading {
    public static void main(String[] args){
        int sum=0;
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Subjects");
        int noofSubjects=sc.nextInt();
        int marks[]=new int[noofSubjects];
        System.out.println("Enter the marks of "+noofSubjects+" Subjects.Press Enter to give marks for another subject");

        for(int i=0;i<noofSubjects;i++){
            marks[i]=sc.nextInt();

        }
        for(int j=0;j<noofSubjects;j++){
            sum=sum+marks[j];
        }
        int percentage=sum/noofSubjects;
        System.out.println(percentage);
        if (percentage>=95){
            result="You Scored O grade.Great work";
        }
        else if(percentage>90 && percentage<95){
            result="You scored A+.Well done!";

        }
        else {
            result="You Passed";
        }
       System.out.println(result);
    }
}
