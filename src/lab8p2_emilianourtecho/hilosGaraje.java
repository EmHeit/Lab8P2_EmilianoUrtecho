package lab8p2_emilianourtecho;

import java.util.List;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class hilosGaraje extends Thread{
    private JTable tablaG;
    private Usuario user;

    public hilosGaraje(JTable tablaG, Usuario user) {
        this.tablaG = tablaG;
        this.user = user;
    }

    @Override
    public void run(){
        
        cargarGaraje();
    }
    
    private void cargarGaraje(){
        List<Carro> garje = user.getCarros();
        DefaultTableModel dtm = (DefaultTableModel) tablaG.getModel();
        for (Carro carro : garje) {
            dtm.addRow(new Object[]{carro.getMarca()});
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            
            }            
        }
    }
}
