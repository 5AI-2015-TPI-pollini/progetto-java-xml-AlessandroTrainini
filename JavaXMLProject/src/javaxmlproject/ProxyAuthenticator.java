package javaxmlproject;


import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class ProxyAuthenticator extends Authenticator {

    private String userName, password;
    
    public ProxyAuthenticator(String userName, String password) {
        this.userName = userName;
        System.out.println("f" + userName + password);
        this.password = password;
        initProxy();
           
    }
        public void initProxy()
        {
            System.setProperty("proxySet", "true");
            System.setProperty("http.proxyHost", "192.168.0.1");
            System.setProperty("http.proxyPort", "8080");
            Authenticator.setDefault(new Authenticator() {
                        @Override
                        public PasswordAuthentication getPasswordAuthentication() {
                            System.out.println("Ok");
                            return new PasswordAuthentication(userName, password.toCharArray());
                        }
                    });
        }                 

}