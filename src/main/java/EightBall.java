import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public int getAnswerAtIndex(int answer){
        answer = this.answers.indexOf(answer);
        return answer;
    }

    public ArrayList<String> getAnswers(){
        ArrayList<String> copyOfAnswers = new ArrayList<>(this.answers);
        return copyOfAnswers;
    }

    public int getRandomAnswer(){
        Collections.shuffle(this.answers);
        return getAnswerAtIndex(0);
    }

//    public ArrayList<Integer> getUserInput(){
//
//        System.out.println("Enter new answer:");
//        Scanner inputAnswer = new Scanner(System.in);
//        Integer userAnswer = inputAnswer.nextInt();
//        answers.add(userAnswer);
//    }
}
