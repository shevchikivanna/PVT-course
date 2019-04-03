package vkAPITest;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import MailAutomationTest.MailRu.MailCommon;

class VKApiTest {
	
	private static final String TOKEN = "b8a2603213dd4d4b8d9d950d648879bb436cd68d302e83edd69d79d15e855538ef37138f51ab17f5e4c14";
	private static final String OWNER_ID = "536083852";
	private static final Logger logger = Logger.getLogger(MailCommon.class);
	
	@Test
	public void postToWallTest() throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder.setParameter("access_token", TOKEN)
				.setParameter("owner_id", OWNER_ID).setParameter("message", "Test new")
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String responseBody = EntityUtils.toString(response.getEntity());
		if (responseBody.contains("error") == true) {
			logger.error("ERRER - Check parameters.");
		} else {
			logger.info(responseBody);
		}
		assertTrue(response.getStatusLine().getStatusCode() == 200);
		assertFalse(responseBody.contains("error"));
		assertTrue(responseBody.contains("post_id"));
	}
	
	@Test
	public void getInfoFromWallTest() throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.get?");
		builder.setParameter("access_token", TOKEN)
				.setParameter("owner_id", OWNER_ID).setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String responseBody = EntityUtils.toString(response.getEntity());
		if (responseBody.contains("error") == true) {
			logger.error("ERRER - Check parameters.");
		} else {
			logger.info(responseBody);
		}
		assertTrue(response.getStatusLine().getStatusCode() == 200);
		assertFalse(responseBody.contains("error"));
		assertTrue(responseBody.contains("count"));
	}
	
	@Test
	public void editExistingPostOnWallTest() throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.edit?");
        builder.setParameter("access_token", TOKEN)
	        .setParameter("owner_id", OWNER_ID)
	        .setParameter("post_id", "632")
	        .setParameter("message", "New test edit")
	        .setParameter("v", "5.92");
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = client.execute(request);
        String responseBody = EntityUtils.toString(response.getEntity());
        if (responseBody.contains("error") == true) {
			logger.error("ERRER - Check parameters.");
		} else {
			logger.info(responseBody);
		}
        assertTrue(response.getStatusLine().getStatusCode() == 200);
		assertFalse(responseBody.contains("error"));
		assertTrue(responseBody.contains("1"));
	}
	
	@Test
	public void deletePostFromWallTest() throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.delete?");
        builder.setParameter("access_token", TOKEN)
        .setParameter("owner_id", OWNER_ID)
        .setParameter("post_id", "641")
        .setParameter("v", "5.92");
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = client.execute(request);
        String responseBody = EntityUtils.toString(response.getEntity());
        if (responseBody.contains("error") == true) {
			logger.error("ERRER - Check parameters.");
		} else {
			logger.info(responseBody);
		}
        assertTrue(response.getStatusLine().getStatusCode() == 200);
		assertFalse(responseBody.contains("error"));
		assertTrue(responseBody.contains("1"));
	}

}
