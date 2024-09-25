package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class DegreesofFriendship {

    public int friendDistance(int[][] friends, int userA, int userB) {
        // your code goes here
        if(userA == userB) return 0;

        Queue<int[]> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(new int[]{userA, 0});

        while(!queue.isEmpty()){

            int[] current = queue.poll();
            int currectUser = current[0];
            int distance = current[1];

            if(visited.contains(currectUser)) continue;

            visited.add(currectUser);

            if(friends[currectUser][userB] == 1) return distance + 1;

            for(int i = 0; i< friends[currectUser].length; i++){
                if(friends[currectUser][i] == 1 && !visited.contains(i)) queue.offer(new int[] {i, distance +1 });
            }


        }

        return -1;

    }
}
