package searches;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {
    public static int[] functionBFS(Integer[][] G, int head, int tail) {
        int N = G.length; //узнаем размер массива
        int N1 = G[1].length;
        int[] Res = new int[1];//пустой массив из 1 элемента , если пути нет
        if ((head >= N || head < 1) || (tail > N || tail < 1)) {
            //System.out.println("Error: wrong param (head or tail)");
            Res[0] = -1;
            return Res;
        }
        if (N != N1) {
            //System.out.println("Error: wrong graph");
            Res[0] = -2;
            return Res;
        }
        Deque<Integer> q = new ArrayDeque<>();//очередь для хранения номеров вершин
        Deque<Integer> Way = new ArrayDeque<>();//очередь для ответа
        Boolean[] visited = new Boolean[N];
        Boolean[] inQueue = new Boolean[N];
        int curr;
        for (int i = 0; i < N; i++) {
            visited[i] = false;
            inQueue[i] = false;
        }
        head--;
        tail--;
        q.add(head);
        visited[head] = true;
        inQueue[head] = true;
        while (!q.isEmpty()) {
            curr = q.pop();
            Way.addLast(curr + 1);
            visited[curr] = true;

            if (curr == tail) {
                int[] trueResult = new int[Way.size()];
                int flag = Way.size();
                for (int k = 0; k < flag; k++) {

                    trueResult[k] = Way.pop();
                    // System.out.print(trueResult[k]);
                    //System.out.print(' ');

                }
                return trueResult;
            } else {
                for (int i = 0; i < N; i++) {
                    if (!visited[i] && !inQueue[i] && G[curr][i] == 1) {
                        q.addLast(i);
                        inQueue[i] = true;
                    }
                }
            }
        }
        //System.out.println("There is no way");
        return Res;
    }
}
