package org.geek.sync;

public interface ISyncListener {
	
	void onSyncProgress(int step, int done, int total);
	
	void onSyncEnd(Throwable result);
	
	void onSyncCancelled();

}
