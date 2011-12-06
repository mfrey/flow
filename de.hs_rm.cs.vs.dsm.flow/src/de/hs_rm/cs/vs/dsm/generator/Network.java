package de.hs_rm.cs.vs.dsm.generator;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Network {
	//
	private Set<String> mStreams = new HashSet<String>();

	public Set<String> getStreams() {
		return mStreams;
	}
	
	public void setStreams(Set<String> pStreams) {
		this.mStreams = pStreams;
	}
	
	public void clear(){
		this.mStreams.clear();
	}
}
