package com.leetcode.queue;

import java.util.ArrayList;
import java.util.List;

public class PredictPartyVictory {

    public static void main(String[] args) {

        String senate = "RDD";
        System.out.println(predictPartyVictory(senate));
    }

    public static String predictPartyVictory(String senate) {

        char[] allSenate = senate.toCharArray();
        int direPower = 0;
        int radiantPower = 0;

        while (true) {
            boolean isRadiantPresent = false;
            boolean isDirePresent = false;

            for (int i = 0; i < senate.length(); i++) {

                char senator = allSenate[i];

                if (senator == 'R') {
                    if (direPower > 0) {
                        direPower--;
                        allSenate[i] = '-';
                    } else {
                        isRadiantPresent = true;
                        radiantPower++;
                    }
                } else if (senator == 'D') {
                    if (radiantPower > 0) {
                        radiantPower--;
                        allSenate[i] = '-';
                    } else {
                        isDirePresent = true;
                        direPower++;
                    }
                }
            }

            if (isRadiantPresent && !isDirePresent) {
                return "Radiant";
            } else if (!isRadiantPresent && isDirePresent) {
                return "Dire";
            }
        }
    }
}