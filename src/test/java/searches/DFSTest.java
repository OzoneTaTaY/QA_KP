package searches;

import searches.DFS;
import org.junit.Assert;
import org.junit.Test;


public class DFSTest {
    //Черный ящик
    @Test
    public void DFSTest1() {
        Integer [][] Graf  = {
                //  1  2  3  4  5  6
                {0, 1, 1, 0, 0, 0},//1
                {1, 0, 0, 1, 0, 0},//2
                {1, 0, 0, 0, 1, 0},//3
                {0, 1, 0, 0, 1, 1},//4
                {0, 0, 1, 1, 0, 0},//5
                {0, 0, 0, 1, 0, 0},//6
        };
        Integer Inception = 2;
        Integer Dovod = 3;
        DFS d = new DFS(Graf, Inception, Dovod);
        int [] dfsResult = d.startDFS();
        int [] result = new int [3];
        result[0]=2;
        result[1]=1;
        result[2]=3;

        Assert.assertArrayEquals(result, dfsResult);
    }
    @Test
    public void DFSTest2(){
        Integer [][] Graf  = {
                // 1  2  3  4  5  6
                {0, 1, 1, 0, 0, 0},//1
                {1, 0, 0, 1, 0, 0},//2
                {1, 0, 0, 0, 1, 0},//3
                {0, 1, 0, 0, 1, 1},//4
                {0, 0, 1, 1, 0, 0},//5
                {0, 0, 0, 1, 0, 0},//6
        };
        Integer Inception = 1;
        Integer Dovod = 6;
        DFS d = new DFS(Graf, Inception, Dovod);
        int [] dfsResult = d.startDFS();
        int [] result = new int [6];
        result[0]=1;
        result[1]=2;
        result[2]=4;
        result[3]=5;
        result[4]=3;
        result[5]=6;
        Assert.assertArrayEquals(result, dfsResult);
    }
    @Test
    public void DFSTest3(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 1},//1
                {1, 0, 0},//2
                {1, 0, 0}//3

        };
        Integer Inception = 1;
        Integer Dovod = 2;
        DFS d = new DFS(Graf, Inception, Dovod);
        int [] dfsResult = d.startDFS();
        int [] result = new int [2];
        result[0]=1;
        result[1]=2;

        Assert.assertArrayEquals(result, dfsResult);
    }
    @Test
    public void DFSTest4(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 0},//1
                {1, 0, 0},//2
                {0, 0, 0}//3

        };
        Integer Inception = 1;
        Integer Dovod = 3;
        DFS d = new DFS(Graf, Inception, Dovod);
        int [] dfsResult = d.startDFS();
        int [] result = new int [1];

        Assert.assertArrayEquals(result, dfsResult);
    }
    //Белый ящик
    @Test
    public void DFSTest5(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 0},//1
                {1, 0, 0},//2
                {0, 0, 0}//3

        };
        Integer Inception = 1;
        Integer Dovod = 4;
        DFS d = new DFS(Graf, Inception, Dovod);
        int [] dfsResult = d.startDFS();
        int [] result = new int [1];
        result[0]=-1;
        Assert.assertArrayEquals(result,dfsResult);
    }
    @Test
    public void DFSTest6(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 0},//1
                {1, 0, 0},//2
                {0, 0, 0},//3
                {0, 0, 0}//4

        };
        Integer Inception = 1;
        Integer Dovod = 3;
        DFS d = new DFS(Graf, Inception, Dovod);
        int [] dfsResult = d.startDFS();
        int [] result = new int [1];
        result[0]=-2;
        Assert.assertArrayEquals(result,dfsResult);
    }
}