package comm1;

import java.util.ArrayList;
import java.util.List;

public class TestSub {
    //JAVA中将一个List等分成n个list的工具方法
    public static <T> List<List<T>> averageAssign(List<T> source,int n){  
        List<List<T>> result=new ArrayList<List<T>>();  
        int remaider=source.size()%n;  //(先计算出余数)  
        int number=source.size()/n;  //然后是商  
        int offset=0;//偏移量  
        for(int i=0;i<n;i++){  
            List<T> value=null;  
            if(remaider>0){  
                value=source.subList(i*number+offset, (i+1)*number+offset+1);  
                remaider--;  
                offset++;  
            }else{  
                value=source.subList(i*number+offset, (i+1)*number+offset);  
            }  
            result.add(value);  
        }  
        return result;  
    }  
    
    public static List<List<String>>  createList(List<String> targe,int size) {    
        List<List<String>> listArr = new ArrayList<List<String>>();    
        //获取被拆分的数组个数    
        int arrSize = targe.size()%size==0?targe.size()/size:targe.size()/size+1;    
        for(int i=0;i<arrSize;i++) {    
            List<String>  sub = new ArrayList<String>();    
            //把指定索引数据放入到list中    
            for(int j=i*size;j<=size*(i+1)-1;j++) {    
                if(j<=targe.size()-1) {    
                    //得到拆分后的集合  
                    sub.add(targe.get(j));    
                }    
            }    
            //拆分的集合可以做点什么  
            //sub.dosomething();  
            //将拆分后的集合综合为一个集合  
            listArr.add(sub);    
        }    
        return listArr;    
    }  
    public static void main(String[] args) {
        List<String> old=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            old.add("num:"+i+" ");
        }
       // List<List<String>> newList=averageAssign(old,5);
        List<List<String>>  newList=createList(old,5);
        for (List<String> list : newList) {
            
            System.out.println(list.toString());
            
        }
        
    }
}
