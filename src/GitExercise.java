import java.util.Scanner;

public class GitExercise {

  Scanner in = new Scanner(System.in);
void go(){
  System.out.println("It works!");
  System.out.println("Please enter your name");
  String name = in.nextLine();
  System.out.println("Hej " + name);
}

void askAboutAge(){
  System.out.println("Please enter your age");
  int age = in.nextInt();
  System.out.println("Din alder er "+ age);
}

  void stupidMethod(){
    System.out.println("This is stupid");
    System.out.println("hej");
}

  public static void main(String[] args) {
    GitExercise go = new GitExercise();
    go.go();
    GitExercise askAboutAge = new GitExercise();
    askAboutAge.askAboutAge();
    GitExercise stupidMethod = new GitExercise();
    stupidMethod.stupidMethod();
  }
}
