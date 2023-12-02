package lab8p2_emilianourtecho;

import java.util.ArrayList;
import javax.swing.JProgressBar;

public class hiloLogin extends Thread{
    private JProgressBar loginP;
    private ArrayList<Usuario> user;
    public hiloLogin(JProgressBar loginP) {
        this.loginP = loginP;
        this.user = new ArrayList();
    }
    
    
    @Override
    public void run() {
        if (!user.isEmpty()) {
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}
