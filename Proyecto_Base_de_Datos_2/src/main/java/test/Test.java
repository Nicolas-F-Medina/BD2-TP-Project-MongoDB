package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import bd_MongoBD2TP.Cliente;
import bd_MongoBD2TP.Domicilio;

public class Test {
  public static void main(String[] args) {
    try {
      ObjectMapper mapeador = new ObjectMapper();
     
      //Creacion de Objetos
      	//Clientes 
      
      	//Empleados
      
      	//Sucursales
      
      	//Productos
      
      	//Domicilios
      
      	//Ventas
      
      //Carga de objetos a la lista
      	
      
      //Practica de creacion (Eliminar mas tarde)
      File archivo= new File("miarchivojson.json");
      List<Object> listliente=new ArrayList<Object>();
      listliente.add(new Cliente(20, "Nicolas", "Medina", new Domicilio(1, "Las Americas", 713, "Guernica", "Buenos Aires"), "IOMA", 1001));
      listliente.add(new Cliente(21, "Agustin", "LopezDuamante", new Domicilio(2, "Las Americas", 713, "Guernica", "Buenos Aires"), "IOMA", 1002));
      mapeador.writerWithDefaultPrettyPrinter().writeValue(archivo, listliente);
    
    } catch (IOException e) {
   
      e.printStackTrace();
    }
  }
}