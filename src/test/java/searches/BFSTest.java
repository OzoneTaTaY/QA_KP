package searches;

import org.junit.Assert;
import org.junit.Test;


public class BFSTest {
    //Черный ящик
    @Test
    public void BFSTest1() {
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
        int [] bfsResult = BFS.functionBFS(Graf, Inception, Dovod);
        int [] result = new int [4];
        result[0]=2;
        result[1]=1;
        result[2]=4;
        result[3]=3;

        Assert.assertArrayEquals(result, bfsResult);
    }
    @Test
    public void BFSTest2(){
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
        int [] bfsResult = BFS.functionBFS(Graf, Inception, Dovod);
        int [] result = new int [6];
        result[0]=1;
        result[1]=2;
        result[2]=3;
        result[3]=4;
        result[4]=5;
        result[5]=6;

        Assert.assertArrayEquals(result, bfsResult);
    }
    @Test
    public void BFSTest3(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 1},//1
                {1, 0, 0},//2
                {1, 0, 0}//3

        };
        Integer Inception = 1;
        Integer Dovod = 2;
        int [] bfsResult = BFS.functionBFS(Graf, Inception, Dovod);
        int [] result = new int [2];
        result[0]=1;
        result[1]=2;

        Assert.assertArrayEquals(result, bfsResult);
    }
    @Test
    public void BFSTest4(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 0},//1
                {1, 0, 0},//2
                {0, 0, 0}//3

        };
        Integer Inception = 1;
        Integer Dovod = 3;
        int [] bfsResult = BFS.functionBFS(Graf, Inception, Dovod);
        int [] result = new int [1];

        Assert.assertArrayEquals(result, bfsResult);
    }
    //Белый ящик
    @Test
    public void BFSTest5(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 0},//1
                {1, 0, 0},//2
                {0, 0, 0}//3

        };
        Integer Inception = 1;
        Integer Dovod = 4;
        int [] bfsResult = BFS.functionBFS(Graf, Inception, Dovod);
        int [] result = new int [1];
        result[0]=-1;
        Assert.assertArrayEquals(result,bfsResult);
    }
    @Test
    public void BFSTest6(){
        Integer [][] Graf  = {
                // 1  2  3
                {0, 1, 0},//1
                {1, 0, 0},//2
                {0, 0, 0},//3
                {0, 0, 0}//4

        };
        Integer Inception = 1;
        Integer Dovod = 3;
        int [] bfsResult = BFS.functionBFS(Graf, Inception, Dovod);
        int [] result = new int [1];
        result[0]=-2;
        Assert.assertArrayEquals(result,bfsResult);
    }
}