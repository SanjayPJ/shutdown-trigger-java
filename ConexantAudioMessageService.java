import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ConexantAudioMessageService {

   /* This is a prank application that will help you shutdown remotely using an api fetch request
    * URL: https://sanjaypj.github.io/shutdownTrigger
    */

   public static void main(String[] args) throws Exception {

        ConexantAudioMessageService contextAudioMessageService1;

        while(true){
        	contextAudioMessageService1 = new ConexantAudioMessageService();
        	contextAudioMessageService1.sendGet();
        }

    }

    private void sendGet() throws Exception {

        String triggerURL = "https://sanjaypj.github.io/shutdownTrigger";

        HttpURLConnection httpClient =
                (HttpURLConnection) new URL(triggerURL).openConnection();

        // optional default is GET
        httpClient.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            //print result
            System.out.println(response.toString());

            TimeUnit.SECONDS.sleep(3);
        }
        catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}

    }

}