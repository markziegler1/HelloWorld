import java.util.Scanner;

public class GitExercise {

  int age;
  Scanner in = new Scanner(System.in);
void go(){
  System.out.println("It works!");
  System.out.println("Please enter your name");
  Scanner in = new Scanner(System.in);
  String name = in.nextLine();
  System.out.println("Hej " + name);
}

/*void askAboutAge(){
  System.out.println("Please enter your age");
  int age = in.nextInt();
  System.out.println("Din alder er "+ age);
}

 */

  void stupidMethod(){
    System.out.println("This is stupid");
  }

  public static void main(String[] args) {
    GitExercise go = new GitExercise();
    go.go();
    //GitExercise askAboutAge = new GitExercise();
    //askAboutAge.askAboutAge();
    GitExercise stupidMethod = new GitExercise();
    stupidMethod.stupidMethod();

  }
}
