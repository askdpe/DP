package com.askdpe.fibonacci;

/**
 * @author PE
 * @date 2020/11/12 19:03
 * 斐波那契数列的基础实现
 * 使用递归的方式
 */
public class BaseSolution {

    public long getNum(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return getNum(n-1)+getNum(n-2);
    }

    public static void main(String[] args) {
        BaseSolution baseSolution = new BaseSolution();
        Long num = baseSolution.getNum(10);
        System.out.println(num);
    }
}
