package hit.day24;

public class GarbageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		System.out.println("before objct creation"+r.freeMemory());
		//God god=new God();
		System.out.println("after god creates something"+r.freeMemory());

	}
}
	class God{
		//StringBuilder age=new StringBuilder();
		StringBuffer age=new StringBuffer();
		public God() {
			for (int i=0;i<1000;i++) {
				age.append("aaa"+i);
			}
		}
	}


