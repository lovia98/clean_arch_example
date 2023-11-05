package com.example.clean_architecture.algorithm.programers.stackqueue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은
 * 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 *
 * 제한사항
 * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
 * prices의 길이는 2 이상 100,000 이하입니다.
 */
public class Stock {

    @Test
    public void test() {
        assertArrayEquals(new int[] {4, 3, 1, 1, 0}, solution(new int[] { 1, 2, 3, 2, 3 }));
    }

    @Test
    public void express() {
        test();

        assertArrayEquals(new int[] {1, 0}, solution(new int[] { 1, 2 }));
        assertArrayEquals(new int[] {0, 0, 0}, solution(new int[] { 4, 3, 4, 3, 1 }));
    }

    public int[] solution(int[] prices) {

        Queue<Integer> pq = new LinkedList<>();
        for (int i = 0; i < prices.length; i++) {
            pq.add(i);
        }

        int[] answer = new int[prices.length];

        while (!pq.isEmpty()) {

            int idx = pq.poll();

            int times = 0;
            for (int i = idx + 1; i < prices.length; i++) {
                if (prices[idx] <= prices[i]) {
                    times++;
                } else {
                    times++;
                    break;
                }
            }

            answer[idx] = times;

        }

        return answer;
    }
}
