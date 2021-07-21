package programs;

public class TimeConverstion {
	public String getDurationString(int minutes,int seconds) {
		if(minutes>=0 && seconds>=0 && seconds<=59) {
			int hours=minutes/60;
			minutes=minutes%60;
			return "Time: "+hours+"hr "+minutes+"mins "+seconds+"secs";
		}
		else {
			return "Invalid value";
		}
	}
	public void  getDurationString(int seconds) {
		int minutes =seconds/60;
		seconds=seconds%60;
		System.out.println(getDurationString(minutes,seconds));
	}
}
