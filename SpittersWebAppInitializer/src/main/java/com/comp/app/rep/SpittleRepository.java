package com.comp.app.rep;

import java.util.List;

import com.comp.app.model.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
