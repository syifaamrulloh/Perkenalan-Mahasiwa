/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan31.perkenalan.mahasiswa;

/**
 *
 * @author
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk menampilkan perkenalan Mahasiswa
 * dengan konsep Objek
 */
public class Mahasiswa {
    //Atribute
    public String nama,nim;
    //Behavior
    public void perkenalkanDiri(){
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " + nim);
        System.out.println("My Name is " + nama + "\n");
    }
    
    public static void main(String[] args) {
        Mahasiswa dt1 = new Mahasiswa();
        dt1.nama = "Rizki Adam Kurniawan";
        dt1.nim  = "10110269";
        dt1.perkenalkanDiri();
        
        Mahasiswa dt2 = new Mahasiswa();
        dt2.nama = "Indra Tiola";
        dt2.nim  = "10110270";
        dt2.perkenalkanDiri();
        
        Mahasiswa dt3 = new Mahasiswa();
        dt3.nama = "Robi Tanzil Ganefi";
        dt3.nim  = "10110271";
        dt3.perkenalkanDiri();
        
        Mahasiswa dt4 = new Mahasiswa();
        dt4.nama = "Muhammad Nur Awaludin";
        dt4.nim  = "10110269";
        dt4.perkenalkanDiri();
    }
    
}
