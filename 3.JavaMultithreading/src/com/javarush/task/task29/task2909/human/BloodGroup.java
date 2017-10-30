package com.javarush.task.task29.task2909.human;

/**
 * Created by Pradd on 18.10.2017.
 */
public class BloodGroup {


        private final int code;

        private BloodGroup(int bloodGroup) {
            code = bloodGroup;
        }

        public int getCode() {
            return code;
        }

        public static BloodGroup first() {
            return new BloodGroup(1);
        }

        public static BloodGroup second() {
            return new BloodGroup(2);
        }

        public static BloodGroup third() {
            return new BloodGroup(3);
        }

        public static BloodGroup fourth() {
            return new BloodGroup(4);
        }

}
