package com.base.study.web.springbootweb.responsity;

import com.base.study.web.springbootweb.model.Test;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 下午1:49 2020/4/15
 * Author: Jonn.Z
 * Version:1.0.
 */
@Repository
public class TestReponsity implements BaseReponsity<Test,Integer>{
	@Override
	public List<Test> findList() {
		return null;
	}

	@Override
	public <S extends Test> S save(S s) {
		return null;
	}

	@Override
	public <S extends Test> Iterable<S> saveAll(Iterable<S> iterable) {
		return null;
	}

	@Override
	public Optional<Test> findById(Integer integer) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer integer) {
		return false;
	}

	@Override
	public Iterable<Test> findAll() {
		return null;
	}

	@Override
	public Iterable<Test> findAllById(Iterable<Integer> iterable) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Integer integer) {

	}

	@Override
	public void delete(Test test) {

	}

	@Override
	public void deleteAll(Iterable<? extends Test> iterable) {

	}

	@Override
	public void deleteAll() {

	}
}
