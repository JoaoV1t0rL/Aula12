/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author Fatec
 */
public class Clientes {
    private int id;
    private String primeiroNome;
    private String ultimoNome;
    
    public static ArrayList<Clientes> pegarLista() throws Exception {
        ArrayList<Clientes> lista = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\Fatec\\chinook.db";
        
        Connection connect = DriverManager.getConnection(url);
        Statement state = connect.createStatement();
        ResultSet rs = state.executeQuery("select * from customers");
        
        while(rs.next()){
            int id = rs.getInt("CustomerId");
            String primeiroNome = rs.getString("FirstName");
            String ultimoNome = rs.getString("LastName");
            Clientes c = new Clientes(id, primeiroNome, ultimoNome);
            lista.add(c);
            }
            
            connect.close();
            state.close();
            rs.close();
            
            return lista;
        }    
    
    public static int pegarContador() throws Exception {
        ArrayList<Clientes> lista = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\Fatec\\chinook.db";
        
        Connection connect = DriverManager.getConnection(url);
        Statement state = connect.createStatement();
        ResultSet rs = state.executeQuery("select count(*) as count from customers");
        
        int cont = 0;
        
        while(rs.next()){
            cont = rs.getInt("cont");
        }
        
        connect.close();
        state.close();
        rs.close();
            
        return cont;
    }

    public Clientes(int id, String primeiroNome, String ultimoNome) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
}
