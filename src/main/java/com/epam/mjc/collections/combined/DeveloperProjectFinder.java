package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new LinkedList<>();
        int sameLength = 0;
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            Set<String> mapSet = entry.getValue();
            if (mapSet.contains(developer)) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return -(s1.length() - s2.length());
            }
        });

        return list;
    }
}
