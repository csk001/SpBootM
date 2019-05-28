package comm2;

import java.util.ArrayList;
import java.util.List;

public class TestLong {
	public static void main(String[] args) {
		long a1 = 0l;
		long a2 = 01l;
		long a3 = 1234l;
		long a4 = 1234567890l;
		long a5 = 2147483647l;
		System.out.println((int)a1);
		System.out.println((int)a2);
		System.out.println((int)a3);
		System.out.println((int)a4);
		System.out.println((int)a5);
		long t1 = System.currentTimeMillis();
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 9000; i++) {
			for (int j = 0; j < 7; j++) {
				list.add(new Long(a4).intValue());
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println("data:" + (t2 - t1));
		System.out.println("-----------------");
		long t3 = System.currentTimeMillis();
		List<Integer> list2=new ArrayList<Integer>();
		for (int i = 0; i < 9000; i++) {
			for (int j = 0; j < 7; j++) {
				list2.add(Long.valueOf(a4).intValue());
			}
		}
		long t4 = System.currentTimeMillis();
		System.out.println("data2:" + (t4 - t3));
	}
}
