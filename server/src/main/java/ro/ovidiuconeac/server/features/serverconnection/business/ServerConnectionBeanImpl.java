package ro.ovidiuconeac.server.features.serverconnection.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import ro.ovidiuconeac.models.features.serverconnection.ServerConnection;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Ovidiu CONEAC on 2/15/2017.
 */
@Component
public class ServerConnectionBeanImpl implements ServerConnectionBean {

    @Autowired
    private Environment environment;
    
    @Override
    public ServerConnection getServerConnection() {
        InetAddress ip = null;
        String host = null;
        try {
            if (InetAddress.getLocalHost().isLoopbackAddress()) {
                host = "10.0.2.2";
            } else {
                ip = InetAddress.getLocalHost();
                host = ip.getHostAddress();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String scheme = "http";
        String port = environment.getProperty("local.server.port");
        return new ServerConnection(scheme, host, port);
    }
}