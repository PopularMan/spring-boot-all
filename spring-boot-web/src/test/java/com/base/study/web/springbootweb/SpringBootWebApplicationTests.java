package com.base.study.web.springbootweb;

import com.base.study.web.springbootweb.model.BinaryNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringBootWebApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void testSort() {
		List<Integer> data = Arrays.asList(1,2,44,22,11,4444,222,7,9,88);
		BinaryNode binaryNode = new BinaryNode(data.get(0));
		data.stream().forEach(x->{
			if(x != 1){
				binaryNode.insert(binaryNode,x);
			}

		});
		binaryNode.in(binaryNode);
	}

}
