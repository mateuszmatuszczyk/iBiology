/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibiology;

import java.io.Serializable;

/**
 * 9
 *
 * @author x14474028
 */
public class CrosswordClass implements Serializable {

    private String finalAns1, finalAns2, finalAns3, finalAns4, finalAns5, finalAns6, finalAns7, finalAns8, finalAns9, finalAns10,finalAns11, player;
    private int score;

    public CrosswordClass() {

        finalAns1 = new String();
        finalAns2 = new String();
        finalAns3 = new String();
        finalAns4 = new String();
        finalAns5 = new String();
        finalAns6 = new String();
        finalAns7 = new String();
        finalAns8 = new String();
        finalAns9 = new String();
        finalAns10 = new String();
        player = new String();
        score = 0;

    }

    

    public String getFinalAns11() {
        return finalAns11;
    }

    public void setFinalAns11(String finalAns11) {
        this.finalAns11 = finalAns11;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getFinalAns1() {
        return finalAns1;
    }

    public void setFinalAns1(String finalAns1) {
        this.finalAns1 = finalAns1;
    }

    public String getFinalAns2() {
        return finalAns2;
    }

    public void setFinalAns2(String finalAns2) {
        this.finalAns2 = finalAns2;
    }

    public String getFinalAns3() {
        return finalAns3;
    }

    public void setFinalAns3(String finalAns3) {
        this.finalAns3 = finalAns3;
    }

    public String getFinalAns4() {
        return finalAns4;
    }

    public void setFinalAns4(String finalAns4) {
        this.finalAns4 = finalAns4;
    }

    public String getFinalAns5() {
        return finalAns5;
    }

    public void setFinalAns5(String finalAns5) {
        this.finalAns5 = finalAns5;
    }

    public String getFinalAns6() {
        return finalAns6;
    }

    public void setFinalAns6(String finalAns6) {
        this.finalAns6 = finalAns6;
    }

    public String getFinalAns7() {
        return finalAns7;
    }

    public void setFinalAns7(String finalAns7) {
        this.finalAns7 = finalAns7;
    }

    public String getFinalAns8() {
        return finalAns8;
    }

    public void setFinalAns8(String finalAns8) {
        this.finalAns8 = finalAns8;
    }

    public String getFinalAns9() {
        return finalAns9;
    }

    public void setFinalAns9(String finalAns9) {
        this.finalAns9 = finalAns9;
    }

    public String getFinalAns10() {
        return finalAns10;
    }

    public void setFinalAns10(String finalAns10) {
        this.finalAns10 = finalAns10;
    }

}
