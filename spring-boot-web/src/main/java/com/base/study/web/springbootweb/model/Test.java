package com.base.study.web.springbootweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

/**
 * 下午1:25 2020/4/15
 * Author: Jonn.Z
 * Version:1.0.
 */
@Entity(name = "test")
@Data
@AllArgsConstructor
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer age;
	@Column
	private String sex ;


}
