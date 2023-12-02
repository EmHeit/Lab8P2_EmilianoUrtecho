package lab8p2_emilianourtecho;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class archivosUsuarios {
    private List<Usuario> user;
    private String archivoU;

    public archivosUsuarios(String archivoU) {
        this.archivoU = archivoU;
    }
    
    
    
    public void AgregarUsuario(Usuario u){
        user.add(u);
        guardarUsuario();
    }
    public Usuario BuscarUsuarios(String nombreU){
        for (Usuario usuario : user) {
            if (usuario.getNombreU().equals(nombreU)) {
                return usuario;
            }
        }
        return null;
    }
    
    private void guardarUsuario(){
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(archivoU))){
            output.writeObject(user);
        } catch (Exception e) {
            
        }
    }
    
    private List<Usuario> cargarUsuario(){
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(archivoU))){
            return (List<Usuario>) input.readObject();
        } catch (Exception e) {
            return new ArrayList();
        }
    }
}
