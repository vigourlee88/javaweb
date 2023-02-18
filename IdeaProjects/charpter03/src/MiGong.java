public class MiGong {
    public static void main(String[] args) {
      /*
      递归调用应用实例-迷宫问题
      1.小球得到的路径，和程序员设置的找路策略有关即:找路的上下文左右的顺序相关
      2.再得到小球路径时，可以先试用(下右上左)，
      再改成(上右下左),看看路径是不是有变化
      3.测试回溯现象
      4.扩展思考,如何求出最短路径
      思路
      1.先创建迷宫，用二维数组表示int [][] map = new int[8][7];
      2.先规定map 数组的元素值: 0表示可以走  1表示障碍物

       */
        int [][] map = new int[8][7];
        //3.将最上面的一行和最下面的一行，全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;//最上面的一行
            map[7][i] = 1;//最下面的一行
        }
        //4.将最右面的一列和最左面的一列，全部设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;//行是变化的第1列
            map[i][6] = 1;//第7列
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //map[2][1] = 1;
        //map[2][2] = 1;
        //map[1][2] = 1;
        //设置回溯
        map[2][2] = 1;
        //输出当前的地图
        System.out.println("=====当前地图情况=====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");//输出一行
            }
            System.out.println();//换行
        }
        //使用findWay来给老鼠找路
        M m1 = new M();
//        m1.findWay(map,1,1);//引用传递，对于数组的修改影响到map
//
//        System.out.println("\n====找路的情况如下====");
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + "\t");//输出一行
//            }
//            System.out.println();//换行
//        }

        m1.findWay(map,1, 1);//引用传递，对于数组的修改影响到map

        System.out.println("\n====修改路径后找路的情况如下====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");//输出一行
            }
            System.out.println();//换行
        }
    }
}
class M {
    //使用递归回溯的思想来解决老鼠出迷宫
    //1.findWay方法就是专门来找出迷宫的路径
    //2.如果找到，就返回true 否则返回false
    //3.map就是二维数组，即表示迷宫
    //4.i行,j列 就是老鼠的位置，初始化的位置为(1,1)
    //5.因为我们递归的找路，所以我先规定 map数组的各个值的含义
    //0表示可以走  1表示障碍物  2表示可以走通  3表示走过，但是走不通即死路
    //6.当 map [6][5] = 2;就说明找到通路，就可以结束，否则就继续找
    //7.先确定老鼠找路的策略  下->右->上->左
    //8.
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {//说明已经找到路
            return true;
        } else {
                if (map[i][j] == 0) {//当前这个位置，可以走，还没有走过
                    //我们假定可以走通
                    map[i][j] = 2;
                    //使用找路策略，来确定该位置是否真的可以走通
                    //下->右->上->左
                    if (findWay(map, i + 1, j)) {//先尝试 下
                        return true;//找到返回true
                    } else if (findWay(map, i, j + 1)) {//右
                        return true;
                    } else if (findWay(map, i - 1, j)) {//上
                        return true;
                    } else if (findWay(map, i, j - 1)) {//左
                        return true;
                    } else {//假定走得通错误，
                        map[i][j] = 3;
                        return false;//没有找到false
                    }

                } else {//map[i][j] = 1,2,3
                    return false;//不要走了，已测试过

            }
        }
    }

    //修改找路策略，看看路径是否有变化
    //下->右->上->左 ==>  上->右->下->左
    public boolean findWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) {//说明已经找到路
            return true;
        } else {
            if (map[i][j] == 0) {//当前这个位置，可以走，还没有走过
                //我们假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //上->右->下->左
                if (findWay2(map, i - 1, j)) {//先尝试 上 行数-1
                    return true;
                } else if (findWay2(map, i, j + 1)) {//右
                    return true;
                } else if (findWay2(map, i + 1, j)) {//下
                    return true;
                } else if (findWay2(map, i, j - 1)) {//左
                    return true;
                } else {//假定走得通错误，
                    map[i][j] = 3;
                    return false;
                }

            } else {//map[i][j] = 1,2,3
                return false;//不要走了，已测试过

            }

        }
    }

}
