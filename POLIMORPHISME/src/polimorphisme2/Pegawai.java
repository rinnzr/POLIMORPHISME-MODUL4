/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme2;

/**
 *
 * @author orinz
 */
public class Pegawai {
    String nama; 
    int gaji; 
    Pegawai(){
    }
    Pegawai (String nm){
        this.nama=nm; 
        System.out.println("pegawai");
    }
    public int gaji(){
        return 0; 
    }
}
