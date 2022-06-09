package fr.softeam.cameldesigner;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import fr.softeam.cameldesigner.profiler.data.Category;
import fr.softeam.cameldesigner.profiler.data.ProvidingInfo;

public class Main {

    private final static String _URL = "http://217.172.12.140:7878/";

    public static void main(String[] args) {


        ProvidingInfo info = new ProvidingInfo();
        info.setComponentName("component-1");
        info.getCategories().add(Category.GPU);
        info.setLanguage("java");
        info.setRepository("https://github.com/Supervisor/supervisor");
        pushAnalyse(info);

//        String code = "value";
//        getResponseAnalyse(code);
    }

    public static void pushAnalyse(ProvidingInfo info) {
        URL url;
        try {
            url = new URL(_URL + "analyse?");

        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("Content-Type", "application/json");

        String data = "components=[{\"component_name\": \"" + info.getComponentName() +
                        "\", \"categories\":[\""+ info.getCategories().get(0).toString().toLowerCase() +
                        "\"], \"language\":\""+ info.getLanguage() +
                        "\", \"repository\":\""+ info.getRepository() + "\"}]";


        byte[] out = data.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);

        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());

        http.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void pushAnalyse_old() {
//
//        try {
//            String codeValue = "128";
//
//            URL url = new URL(this._URL + "collect?code=" + codeValue);
//
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//
//            //Getting the response code
//            int responsecode = conn.getResponseCode();
//
//            if (responsecode != 200) {
//                throw new RuntimeException("HttpResponseCode: " + responsecode);
//            } else {
//
//                String inline = "";
//                Scanner scanner = new Scanner(url.openStream());
//
//                //Write all the JSON data into a string using a scanner
//                while (scanner.hasNext()) {
//                    inline += scanner.nextLine();
//                }
//
//                //Close the scanner
//                scanner.close();
//
////                //Using the JSON simple library parse the string into a json object
////                JSONParser parse = new JSONParser();
////                JSONObject data_obj = (JSONObject) parse.parse(inline);
////
////                //Get the required object from the above created object
////                JSONObject obj = (JSONObject) data_obj.get("Global");
////
////                //Get the required data using its key
////                System.out.println(obj.get("TotalRecovered"));
////
////                JSONArray arr = (JSONArray) data_obj.get("Countries");
////
////                for (int i = 0; i < arr.size(); i++) {
////
////                    JSONObject new_obj = (JSONObject) arr.get(i);
////
////                    if (new_obj.get("Slug").equals("albania")) {
////                        System.out.println("Total Recovered: " + new_obj.get("TotalRecovered"));
////                        break;
////                    }
////                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void getResponseAnalyse(String codeValue) {

        try {

            URL url = new URL(_URL + "collect?code=" + codeValue);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Close the scanner
                scanner.close();

//                //Using the JSON simple library parse the string into a json object
//                JSONParser parse = new JSONParser();
//                JSONObject data_obj = (JSONObject) parse.parse(inline);
//
//                //Get the required object from the above created object
//                JSONObject obj = (JSONObject) data_obj.get("Global");
//
//                //Get the required data using its key
//                System.out.println(obj.get("TotalRecovered"));
//
//                JSONArray arr = (JSONArray) data_obj.get("Countries");
//
//                for (int i = 0; i < arr.size(); i++) {
//
//                    JSONObject new_obj = (JSONObject) arr.get(i);
//
//                    if (new_obj.get("Slug").equals("albania")) {
//                        System.out.println("Total Recovered: " + new_obj.get("TotalRecovered"));
//                        break;
//                    }
//                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
