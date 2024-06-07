/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BEKUIN;

/**
 *
 * @author asus
 */
public class session {
    
    private static int id_user;
    private static String nama_user;
    private static String username;
    private static String password;
    private static String level;
    
    public static int get_id_user(){
        return id_user;
    }
    
    public static void set_id_user(int id_user){
        session.id_user = id_user;
    }
    
    public static String get_nama_user(){
        return nama_user;
    }
    
    public static void set_nama_user(String nama_user){
        session.nama_user = nama_user;
    }
    
    public static String get_username(){
        return username;
    }
    
    public static void set_username(){
        session.username = username;
    }    
    
    public static String get_password(){
        return password;
    }
    
    public static void set_password(){
        session.password = password;
    }
    
    public static String get_level(){
        return level;
    }
    
    public static void set_level(String level){
        session.level = level;
    }


    
}
