package com.roderick.main.tree_map_demo;

import java.util.TreeMap;

public class HelloTreeMap {
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Curry");
        treeMap.put(1, "Klay");
        treeMap.put(5, "Jason");
        treeMap.put(2, "Jason");
        treeMap.put(-4, "Brooks");
        treeMap.put(-15, "Anthony");
    }
}
