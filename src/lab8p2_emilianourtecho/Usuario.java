package lab8p2_emilianourtecho;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombreU;
    private String nombreOG;
    private String correo;
    private String pais;
    private String fecha;
    private String password;
    
    //Constructor
    public Usuario() {
    }

    public Usuario(String nombreU, String nombreOG, String pais, String password) {
        this.nombreU = nombreU;
        this.nombreOG = nombreOG;
        this.correo = correo;
        this.pais = pais;
        this.fecha = fecha;
        this.password = password;
    }
    
    
//GETTERS
    public String getNombreU() {
        return nombreU;
    }

    public String getNombreOG() {
        return nombreOG;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPais() {
        return pais;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPassword() {
        return password;
    }

    
    
    @Override
    public String toString() {
        return "User: "+ nombreU;
    }
    
    
}
