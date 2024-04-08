package com.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class CourseSchedule {

    public static void main(String[] args) {
        int numCourses = 3;
        int [] [] preReq = { {1,0}, {1,2}, {0,1} };

        System.out.println(canFinish(numCourses, preReq));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        int [] courses = new int[numCourses];
        Arrays.fill(courses, -1);

        for(int i=0; i< prerequisites.length; i++) {

            int course = prerequisites[i][0];
            int preReq = prerequisites[i][1];
            courses[course] = preReq;
        }

        for (int l=0; l<courses.length; l++) {
            int preReq = courses[l];
            if (preReq == -1) {
                continue;
            }

            HashMap<Integer, Integer> visited = new HashMap<>();
            int currentCourse = l;
            int currPrereq = preReq;

            while (currPrereq != -1 && !visited.containsKey(currentCourse)) {
                visited.put(currentCourse, 1);
                currentCourse = currPrereq;
                currPrereq = courses[currentCourse];
            }

            if (visited.containsKey(currentCourse)) {
                return false;
            }
        }

        return true;

    }
}
