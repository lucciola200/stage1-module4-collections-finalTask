package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String key = entry.getKey();
            Set<String> mapSet = new HashSet<>();
            if (map.get(key.length()) != null) {
                mapSet = map.get(key.length());
            }
            mapSet.add(key);
            map.put(key.length(), mapSet);
        }
        return map;
    }
}
