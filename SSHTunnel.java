/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APIs;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.util.Properties;

/**
 *
 * @author jesse
 */
public class SSHTunnel {
   
    public static void main(String[] args) {
        String username = "java_noob";
        String password = "nerdy4ever!";
        String host = "ds-gpu1";
        int port = 22; // Default SSH port
        String remoteHost = "localhost";//"remote_host";
        int remotePort = 11434; // Example: MySQL port
        int localPort = 11434;
        Session session = null;
        try {
            JSch jsch = new JSch();
            session = jsch.getSession(username, host, port);
            session.setPassword(password);

            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
             // Not recommended for production
            session.setConfig(config);

            session.connect();

            int assignedPort = session.setPortForwardingL(localPort, remoteHost, remotePort);

            System.out.println("Tunnel established: localhost:" + assignedPort + " -> " + remoteHost + ":" + remotePort);

            while (true) {                

            }
            
        } catch (JSchException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isConnected()) {
                session.disconnect();
                System.out.println("SSH session disconnected");
            }
        }
  
    }
}
