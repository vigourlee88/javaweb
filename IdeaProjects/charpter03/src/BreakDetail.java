public class BreakDetail {
    public static void main(String[] args) {
        //跳转语句-break
//        lable1:
//        for(int j = 0;j < 4;j++){//for外循环
//            lable2:
//                for(int i = 0;i < 10;i++){//for内循环
//                    if(i == 2){
//                        break lable2;
//                    }
//                    System.out.println("i=" + i);//4组0,1
//                }
//        }
        lable1:
        for(int j = 0;j < 4;j++){//for外循环
            lable2:
            for(int i = 0;i < 10;i++){//for内循环
                if(i == 2){
                    break lable1;//终止外循环，直接退出外循环
                }
                System.out.println("i=" + i);//0,1
            }
        }
    }
}
