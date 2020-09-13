package com.yunf.learningproject;

import com.yunf.learningproject.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class LearningProjectApplicationTests {

	@Autowired
	Person person;

	@Test
	void contextLoads() throws ParseException {

		//两数之和
//		int[] nums = new int[]{2, 7, 11, 15};
//		Integer target = 9;
//		twoSum(nums,target);

		//整数反转
//		reverse(-123);

		commonTest();
		//更新了

	}

	public void commonTest(){

		String string = "12312|#81737$8ds|#ad$uiu|#213j$12|#u3oi$udiejkjj2k|#3JKj$09";

		string = string.substring(3);

		List<String> list = new ArrayList<String>();
		while(string.contains("|")){
			while(string.contains("$")){
				String subString = string.substring(string.indexOf("|")+1,string.indexOf("$"));
				string = string.substring(string.indexOf("$")+1);
				list.add(subString);
			}
		}

		System.out.println("ok");

	}


	//整数反转
	public int reverse(int x) {
		StringBuffer sb = new StringBuffer(Integer.toString(x));
		sb = sb.reverse();

		Integer result = null;
		try {
			result = Integer.parseInt(sb.toString());
		}catch (Exception e){
			return 0;
		}

		return result;
	}

	//两数之和 hashMap一次解决
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}


}
