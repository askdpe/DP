package com.askdpe.fibonacci;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author PE
 * @date 2020/11/12 19:11
 * 使用带有备忘录的递归算法求解
 * 减少重复计算
 */
public class BaseSolutionWithNote {

    private static final Map<Integer, Long> note = new HashMap<>();

    /**
     * 使用备忘录模式来利用重复计算结果
     * @param n 第n个斐波那契数
     * @return 第n个斐波那契数
     */
    public static long getNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        Long num = note.get(n);

        if (num == null) {
            synchronized (note) {
                num = note.get(n);
                if (num == null) {
                    num = getNum(n - 1) + getNum(n - 2);
                    note.put(n, num);
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        long num = getNum(40);
        System.out.println(num);
    }
}
