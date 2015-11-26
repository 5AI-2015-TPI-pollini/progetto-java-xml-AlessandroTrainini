/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaxmlproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pollini
 */
public class GeoMeteo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            URL url = new URL("http://www.google.com/");
            URLConnection con = url.openConnection();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));

// Read it ...
            String inputLine;
            
            PrintWriter XMLWriter = new PrintWriter(new FileWriter("file.xml"));
            while ((inputLine = in.readLine()) != null)
                XMLWriter.println(inputLine);
            
            in.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(GeoMeteo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeoMeteo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}