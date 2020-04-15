package com.base.study.web.springbootweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 上午10:40 2020/4/15
 * Created By CC.Z
 * Version:1.0.
 */
@Data
@AllArgsConstructor
public class BinaryNode implements Serializable {
	private Integer data;
	private BinaryNode left;
	private BinaryNode right;

	public BinaryNode(int data) {
		this.data = data;
	}

	public void insert(BinaryNode root, int data) {
		if (root != null) {
			if (root.data < data) {
				if (root.right == null) {
					root.right = new BinaryNode(data);
				} else {
					insert(root.right, data);
				}
			} else {
				if (root.left == null) {
					root.left = new BinaryNode(data);
				} else {
					insert(root.right, data);
				}
			}
		}
	}

	public void in(BinaryNode root) {
		if (root != null) {
			in(root.left);
			System.out.println(root.data);
			in(root.right);
		}
	}

}
