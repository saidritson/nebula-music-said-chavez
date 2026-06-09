package com.example.nebulamusic.Model;

public class Usuario {
    private String nombre;
    private String correo;
    private String password;
    private String txt_pseudonimo;
    private String rad_genero;
    private String selec_suscription;
    private String fechaNacimiento;
    private String checkTerminos;
    private String comentarios;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String password, String txt_pseudonimo,
                   String rad_genero, String selec_suscription, String fechaNacimiento,
                   String checkTerminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.txt_pseudonimo = txt_pseudonimo;
        this.rad_genero = rad_genero;
        this.selec_suscription = selec_suscription;
        this.fechaNacimiento = fechaNacimiento;
        this.checkTerminos = checkTerminos;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTxt_pseudonimo() {
        return txt_pseudonimo;
    }

    public void setTxt_pseudonimo(String txt_pseudonimo) {
        this.txt_pseudonimo = txt_pseudonimo;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getSelec_suscription() {
        return selec_suscription;
    }

    public void setSelec_suscription(String selec_suscription) {
        this.selec_suscription = selec_suscription;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCheckTerminos() {
        return checkTerminos;
    }

    public void setCheckTerminos(String checkTerminos) {
        this.checkTerminos = checkTerminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }


}
