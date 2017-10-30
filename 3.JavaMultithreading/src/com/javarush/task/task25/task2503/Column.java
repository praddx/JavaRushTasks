package com.javarush.task.task25.task2503;

import java.util.LinkedList;
import java.util.List;

public enum Column implements Columnable {
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }
    
    /**
     * @return полное имя колонки
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Возвращает true, если колонка видимая, иначе false
     */
    public boolean isShown() {
        return realOrder[ordinal()] != -1;
    }

    /**
     * Скрывает колонку - маркирует колонку -1 в массиве realOrder.
     * Сдвигает индексы отображаемых колонок, которые идут после скрытой
     */
    public void hide() {
        realOrder[ordinal()] = -1;
        for (int i = ordinal() + 1; i < realOrder.length; i++) {
            realOrder[i] -= 1;
        }
    }

    /**
     * Возвращает порядок константы в энуме.
     *
     * @return порядок константы в энуме
     */
    /*public int ordinal() {
        return ordinal();
    }*/

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {

        List<Column> result = new LinkedList<>();
        Column[] columns = values();
        Column[] ordered = new Column[values().length];

        for (int i = 0; i < columns.length; i++) {
            if (realOrder[i] != -1) {
                for (Column col : columns) {
                    if (col.ordinal() == i) {
                        ordered[realOrder[i]] = col;
                    }
                }

            }
        }
        for (int i = 0; i < ordered.length; i++) {
            if (ordered[i] != null) {
                result.add(ordered[i]);
            }
        }

        return result;
    }
}
