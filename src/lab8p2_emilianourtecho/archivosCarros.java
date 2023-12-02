package lab8p2_emilianourtecho;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class archivosCarros {
    
    public void guardarCarro(List<Carro> carro, String archivoC){
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(archivoC))){
            output.writeObject(carro);
            
        } catch (Exception e) {
        }
    }
    
    public static List<Carro> cargarCarro(String archivoC){
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(archivoC))){
            return (List<Carro>) input.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
