package com.evsward.aggregator;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
@Component
public class ProductInformationClientImpl implements ProductInformationClient {

	@Override
	public String getProductInformation() {
		String response = null;
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
			HttpGet httpGet = new HttpGet("http://localhost:51521/information");
			try (CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
				response = EntityUtils.toString(httpResponse.getEntity());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

}
