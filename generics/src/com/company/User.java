package com.company;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;

//        if (points < o.points)
//            return -1;
//
//        if (points == o.points)
//            return 0;
//
//        return -1;
    }
}
