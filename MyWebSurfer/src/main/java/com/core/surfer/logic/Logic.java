package com.core.surfer.logic;

import java.util.List;

public interface Logic<R>{
	
	
	public abstract List<R> apply(Object...objects) throws Exception;

}
