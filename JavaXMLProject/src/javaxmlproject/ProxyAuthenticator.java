package javaxmlproject;


import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class ProxyAuthenticator extends Authenticator {

    private String userName, password;
    
    public ProxyAuthenticator(String userName, String password) {
        this.userName = userName;
        this.password = password;
           
    }
        public void initProxy()
        {
            System.setProperty("proxySet", "true");
            System.setProperty("http.proxyHost", "192.168.0.1");
            System.setProperty("http.proxyPort", "8080");
            Authenticator.setDefault(new Authenticator() {
                        @Override
                        public PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(userName, password.toCharArray());
                        }
                    });
        }                 

}