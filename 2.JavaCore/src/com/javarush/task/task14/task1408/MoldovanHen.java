package com.javarush.task.task14.task1408;

/**
 * Created by Pradd on 05.09.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 32;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
