package searches;

import java.util.ArrayDeque;
import java.util.Deque;

public class DFS {
    int N; // количество вершин
    Integer [][] graph; // матрица смежности
    boolean[] used;
    Integer head;
    Integer tail;
    Deque<Integer> Way = new ArrayDeque<>(); //путь
    int[] Res = new int[1];
    boolean flag = true;

    public DFS(Integer [][] G, Integer h, Integer t){
        this.graph = G;
        this.head = h;
        this.tail = t;
        this.N = G.length; //узнаем размер массива
        int N1 = G[1].length;
        if ((head >= N || head < 1) || (tail > N || tail < 1)) {
            //  System.out.println("Error: wrong param (head or tail)");
            Res[0] = -1;
        }
        if (N != N1) {
            //  System.out.println("Error: wrong graph");
            Res[0] = -2;
        }
    }

    public int [] startDFS(){
        used = new boolean[N];
        if (Res[0] >= 0) {
            justDFS(head-1);
            if (!flag) {
                int[] trueResult = new int[Way.size()];
                int flag = Way.size();
                for (int k = 0; k < flag; k++) {
                    trueResult[k] = Way.pop();
                    //  System.out.print(trueResult[k]);
                    //  System.out.print(' ');
                }
                return trueResult;
            }
            // System.out.println("There is no way");
            return Res;
        }
        else
            return Res;
    }

    void justDFS(int v) {
        if (flag) {
            used[v] = true; // помечаем вершину
            Way.addLast(v + 1);
            if (v == tail-1) {
                flag = false;
            } else {
                for (int nv = 0; nv < N; nv++) { // перебираем вершины
                    if (!used[nv] && graph[v][nv] == 1) { // если вершина не помечена, и смежна с текущей
                        justDFS(nv); // рекурсивно запускаем от нее com.kani.DFS
                    }
                }
            }
        }
    }
}
