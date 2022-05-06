/*Create interfaces Student and Sports. Create
a class Result implements Student and Sports.
Display the academic and sports score of a
student.*/
import java.util.*;


 interface Student{
    int Score=10;
    void displayScore();


}


 interface Sports{
   int Score=25;
   void displaySportsScore();
}


     class Result implements Sports,Student{
     public void displayScore(){

       System.out.println("ACADAMIC SCORE= "+Student.Score);

}
          public void displaySportsScore(){
         System.out.println("SPORTS SCORE= "+Sports.Score);


}
}

    class SportsStudent{

      public static void main(String args[]){
		Result r=new Result();
		r.displayScore();
		r.displaySportsScore();
	}



}
/*
OUTPUT
ACADAMIC SCORE= 10
SPORTS SCORE= 25
*/
