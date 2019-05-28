package filter;//package filter;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import com.google.common.base.Predicate;
//import com.google.common.collect.Collections2;
//import com.google.common.collect.Lists;
//
//public class TestIterator {
//	public static void main(String[] args) {
//		List<String> list0 = Lists.newArrayList("John00", "Jane1", "Adam10", "Tom");
//		List<String> list1 = new ArrayList<String>() {
//			{
//				add("A");
//			}
//		};
//
//		Collection<String> result = Collections2.filter(list0, new Predicate<String>() {
//
//			@Override
//			public boolean apply(String var1) {
//
//				return var1.contains("1");
//			}
//		});
//		System.out.println(result);
//	}
//
//}
