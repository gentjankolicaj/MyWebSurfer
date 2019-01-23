package com.core.surfer;

import java.util.List;

/**
 * 
 * @author gentjan koli�aj
 *
 */
public interface Surfable<O> {

	public abstract List<O> surf() throws Exception;
}
