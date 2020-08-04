package com.example.task2_tabs;

public class ModelItemGame {
    String gameOfTheDay,gameFirstText,gameSecondText,gameBtn;
    int ivMain;
    int ivIcon;

    public ModelItemGame(String gameOfTheDay, String gameFirstText, String gameSecondText, String gameBtn, int ivMain, int ivIcon) {
        this.gameOfTheDay = gameOfTheDay;
        this.gameFirstText = gameFirstText;
        this.gameSecondText = gameSecondText;
        this.gameBtn = gameBtn;
        this.ivMain = ivMain;
        this.ivIcon = ivIcon;
    }

    public String getGameOfTheDay() {
        return gameOfTheDay;
    }

    public String getGameFirstText() {
        return gameFirstText;
    }

    public String getGameSecondText() {
        return gameSecondText;
    }

    public String getGameBtn() {
        return gameBtn;
    }

    public int getIvMain() {
        return ivMain;
    }

    public int getIvIcon() {
        return ivIcon;
    }
}
