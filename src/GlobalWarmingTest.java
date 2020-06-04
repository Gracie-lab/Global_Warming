import java.util.Scanner;
public class GlobalWarmingTest {
    public static void main(String... args){
        GlobalWarming globalwarming = new GlobalWarming();
        Scanner input = new Scanner(System.in);
        globalwarming.question1();
        System.out.print("Answer: ");
        String answer = input.next();
        globalwarming.setAnswer(answer);
        int score = 0;
        if (answer.equals("A") || answer.equals("a")){
             score += 1;
        }
        globalwarming.question2();
        System.out.print("Answer: ");
        String answer1 = input.next();
        if (answer1.equals("B") || answer1.equals("b")){
            score += 1;
        }
        globalwarming.question3();
        System.out.print("Answer: ");
        String answer2 = input.next();
        if (answer2.equals("D") || answer2.equals("d")){
            score += 1;
        }
        globalwarming.question4();
        System.out.print("Answer: ");
        String answer3 = input.next();
        if (answer3.equals("A") || answer3.equals("a")){
            score += 1;
        }
        globalwarming.question5();
        System.out.print("Answer: ");
        String answer4 = input.next();
        if (answer4.equals("B") || answer4.equals("b")){
            score += 1;
        }
        System.out.printf("Hi, your scored %d out of 5%n", score);
        if (score == 5){
            System.out.println("Excellent");
        }
        if (score == 4){
            System.out.println("Very good");
        }
        if (score <= 3) {
            System.out.println("Time to brush up on your knowledge of global warming");
        }


    }
}
