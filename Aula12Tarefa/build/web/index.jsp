<%-- 
    Document   : index
    Created on : 9 de mai. de 2022, 16:18:13
    Author     : Fatec
--%>
<%
    Exception requestEx = null;
    ArrayList<Clientes> lista = new ArrayList<>();
    
    int cont = 0;
    try{
        cont = Clientes.pegarContador();
        lista = Clientes.pegarLista();
    }catch(Exception e){
        requestEx = e;
    }
%>
<%@page import="pacote.Clientes"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h3>João Vitor Lourenço | RA: 1290482022015</h3>
        <hr>
        <h1>Total de Clientes e Funcionarios</h1>
        <h2>Clientes: </h2>
        <h2><%= cont %></h2>
        
        <h2>Funcionarios: </h2>
        <% %>
    </body>
</html>
