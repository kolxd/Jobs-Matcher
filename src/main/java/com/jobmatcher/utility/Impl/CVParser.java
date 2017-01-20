package com.jobmatcher.utility.Impl;

import com.jobmatcher.utility.Parser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gevlad on 16-Jan-17.
 */

public class CVParser {

    public static List<String> parseFile(String fileName) {

        String st = Parser.parse(fileName);
        String[] wordsInCV = st.split("[^a-zA-Z']+");

        int stop = 0;
        for (int i=0; i < wordsInCV.length -1; i++){
            if ((wordsInCV[i].contains("personal") && wordsInCV[i+1].contains("skills")) ||
                    (wordsInCV[i].contains("PERSONAL") && wordsInCV[i+1].contains("SKILLS"))) {
                stop = i+2;
                break;
            }
        }

        List<String> keyWords = new ArrayList<>();
        for (int i=stop, j=0; i < wordsInCV.length -1; i++, j++){
            if ((wordsInCV[i].contains("ADDITIONAL") && wordsInCV[i+1].contains("INFORMATION")) || j == 7) {
                stop = i+2;
                break;
            }
            keyWords.add(wordsInCV[i]);

        }
        System.out.println(wordsInCV[stop]);

        return keyWords;
    }
}
