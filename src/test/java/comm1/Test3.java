package comm1;

public class Test3 {

	public static boolean checkNull(Object... objects) {
		for (Object object : objects) {
			if (null == object) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String aa="";
		Integer aInteger=null;
		System.out.println(checkNull(aa,aInteger,3));
		System.out.println(checkNull(aInteger));
		System.out.println(checkNull(new TestSub()));
	}
}
