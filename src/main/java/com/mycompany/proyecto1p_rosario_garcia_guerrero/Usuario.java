package com.mycompany.proyecto1p_rosario_garcia_guerrero;

public class Usuario extends Sistema{

   protected String cedula;
   protected String nombres;
   protected int edad;
   protected String mail;
   protected String user;
   protected String password;
   protected char rol;

   public Usuario(String cedula, String nombres, int edad, String mail, String user, String password, char rol){
    super(listaUsuario);
    this.cedula = cedula;
    this.nombres = nombres;
    this.edad = edad;
    this.mail = mail;
    this.user = user;
    this.password = password;
    this.rol = rol;
   }
    
   Cliente cliente = new Cliente (cedula, nombres, edad, mail, user, password, rol, numTarjeta);
   ClienteVIP clienteVip = new ClienteVIP (nombres, edad, mail, user, password, rol, numTarjeta, tipoVIP, millas);
   Operador operador = new Operador (nombres, edad, mail, user, password, rol, sueldo);

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }
    
    public String consultarReserva(){
        
    }
  
   public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
