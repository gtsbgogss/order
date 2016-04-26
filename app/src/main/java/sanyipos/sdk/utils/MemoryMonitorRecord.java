package sanyipos.sdk.utils;

public class MemoryMonitorRecord implements SanyiMonitorRecord {
	public long time;
	public long freeMemory;
	public long totalMemory;

	public MemoryMonitorRecord(long time, long freeMemory, long totalMemory) {
		super();
		this.time = time;
		this.freeMemory = freeMemory;
		this.totalMemory = totalMemory;
	}

	public long getTime() {
		return time;
	}

	@Override
	public String getContent() {
		return "freeMemory=" + freeMemory + ", totalMemory=" + totalMemory;
	}
}