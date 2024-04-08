package com.leetcode.stack;

import java.util.ArrayList;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {

        int [] sample = { 8, -8 };
        System.out.println(asteroidCollision(sample));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();

        if (asteroids == null || asteroids.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < asteroids.length; i++) {

            int currentAstro = asteroids[i];

            if (currentAstro > 0) {
                stack.push(currentAstro);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int prevAstro = stack.peek();
                    int collide = prevAstro + currentAstro;

                    if (collide > 0) {
                        break;
                    } else if (collide == 0) {
                        break;
                    } else {
                        stack.pop();
                    }
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(currentAstro);
                } else if (stack.peek() + currentAstro == 0) {
                    stack.pop();
                }
            }
        }

        int j = stack.size() - 1;
        int[] res = new int[stack.size()];

        while (!stack.isEmpty()) {
            res[j--] = stack.pop();
        }
        return res;
    }
}
