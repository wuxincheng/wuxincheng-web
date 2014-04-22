package com.wuxincheng.web.util;

import org.junit.Test;

/**
 * 字符串和Unicode转换工具类
 * 
 * @author wuxincheng(wxcking)
 *
 */
public class StringUnicodeUtil {
	
	@Test
	public void testConvert(){
		System.out.println(strConvertUnicode("要在"));
		System.out.println(unicodeRevertStr("\u90a3\u4e9b\u4e8b"));
	}
	
	/**
	 * 字符串转换成Unicode
	 * 
	 * @param str
	 * @return
	 */
	public String strConvertUnicode(String str) {
		str = (str == null ? "" : str);
		String tmp;
		StringBuffer sb = new StringBuffer(1000);
		char c;
		int i, j;
		sb.setLength(0);
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			sb.append("\\u");
			j = (c >>> 8); // 取出高8位
			tmp = Integer.toHexString(j);
			if (tmp.length() == 1)
				sb.append("0");
			sb.append(tmp);
			j = (c & 0xFF); // 取出低8位
			tmp = Integer.toHexString(j);
			if (tmp.length() == 1)
				sb.append("0");
			sb.append(tmp);

		}
		return (new String(sb));
	}

	/**
	 * Unicode转换成字符串
	 * 
	 * @param unicode
	 * @return
	 */
	public String unicodeRevertStr(String unicode) {
		unicode = (unicode == null ? "" : unicode);
		if (unicode.indexOf("\\u") == -1) // 如果不是unicode码则原样返回
			return unicode;

		StringBuffer sb = new StringBuffer(1000);

		for (int i = 0; i < unicode.length() - 6;) {
			String strTemp = unicode.substring(i, i + 6);
			String value = strTemp.substring(2);
			int c = 0;
			for (int j = 0; j < value.length(); j++) {
				char tempChar = value.charAt(j);
				int t = 0;
				switch (tempChar) {
				case 'a':
					t = 10;
					break;
				case 'b':
					t = 11;
					break;
				case 'c':
					t = 12;
					break;
				case 'd':
					t = 13;
					break;
				case 'e':
					t = 14;
					break;
				case 'f':
					t = 15;
					break;
				default:
					t = tempChar - 48;
					break;
				}

				c += t * ((int) Math.pow(16, (value.length() - j - 1)));
			}
			sb.append((char) c);
			i = i + 6;
		}
		return sb.toString();
	}
}
