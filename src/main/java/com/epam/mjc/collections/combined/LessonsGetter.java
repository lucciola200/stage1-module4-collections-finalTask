package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new LinkedHashSet<>();
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            List<String> entryList = entry.getValue();
            set.addAll(entryList);
        }
        return set;
    }
}
