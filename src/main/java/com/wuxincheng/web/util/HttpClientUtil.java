package com.wuxincheng.web.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;

/**
 * Http请求工具类
 * 
 * @author Administrator
 *
 */
public class HttpClientUtil {

	private static Logger logger = Logger.getLogger(HttpClientUtil.class);

	public static String sendPost(String url, String params) throws Exception {
		logger.info("发送请求:" + params + "到请求地址URL:" + url);
		HttpClient httpClient = new HttpClient();
		httpClient.getParams().setContentCharset("UTF-8");
		PostMethod postMethod = new PostMethod(url);
		NameValuePair[] requestBody = convertParamsToNameValuePairs(params);
		postMethod.setRequestBody(requestBody);
		httpClient.executeMethod(postMethod);
		String responseStr = postMethod.getResponseBodyAsString();
		logger.info("接收到响应:" + responseStr);
		return responseStr;
	}
	
	private static NameValuePair[] convertParamsToNameValuePairs(String params) {
		String[] paramItems = params.split("&");
		int length = paramItems.length;
		NameValuePair[] pairs = new NameValuePair[length];
		for(int i = 0; i < length; i++) {
			String paramItem = paramItems[i];
			String[] itemKeyValues = paramItem.split("=");
			String key= itemKeyValues[0];
			String value = "";
			if("sign".equals(key)) {
				value = paramItem.substring("sign=".length());
			} else if(itemKeyValues.length >= 2) {
				value= itemKeyValues[1];
			}
			pairs[i] = new NameValuePair(key, value);
		}
		return pairs;
	}
	
}
