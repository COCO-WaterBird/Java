package com.msb.test02;

public class TestIf03 {
    public static void main(String[] args) {
        //需求:判断学生成绩的等级;
        //给定学生的成绩;
        int score = 58;
        //判定:

        //单分支结构
//        if(score > 90){
//            System.out.println("该学生成绩是:A级");
//        }
//        if(score >= 80 && score <= 90){
//            System.out.println("该学生成绩是:B级");
//        }
//        if(score >= 70 && score <= 80){
//            System.out.println("该学生成绩是:C级");
//
        //多分支结构
        if (score > 90){
            System.out.println("A级");
        }else if (score >= 80) {//隐藏条件是:score <= 90
            System.out.println("B级");
        }else if (score >= 70) {//隐藏条件是:score < 80
            System.out.println("C级");
        }else if (score >= 60) {
            System.out.println("D级");
        }else{//隐藏条件score<60 --> else 最后一个分支相当于“兜底”
            System.out.println("E级");


    }
    }
}
