package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            //입력할 숫자
            int N = sc.nextInt();   //입력
                sc.close();

            int cnt = 0;    //몇번 반복되는지
            int copy = N;   //변수 복사

            while (true) {
                //T = (N % 10) * 10                 : T의 십의 자릿수
                //T = ((N / 10) + (N % 10)) % 10    : T의 일의 자릿수
                //위 둘을 더하면 새로운 수
                N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
                cnt++;

                if (copy == N) {
                    break;
                }

            }

            //몇 번 반복됐는지 출력
            System.out.println(cnt);

        }

}
