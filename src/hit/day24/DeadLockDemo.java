package hit.day24;

public class DeadLockDemo {
	public static void main(String[] args) {
		Frog frog=new Frog();
		Crane crane=new Crane();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				crane.eat(frog);
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				frog.escape(crane);
			}
		}).start();
	}

}
class Crane{
	synchronized public void eat(Frog frog) {
		System.out.println();
		frog.leavecalledbycrane();
	}
	synchronized public void leavecalledbyfrog() {
		
	}
}
class Frog{
	synchronized public void escape(Crane crane) {
		crane.leavecalledbyfrog();
	}
	synchronized public void leavecalledbycrane(){
		
	}
}
