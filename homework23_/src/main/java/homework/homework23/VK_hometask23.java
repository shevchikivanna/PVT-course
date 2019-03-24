package homework.homework23;

import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class VK_hometask23 {
	private static final String MethodPost = "https://api.vk.com/method/wall.post?";
	private static final String MethodEdit = "https://api.vk.com/method/wall.edit?";
	private static final String MethodDelete = "https://api.vk.com/method/wall.delete?";
	private static final String Owner_id = "537421013";
	private static final String Message = "My test to my wall";
	private static final String MessageEdited = "New test edit";
	private static final String Version = "5.92";
	private String post_id;
	private static final String Access_token = "b613df9d1fc75ce0965161e7dc98cf58fc7fd30b476f0abb1d6eb95000507d62b5f834480537fb54dfa53";
	HttpClient client = HttpClientBuilder.create().build();

	public HttpResponse postToWall() throws ClientProtocolException, IOException, URISyntaxException {

		URIBuilder builder = new URIBuilder(MethodPost);
		builder.setParameter("access_token", Access_token).setParameter("owner_id", Owner_id)
				.setParameter("message", Message).setParameter("v", Version);
		HttpGet request1 = new HttpGet(builder.build());
		HttpResponse response1 = client.execute(request1);
		String partOfResponse = EntityUtils.toString(response1.getEntity());
		System.out.println(partOfResponse);
		post_id = partOfResponse.substring(23, 25);
		System.out.println(post_id);
		return response1;
	}

	public HttpResponse editFromWall() throws ClientProtocolException, IOException, URISyntaxException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder(MethodEdit);
		builder.setParameter("access_token", Access_token).setParameter("owner_id", Owner_id)
				.setParameter("post_id", post_id).setParameter("message", MessageEdited).setParameter("v", Version);
		HttpGet request2 = new HttpGet(builder.build());
		HttpResponse response2 = client.execute(request2);
		System.out.println(EntityUtils.toString(response2.getEntity()));
		return response2;
	}

	public HttpResponse deleteFromWall() throws ClientProtocolException, IOException, URISyntaxException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder(MethodDelete);
		builder.setParameter("access_token", Access_token).setParameter("owner_id", Owner_id)
				.setParameter("post_id", post_id).setParameter("v", Version);
		HttpGet request3 = new HttpGet(builder.build());
		HttpResponse response3 = client.execute(request3);
		System.out.println(EntityUtils.toString(response3.getEntity()));
		return response3;
	}
}
