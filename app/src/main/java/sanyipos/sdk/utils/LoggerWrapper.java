package sanyipos.sdk.utils;

public abstract class LoggerWrapper {
	
	public static final String TAG_INFO = "[INFO]";
	public static final String TAG_ERROR = "[ERROR]";
	public static final String TAG_TIMEOUT = "[TIMEOUT]";
	public static final String TAG_EXCEPTION = "[EXCEPTION]";
	
	public abstract void debug(String p1, String p2);
}
