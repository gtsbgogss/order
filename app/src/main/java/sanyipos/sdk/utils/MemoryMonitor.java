package sanyipos.sdk.utils;

public abstract class MemoryMonitor {
	
	public static MemoryMonitor monitor = null;
	public static boolean isMonitorOn = false;

	protected abstract MemoryInfo memoryInfo();
	
	public static MemoryInfo getMemoryInfo(){
		if(monitor ==null || !isMonitorOn ) {
			return null;
		}else{
			return monitor.memoryInfo();
		}
	}
	
	public static void setMonitorOn( boolean monitorOn ){
		isMonitorOn = monitorOn;		
	}
	
	public static void initMonitor(int platForm){
		if(ConstantsUtil.FLATFORM_ANDROID==platForm){
			try {
				Class.forName("com.sanyipos.smartpos.android.util.AndroidMemoryMonitor");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static class MemoryInfo{
		private long freeMemory;
		private long totalMemory;
		public MemoryInfo(long freeMemory, long totalMemory) {
			super();
			this.freeMemory = freeMemory;
			this.totalMemory = totalMemory;
		}
		public long getFreeMemory() {
			return freeMemory;
		}
		public long getTotalMemory() {
			return totalMemory;
		}
	}
}
