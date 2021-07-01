package remote.pattern;

public class UniversalRemote {
	public static void main(String[] args) {
		System.out.println("Demonstration");
		Tv tv=new Tv();
		SetTopBox setTopBox=new SetTopBox();
		NetFlix netFlix=new NetFlix();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc= new FatherNewsChannelCommand(tv, setTopBox, soundSystem, netFlix);
		MotherSerialCommand msc=new MotherSerialCommand(tv, setTopBox, soundSystem, netFlix);
		MotherOldMoviesCommand momc=new MotherOldMoviesCommand(tv, setTopBox, soundSystem, netFlix);
		Remote universalRemote=new Remote();
		//universalRemote.executeCommand(1);
		universalRemote.setCommand(momc, 1);
		universalRemote.setCommand(fncc, 0);
		universalRemote.setCommand(msc, 2);
		System.out.println("my father wants to see news channel");
		universalRemote.executeCommand(0);
	}

	
}
class Tv{
	public void av1() {
		System.out.println("TV switched to av mode ....");
	}
	public void switchOn() {
		System.out.println("TV Switched on....");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("News channel Started...");
	}
	public void serialChannel() {
		System.out.println("serial channel started....");
	}
}
class NetFlix{
	public void movieOld() {
		System.out.println("old movie started....");// "old movie started..
	}
}
class SoundSystem{
	public void lowSound() {
		System.out.println("Sound Decreased....");
	}
}
interface command{
	public void execute();
}
class FatherNewsChannelCommand implements command{
	Tv tv;SetTopBox setTopBox;SoundSystem soundSystem;NetFlix netFlix;
	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	System.out.println("Father TV action Started");
	tv.switchOn();
	tv.av1();
	setTopBox.newsChannel();
	soundSystem.lowSound();
	System.out.println("dad enjoy your news");
	}
}
class MotherOldMoviesCommand implements command{
	Tv tv;SetTopBox setTopBox;SoundSystem soundSystem;NetFlix netFlix;
	public MotherOldMoviesCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Mother TV action Started");
		tv.switchOn();
		tv.av1();
		netFlix.movieOld();
		System.out.println("enjoy the old movie mom....");
	}
}
class MotherSerialCommand implements command{
	Tv tv;SetTopBox setTopBox;SoundSystem soundSystem;NetFlix netFlix;
	public MotherSerialCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Mother Serial action Started");
		tv.switchOn();
		tv.av1();
		setTopBox.serialChannel();
		System.out.println("enjoy the serial");
	}
}
class DummyCommand implements command{
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	System.out.println("I am a dummy button");	
	}
}
class Remote{
	command comm[]=new command[5];
	public Remote() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<comm.length;i++) {
			comm[i]=new DummyCommand();
		}
	}
	public void setCommand(command comm, int slot) {
		this.comm[slot]=comm;
	}
	public void executeCommand(int slot) {
		comm[slot].execute();
	}
}