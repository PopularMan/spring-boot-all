package com.base.study.web.springbootweb.responsity;

import com.base.study.web.springbootweb.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 下午1:28 2020/4/15
 * Author: Jonn.Z
 * Version:1.0.
 */
public interface BaseReponsity<Test, Integer> extends CrudRepository<Test, Integer> {
	List<Test> findList();
}
