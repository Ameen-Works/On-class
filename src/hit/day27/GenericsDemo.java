package hit.day27;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint rpaint=new redPaint();
		Paint bpaint=new bluePaint();
		GoodPaintBrush brush=new GoodPaintBrush();
		brush.paint=rpaint;
		brush.paint=bpaint;
		brush.doPaint();

	}
}
	abstract class Paint{
		
	}
	class redPaint extends Paint {
		
	}
	class bluePaint extends Paint{
		
	}
	class GoodPaintBrush{
		Paint paint;
		public void doPaint() {
			System.out.println(paint);
		}
	}


