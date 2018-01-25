package poe.rest.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import poe.rest.client.to.UserTO;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet get = new HttpGet("http://localhost:8080/user");

        CloseableHttpResponse response = httpclient.execute(get);
        HttpEntity entity = response.getEntity();
        String json = EntityUtils.toString(entity);
        System.out.println(json);

        // Jackson stuff
        ObjectMapper mapper = new ObjectMapper();
        UserTO[] userTO = mapper.readValue(json, UserTO[].class);
        System.out.println(userTO[0].getEmail());

        HttpPost post = new HttpPost("http://localhost:8080/user/mail@mail.com/thepass");

        entity = httpclient.execute(post).getEntity();



    }
}
