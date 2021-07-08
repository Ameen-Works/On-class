package hit.day27;

public class BasicGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball=new Ball();
		Sky sky=new Sky();
		
		//Accept accept=new Accept();
		
		//accept.obj=sky;
		//accept.DoProcess();
		
		RightAccept<Ball> raccept=new RightAccept<>();
		raccept.setT(ball);
		RightAccept<Sky> raccept2=new RightAccept<>();
		raccept2.setT(sky);

	}

}
class Sky{
	
}
class Ball{
	
}
class RightAccept<T>{
	T obj;
	public T getT() {
		return obj;
	}
	public void setT(T obj) {
		this.obj=obj;
	}
}
class Accept{
	Object obj;
	public void DoProcess() {
		if(obj instanceof Ball) {
			Ball ball=new Ball();
			System.out.println(ball);
		}else if(obj instanceof Sky) {
			Sky sky=new Sky();
			System.out.println(sky);
		}
	}
}