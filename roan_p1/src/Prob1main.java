import java.util.Scanner;
public class Prob1main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scnr = new Scanner(System.in);
        SecureRandom secureRand = new SecureRandom();
        int random1 = 0, random2 = 0, counter = 0, difficulty = 0, probType = 0, mixedType = 0, tryAgain = 0;
        double correct = 0, incorrect = 0, userAnswer = 0, correctAnswer = 0, total;
        String answer;

        while (tryAgain != -1) {
            if (counter == 0) {
                difficulty = secureRand.getDifficulty();
                probType = secureRand.getProblemType();
            }

            if (difficulty == 1) {
                random1 = secureRand.getRandom0101();
                random2 = secureRand.getRandom0102();
            }
            if (difficulty == 2) {
                random1 = secureRand.getRandom0201();
                random2 = secureRand.getRandom0202();
            }
            if (difficulty == 3) {
                random1 = secureRand.getRandom0301();
                random2 = secureRand.getRandom0302();
            }
            if (difficulty == 4) {
                random1 = secureRand.getRandom0401();
                random2 = secureRand.getRandom0402();
            }


            mixedType = secureRand.getMixedProblem();

            if (probType == 1) {
                correctAnswer = random1 + random2;
            }
            if (probType == 2) {
                correctAnswer = random1 * random2;
            }
            if (probType == 3) {
                correctAnswer = random1 - random2;
            }
            if (probType == 4) {
                correctAnswer = random1 / random2;
            }
            if (probType == 5) {
                if (mixedType == 1) {
                    correctAnswer = random1 + random2;
                }
                if (mixedType == 2) {
                    correctAnswer = random1 * random2;
                }
                if (mixedType == 3) {
                    correctAnswer = random1 - random2;
                }
                if (mixedType == 4) {
                    correctAnswer = random1 / random2;
                }
            }


            if (probType == 1) {
                correctAnswer = random1 + random2;
                System.out.print("What is " + random1 + " plus ");
                System.out.println(random2 + "?");
            }
            if (probType == 2) {
                correctAnswer = random1 * random2;
                System.out.print("What is " + random1 + " times ");
                System.out.println(random2 + "?");
            }
            if (probType == 3) {
                correctAnswer = random1 - random2;
                System.out.print("What is " + random1 + " minus ");
                System.out.println(random2 + "?");
            }
            if (probType == 4) {
                correctAnswer = random1 / random2;
                System.out.print("What is " + random1 + " divided by ");
                System.out.println(random2 + "?");
            }

            else if (probType == 5) {
                if (mixedType == 1) {
                    correctAnswer = random1 + random2;
                    System.out.print("What is " + random1 + " plus ");
                    System.out.println(random2 + "?");
                }
                if (mixedType == 2) {
                    correctAnswer = random1 * random2;
                    System.out.print("What is " + random1 + " times ");
                    System.out.println(random2 + "?");
                }
                if (mixedType == 3) {
                    correctAnswer = random1 - random2;
                    System.out.print("What is " + random1 + " minus ");
                    System.out.println(random2 + "?");
                }
                if (mixedType == 4) {
                    correctAnswer = random1 / random2;
                    System.out.print("What is " + random1 + " divided by ");
                    System.out.println(random2 + "?");
                }
            }

            userAnswer = scnr.nextInt();

            if (userAnswer == correctAnswer) {
                switch (secureRand.getResponseNumber()) {
                    case 1:
                        System.out.println("Very good!");
                        break;

                    case 2:
                        System.out.println("Excellent!");
                        break;

                    case 3:
                        System.out.println("Nice work!");
                        break;

                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
                correct++;
            }

            else if (userAnswer != correctAnswer) {
                switch (secureRand.getResponseNumber()) {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;

                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;

                    case 3:
                        System.out.println("Don’t give up!");
                        break;

                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
                incorrect++;

            }
            counter++;
            if (counter == 10) {

                total = (correct / 10.0) * 100.0;

                System.out.println("Correct: " + correct);
                System.out.println("Incorrect: " + incorrect);
                System.out.println("Percentage score: " + total + "%");


                if (correct >= 8) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                    System.out.println();
                    incorrect = 0;
                    correct = 0;
                }
                else {
                    System.out.println("Please ask your teacher for extra help.");
                    System.out.println();
                    incorrect = 0;
                    correct = 0;
                }
                System.out.println("Would you like to begin a new session? Type yes or no: ");
                answer = scnr.next();

                if (answer.equals("no")) {
                    tryAgain = -1;
                }

                counter = 0;
            }
        }
        scnr.close();
    }
}
