package lab8p2_emilianourtecho;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class hiloLogin extends Thread{
    private JProgressBar loginP;
    private ArrayList<Usuario> user;
    private String nombreU;
    
    public hiloLogin(String nombreU, JProgressBar loginP) {
        this.loginP = loginP;
        this.user = new ArrayList();
        this.nombreU = nombreU;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < user.size(); i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            int aumento = (i+1) * 100 / user.size();
            loginP.setValue(aumento);
            if (user.get(i).getNombreU().equals(nombreU)) {
                loginP.setValue(0);
                return;
            }
        }
        loginP.setValue(0);
        JOptionPane.showMessageDialog(null, "No se encontro el usuario, vuelva a intentarlo");
    }
    
}
