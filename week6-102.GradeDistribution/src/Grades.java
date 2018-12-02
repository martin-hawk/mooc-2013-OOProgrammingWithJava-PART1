

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Grades {

    private int[] gradeList;

    public Grades() {
        this.gradeList = new int[6];
    }

    public void countGrades(int score) {
        if (score > 0 && score < 30) {
            this.gradeList[0]++;
        } else if (score >= 30 && score < 35) {
            this.gradeList[1]++;
        } else if (score >= 35 && score < 40) {
            this.gradeList[2]++;
        } else if (score >= 40 && score < 45) {
            this.gradeList[3]++;
        } else if (score >= 45 && score < 50) {
            this.gradeList[4]++;
        } else if (score >= 50 && score <= 60) {
            this.gradeList[5]++;
        }
    }

    public String calculateAcceptance() {
        int accepted = 0;
        int allScores = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                allScores += this.gradeList[i];
            } else {
                accepted += this.gradeList[i];
                allScores += this.gradeList[i];
            }

        }
        return String.format("%.1f", 100 * (double) accepted / (double) allScores);
    }

    public void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    public void printGrades() {
        System.out.println("Grade distribution:");
        //print grade line
        for (int i = 5; i > -1; i--) {
            System.out.print(i + ": ");
            printStars(this.gradeList[i]);
            System.out.println("");
        }
        System.out.println("Acceptance percentage: " + this.calculateAcceptance());
    }
}
