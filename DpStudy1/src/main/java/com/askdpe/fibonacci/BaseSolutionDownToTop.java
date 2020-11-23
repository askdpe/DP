package com.askdpe.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PE
 * @date 2020/11/13 16:21
 */
public class BaseSolutionDownToTop {
    /**
     * 斐波那契的迭代解法,自底向上求解 方法1
     * @param n 第n个斐波那契数
     * @return 第n个斐波那契数
     */
    public static long getNum(int n) {
        long prev = 1;
        long next = 1;

        long num = 0;
        for (int i = 2; i <= n; i++) {
            num = prev + next;
            prev = next;
            next = num;
        }
        return num;
    }

    /**
     * 斐波那契的迭代解法,自底向上求解 方法2
     * @param n 第n个斐波那契数
     * @return 第n个斐波那契数
     */
    public static long getNum2(int n){
        List<Long> note = new ArrayList<>(n+1);
        //0的时候
        note.add(1L);
        //1的时候
        note.add(1L);
        for (int i = 2; i <= n; i++) {
            note.add(note.get(i-2)+note.get(i-1));
        }
        return note.get(n);
    }

    public static void main(String[] args) {
        System.out.println(getNum(50));
        System.out.println(getNum2(50));
    }
}
