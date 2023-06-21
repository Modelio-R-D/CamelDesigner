package fr.softeam.cameldesigner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
import fr.softeam.cameldesigner.profiler.data.Category;
import fr.softeam.cameldesigner.profiler.data.ProvidingInfo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

@objid ("d64ecd5a-d540-43fa-86ec-a3f3fb2afaa4")
public class Main {
    @objid ("a1a5e766-fff7-4655-a517-3e0e8b3def39")
    private static final String _URL = "http://192.168.25.56:7889";

    @objid ("119ac78b-f7b5-4833-a0a7-8376ef105877")
    private static String code = "1";

    @objid ("d72fc10f-4888-49a1-be53-a504d109a8c2")
    public static void main(String[] args) {
        //        testProfiler();
        
        Display display = new Display();
        Shell shell = new Shell(display);
        
        //                Shell[] shell = Display.getDefault().getShells();
        
        String title = "Error";
        
        String description = "Your model is too much constrained and will not allow any solution.";
        MessageBox messageBox = new MessageBox(shell, SWT.ERROR);
        messageBox.setMessage(description);
        messageBox.setText(title);
        messageBox.open();
        //                AbstractSwtWizardWindow.this.shell.dispose();
        
        title = "";
    }

    @objid ("4b02b658-c672-42c8-a7e5-b71d5e33e816")
    public static void pushAnalyse(ProvidingInfo info) {
        URL url;
        try {
            url = new URL(_URL + "/analyse");
        
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            http.setRequestMethod("POST");
            http.setDoOutput(true);
            http.setRequestProperty("Accept", "application/json");
            http.setRequestProperty("Content-Type", "application/json");
        
            String data = "[{\"component_name\": \"" + info.getComponentName() +
                    "\", \"categories\": [\""+ info.getCategories().get(0).toString().toLowerCase() +
                    "\"], \"repository\": \""+ info.getRepository()  +
                    "\", \"language\": \""+ info.getLanguage() + "\"}]";
        
        
            byte[] out = data.getBytes(StandardCharsets.UTF_8);
        
            OutputStream stream = http.getOutputStream();
            stream.write(out);
        
            System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        
            int status = http.getResponseCode();
        
            switch (status) {
            case 200:
            case 201:
                BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line+"\n");
                }
                br.close();
                System.out.println(sb.toString());
            }
        
        
            stream.close();
            http.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    HttpURLConnection c = null;
//    try {
//        URL u = new URL(url);
//        c = (HttpURLConnection) u.openConnection();
//        c.setRequestMethod("GET");
//        c.setRequestProperty("Content-length", "0");
//        c.setUseCaches(false);
//        c.setAllowUserInteraction(false);
//        c.setConnectTimeout(timeout);
//        c.setReadTimeout(timeout);
//        c.connect();
//        int status = c.getResponseCode();
//
//        switch (status) {
//            case 200:
//            case 201:
//                BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
//                StringBuilder sb = new StringBuilder();
//                String line;
//                while ((line = br.readLine()) != null) {
//                    sb.append(line+"\n");
//                }
//                br.close();
//                return sb.toString();
//        }
//
//    } catch (MalformedURLException ex) {
//        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
//    } catch (IOException ex) {
//        Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
//    } finally {
//       if (c != null) {
//          try {
//              c.disconnect();
//          } catch (Exception ex) {
//             Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
//          }
//       }
//    }
//    return null;
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
    @objid ("52969b0a-acaf-492c-8fb2-403cf7f9d89d")
    public static void getResponseAnalyse() {
        try {
            System.out.println("collection of data");
            URL url = new URL(_URL + "/collect?code=" + code );
        
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
                System.out.println(inline);
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

    @objid ("ace48976-e9d3-4988-a8ae-ce4952bfb2d4")
    private static void testProfiler() {
        ProvidingInfo info = new ProvidingInfo();
        info.setComponentName("component-1");
        info.getCategories().add(Category.GPU);
        info.setLanguage("C");
        info.setRepository("https://github.com/jdtotow/tme");
        pushAnalyse(info);
        
        getResponseAnalyse();
    }

    @objid ("a07946c5-7076-4789-97b8-557eb6c224a2")
    private static ProvidingInfo getInfo(ProfilerComponent comp) {
        ProvidingInfo info = new ProvidingInfo();
        info.setComponentName(comp.getElement().getName());
        info.getCategories().add(Category.GPU);
        info.setLanguage("C");
        info.setRepository("https://github.com/jdtotow/tme");
        return info;
    }

}
