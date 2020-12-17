public class PrintOutV {
        public static void main(String[] args){
            //调用Main类方法，输入层数
            PrintOutV.Solution(3);

        }

        public static void Solution(int n){
            //每一行共有x列（画图找规律）x=最高层数+（最高层数-1）
            int x = n + (n-1);
            int head = 1;
            int end = x;
            //此循环控制行数
            for(int i=1;i<=3;i++){
                //此循环控制列，遍历输出当前层的v和空格
                for(int j=1;j<=x;j++){
                    if(j == head || j ==end){
                        System.out.print("v");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.print("\n");
                ++head;
                --end;
            }
        }
    }


