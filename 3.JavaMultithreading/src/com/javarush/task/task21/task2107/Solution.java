package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    public Solution clone() throws CloneNotSupportedException {
        Solution solution = null;

            solution = (Solution) super.clone();

            //Map
            solution.users = new LinkedHashMap<>();
            for (Map.Entry<String, User> elem : users.entrySet()) {
                solution.users.put(elem.getKey(), (User) elem.getValue().clone());
            }


        return solution;
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }

            User user = (User) o;

            return ((age == user.age) && (name == user.name || (name != null && name.equals(user.name))));
        }

        @Override
        public int hashCode() {
            final int PRIME = 31;
            int result = 1;
            result = PRIME * result + age;
            result = PRIME * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        public User clone() {
            User user = null;
            try {
                user = (User) super.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Клонирование user не удалось!");
            }
            return user;
        }
    }
}
