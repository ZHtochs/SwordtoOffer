package sort;

public class main {
    /**
     * 执行入口，intArrays：待排序的数组，displaySort：是否显示排序前和排序后的内容
     */
    public static void run(int intArrays[],Sort sort){
        int arrays[]= intArrays.clone();
            NumberUtils.display(intArrays,false);
        long startTime=System.currentTimeMillis();
        sort.sort(arrays);
        long endTime=System.currentTimeMillis();
            NumberUtils.display(arrays,true);
        System.out.println(sort.getClass()+"排序用时："+(endTime-startTime)+"毫秒");
    }
    /**
     * 测试排序用的主方法
     */
    public int[] asdas(){
        int[] a={1,2};
        return a;
    }
    public static void main(String[] args){
        //数组长度
        int length=10000;
        //最大值
        int max =4000000;;
        //随机获取的排序数组
        int arrays[]= NumberUtils.getRandomArs(length,max);
        //int arrays[]={12,15,1,18,2,35,30,11};
       Sort Insertion=new Heap();//插入排序
        run(arrays,Insertion);
        Math.random();
    }
}
