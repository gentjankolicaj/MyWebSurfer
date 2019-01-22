package com.core.surfer;

import java.util.List;

public interface Surfable<I,O> {

	public abstract List<O> surf(I input) throws Exception;
}
