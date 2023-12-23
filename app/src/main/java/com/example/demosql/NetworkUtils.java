package com.example.demosql;
//import com.google.gson.Gson;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {
    public static String getDataFromPHP() throws Exception {
        URL url = new URL("http://localhost/demo_Project_mysql/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = connection.getInputStream();
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            return new String(bytes);
        } else {
            throw new Exception("Không thể kết nối với máy chủ.");
        }
    }
}
