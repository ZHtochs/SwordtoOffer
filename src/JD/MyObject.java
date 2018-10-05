package JD;

import java.util.ArrayList;
import java.util.Scanner;

 class MyObject {


    static class ObjectN  implements Comparable<ObjectN>{
        int ai;
        int bi;
        int ci;

        public ObjectN(int ai, int bi, int ci) {
            this.ai = ai;
            this.bi = bi;
            this.ci = ci;
        }
        //和2比较，看1是否为合格品，0为不合格品
        public int compareTo(ObjectN o2) {
            if (this.ci < o2.ci && this.ai < o2.ai && this.bi < o2.bi)
                return 0;
            else
                return 1;
        }
    }


    //判断后面的物品是否合格

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ObjectN> arrayList=new ArrayList<>();

        int num=sc.nextInt();
        int count=num;
        while(count!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            ObjectN objectN=new ObjectN(a,b,c);
            arrayList.add(objectN);
            count--;
        }
        for (int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                //System.out.println(arrayList.get(i).compareTo(arrayList.get(j)));
                if(arrayList.get(i).compareTo(arrayList.get(j))==0){
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);

    }
}
