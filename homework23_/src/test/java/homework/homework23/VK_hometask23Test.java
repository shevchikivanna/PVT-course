package homework.homework23;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;

public class VK_hometask23Test {
	private static VK_hometask23 vK_hometask23 = new VK_hometask23();
	private HttpResponse response;

	@Test
	
	public void testVKPostToWall() throws ClientProtocolException, IOException, URISyntaxException {
		response = vK_hometask23.postToWall();
		assertEquals(200, response.getStatusLine().getStatusCode());
	}

	@Test
	
	public void testVKEditOnWall() throws ClientProtocolException, IOException, URISyntaxException {
		response = vK_hometask23.editFromWall();
		assertEquals(200, response.getStatusLine().getStatusCode());
	}

	@Test
	
	public void testVKDeleteFromWall() throws ClientProtocolException, IOException, URISyntaxException {
		response = vK_hometask23.deleteFromWall();
		assertEquals(200, response.getStatusLine().getStatusCode());
	}
}
