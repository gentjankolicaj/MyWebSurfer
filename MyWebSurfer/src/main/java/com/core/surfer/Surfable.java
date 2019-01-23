package com.core.surfer;

import java.util.List;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public interface Surfable<O> {

	public abstract List<O> surf() throws Exception;
}
