package com.javarush.task.task14.task1408;

/**
 * Created by Pradd on 05.09.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 88;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
