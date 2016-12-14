package com.sample.test;

import java.util.stream.Stream;

public class PassWordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "skjssldfkjsakdfjlskdssfkjslakdfiop7adfaijsldifjasdjfil8klsasdfSdijpfjapodifjpoaidjfpoaidjpfi9a";
		int strLen = 0;
		String[] test = s.split("[0-9]");
		for (int i = 0; i < test.length; i++) {
			if (strLen < test[i].length()
					&& test[i].matches("[a-z]*[A-Z]+[a-z]*"))
				strLen = test[i].length();
		}
		if (strLen == 0)
			System.out.println("-1");
		else
			System.out.println(strLen);
	}

}
