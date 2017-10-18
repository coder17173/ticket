package com.nust.ticket.test;

import java.util.*;

/**
 * @author zhanghang
 * @description
 * @date 2017/10/18 18:59
 * @modified by
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
            for (int i = 0; i < num; i++) {
                int str = scanner.nextInt();
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
            Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue() - o1.getValue();
                }
            };
            Collections.sort(list, comparator);
            int result = list.get(0).getKey();
            System.out.println(result);

            System.out.println("666666666");
        }
    }


}
