/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author alzildan
 */
public class Penjual {
    private Integer id;
    private String nama;
    private boolean Status;
    private Akun akun;
    
    public Penjual() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Akun getAkun() {
        return akun;
    }

    public void setAkun(Akun akun) {
        this.akun = akun;
    }
}
