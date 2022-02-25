import java.util.Scanner;

public class GitExercise {

void go(){
  System.out.println("It works!");
  System.out.println("Please enter your name");
  Scanner in = new Scanner(System.in);
  String name = in.nextLine();
  System.out.println("Hej " + name);
}

  public static void main(String[] args) {
    GitExercise go = new GitExercise();
    go.go();
  }
}
