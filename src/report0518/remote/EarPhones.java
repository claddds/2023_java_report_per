package report0518.remote;

public class EarPhones implements Remote_Control {
private int volume = 3;
	
	@Override
	public int volumeDown() {
		volume--;
		if(volume<0) {
			volume = 0;
		}
		return volume;
	}

	@Override
	public int volumeUp() {
		volume++;
		if(volume >= 10) {
			volume = 10;
		}
		return volume;	
	}
	
	
}
