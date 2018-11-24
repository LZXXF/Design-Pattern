package com.cl.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * fly weight factory
 * @author Can Li
 */

public class ChessFlyWeightFactory {
    private static Map<String, ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight cfw = new ConcereteChess(color);
            map.put(color, cfw);
            return cfw;
        }
    }
}
