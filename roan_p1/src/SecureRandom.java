import java.util.Random;
import java.util.Scanner;
public class SecureRandom {
    private int rand01;
    private int rand02;
    private int responseNum;
    private int difficultyNum;
    private int problemType;
    private int mixedProb;



    public int getRandom0101() {
        Random rand = new Random();
        rand01 = rand.nextInt(9) + 1;
        return rand01;
    }

    public int getRandom0102() {
        Random rand = new Random();
        rand02 = rand.nextInt(9) + 1;
        return rand02;
    }

    public int getRandom0201() {
        Random rand = new Random();
        rand01 = rand.nextInt(89) + 10;
        return rand01;
    }

    public int getRandom0202() {
        Random rand = new Random();
        rand02 = rand.nextInt(89) + 10;
        return rand02;
    }

    public int getRandom0301() {
        Random rand = new Random();
        rand01 = rand.nextInt(899) + 100;
        return rand01;
    }

    public int getRandom0302() {
        Random rand = new Random();
        rand02 = rand.nextInt(899) + 100;
        return rand02;
    }

    public int getRandom0401() {
        Random rand = new Random();
        rand01 = rand.nextInt(8999) + 1000;
        return rand01;
    }

    public int getRandom0402() {
        Random rand = new Random();
        rand02 = rand.nextInt(8999) + 1000;
        return rand02;
    }

    public int getResponseNumber() {
        Random rand = new Random();
        responseNum = rand.nextInt(4) + 1;
        return responseNum;
    }

    public int getProblemType() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Choose a problem type: 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division, and 5 for a mix. ");
        problemType = scnr.nextInt();

        return problemType;
    }

    public int getMixedProblem() {
        Random rand = new Random();
        mixedProb = rand.nextInt(4) + 1;
        return mixedProb;

    }

    public int getDifficulty() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a difficulty level: ");
        difficultyNum = scnr.nextInt();
        return difficultyNum;
    }
}
