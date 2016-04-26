package sanyipos.sdk.utils;

public class HttpMonitorRecord implements SanyiMonitorRecord {

	private long time;
	private long startTime;
	
	private long endTime;
	private int duration;
	private long webServerTime;

	public HttpMonitorRecord(long time, long startTime, long endTime, int duration, String webServerTime) {
		super();
		this.time = time;
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.webServerTime = parseServerTime(webServerTime);
	}

	@Override
	public String getContent() {
		return "startTime=" + startTime + ", endTime=" + endTime + ", duration=" + duration + ", webServerTime=" + webServerTime;
	}

	@Override
	public long getTime() {
		return time;
	}

	
	private long parseServerTime(String webServerTime) {
		if (webServerTime != null) {
			String tmp = webServerTime.substring(2, webServerTime.length());
			try {
				long t = Long.parseLong(tmp);
				return t / 1000;
			} catch (NumberFormatException e) {
				return -1;
			}
		}
		return -1;
	}
}
