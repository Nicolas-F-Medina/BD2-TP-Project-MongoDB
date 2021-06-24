package test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.text.Document;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.google.gson.Gson;

import bd_MongoBD2TP.Cliente;
import bd_MongoBD2TP.Domicilio;
import bd_MongoBD2TP.Empleado;
import bd_MongoBD2TP.Producto;
import bd_MongoBD2TP.Sucursal;
import bd_MongoBD2TP.Venta;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Test {
  public static void main(String[] args) {
    try {
    MongoClient mongoClient= new MongoClient();
    DB database = mongoClient.getDB("Farmacia"); //Esta Bd tiene que existir previamente en Mongo, antes de ejecutar todo el Codigo
      ObjectMapper mapeador = new ObjectMapper();
     
      //Creacion de Objetos
      	//Domicilios
			Domicilio domicilio1= new Domicilio(1, "Las Americas", 1234, "Guernica", "Buenos Aires");
			Domicilio domicilio2= new Domicilio(2, "Fournier", 4567, "Ezeiza", "Buenos Aires");
			Domicilio domicilio3= new Domicilio(3, "Dorrego", 7891, "Monte Grande", "Buenos Aires");
			Domicilio domicilio4= new Domicilio(4, "Alem", 2345, "Lomas de Zamora", "Buenos Aires");
			Domicilio domicilio5= new Domicilio(4, "San Lorenzo", 245, "Adrogue", "Buenos Aires");
			Domicilio domicilio6= new Domicilio(4, "Ugarte", 235, "Marmol", "Buenos Aires");
			Domicilio domicilio7= new Domicilio(4, "Fico", 234, "Merlo", "Buenos Aires");
			Domicilio domicilio8= new Domicilio(4, "Yrigoyen", 345, "Belgrano", "Buenos Aires");
			Domicilio domicilio9= new Domicilio(4, "Belgrano", 1345, "CABA", "Buenos Aires");
			Domicilio domicilio10= new Domicilio(4, "Florida", 45, "Lomitas", "Buenos Aires");
      	//Sucursales
			Sucursal sucursal1= new Sucursal(1, domicilio10);
			Sucursal sucursal2= new Sucursal(2, domicilio9);
		//Empleados
      		Empleado empleado1= new Empleado(1472, 12, "Julian", "Jesus", domicilio5, true, "Ioma", 45, sucursal1);
      		Empleado empleado2= new Empleado(5836, 13, "Jose", "Lopez", domicilio6, false, "Swiss Medical", 787, sucursal2);
      		Empleado empleado3= new Empleado(9147, 14, "Julio", "Buen Dia", domicilio7, false, "Swiss Medical", 454555, sucursal1);
      		Empleado empleado4= new Empleado(2583, 15, "Jorge", "Malon", domicilio8, true, "Swiss Medical", 7899, sucursal2);
      	//Productos
      		Producto producto1= new Producto(000123000, "Laboratorio", "Astrazeneca", 750, "George SA");
      		Producto producto2= new Producto(000456000, "Laboratorio", "Sinopharm", 900, "George SA");
      		Producto producto3= new Producto(789000, "Perfumeria", "Talco", 1200, "Sulyvan SRL");
      		Producto producto4= new Producto(000147000, "Pefumeria", "Desodorante", 800, "Cuchurrumin SRL");
      		Producto producto5= new Producto(258000, "Laboratorio", "Sputnik v", 3250, "Igor S.A");
      		Producto producto6= new Producto(258030, "Pefumeria", "Perfume Femenino", 320, "Bogues");
      		
      		List<Producto> listaventa1=new ArrayList<Producto>();
      		List<Producto> listaventa2=new ArrayList<Producto>();
      		List<Producto> listaventa3=new ArrayList<Producto>();
      		List<Producto> listaventa4=new ArrayList<Producto>();
      		List<Producto> listaventa5=new ArrayList<Producto>();
      		
      		
      		listaventa1.add(producto1);			listaventa3.add(producto6);
      		listaventa1.add(producto3);			
      		listaventa1.add(producto2);			listaventa4.add(producto5);
      											listaventa4.add(producto5);
      		listaventa2.add(producto4);			listaventa4.add(producto5);
      		listaventa2.add(producto4);
      		listaventa2.add(producto4);			listaventa5.add(producto6);
      		
      	//Clientes 
      		Cliente cliente1= new Cliente(1, "Nicolas", "Romero", domicilio1, "Ioma", 1001);
      		Cliente cliente3= new Cliente(2, "Agustin", "Gonzales", domicilio2, "Ospe", 1987);
      		Cliente cliente4= new Cliente(3, "Nicolas", "Rodriguez", domicilio3, "Femeba", 4588);
      		Cliente cliente5= new Cliente(4, "Lisandro", "Ferreira", domicilio4, "Ioma", 1002);
      		Cliente cliente2= new Cliente(5, "Aylen", "Fernandez", domicilio3, "Osmedica", 874);
      	//Ventas
      		Venta venta1= new Venta("1", LocalDate.of(2021, 7, 14), empleado1, empleado3, cliente1, "Efectivo",listaventa1);
      		Venta venta2= new Venta("2", LocalDate.of(2021, 7, 14), empleado2, empleado4, cliente2, "Cheque",listaventa2);
      		Venta venta3= new Venta("3", LocalDate.of(2021, 7, 14), empleado1, empleado1, cliente3, "Efectivo",listaventa3);
      		Venta venta4= new Venta("4", LocalDate.of(2021, 7, 14), empleado1, empleado3, cliente1, "Mercado Pago",listaventa4);
      		Venta venta5= new Venta("5", LocalDate.of(2021, 7, 14), empleado1, empleado3, cliente1, "Efectivo",listaventa5);
      		Venta venta6= new Venta("6", LocalDate.of(2021, 7, 14), empleado1, empleado1, cliente1, "Modo",listaventa4);
      		Venta venta7= new Venta("7", LocalDate.of(2021, 7, 14), empleado2, empleado4, cliente4, "Efectivo",listaventa2);
      		Venta venta8= new Venta("8", LocalDate.of(2021, 7, 14), empleado4, empleado4, cliente1, "Efectivo",listaventa1);
      		Venta venta9= new Venta("9", LocalDate.of(2021, 7, 14), empleado2, empleado2, cliente2, "Transferecia",listaventa4);
      		
      //Carga de objetos a la lista
		JSR310Module module = new JSR310Module();
		module.addSerializer(new bd_MongoBD2TP.LocalDateSerializer(LocalDate.class));
		module.addDeserializer(LocalDate.class, new bd_MongoBD2TP.LocalDateDeserializer());
      
      File archivo= new File("Archivo-Clases.json");
      List<Object> listDatos=new ArrayList<Object>();
      mapeador.registerModule(module);
      mapeador.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
      //Cargo Domicilios
      listDatos.add(domicilio1);
      listDatos.add(domicilio2);
      listDatos.add(domicilio3);
      listDatos.add(domicilio4);
      listDatos.add(domicilio5);
      listDatos.add(domicilio6);
      listDatos.add(domicilio7);
      listDatos.add(domicilio8);
      listDatos.add(domicilio9);
      listDatos.add(domicilio10);
      //Cargo Sucursales
      listDatos.add(sucursal1);
      listDatos.add(sucursal2);
      //Cargo Empleados
      listDatos.add(empleado1);
      listDatos.add(empleado2);
      listDatos.add(empleado3);
      listDatos.add(empleado4);
      //Cargo Productos
      listDatos.add(producto1);
      listDatos.add(producto2);
      listDatos.add(producto3);
      listDatos.add(producto4);
      listDatos.add(producto5);
      listDatos.add(producto6);
      //Cargo Clientes
      listDatos.add(cliente1);
      listDatos.add(cliente2);
      listDatos.add(cliente3);
      listDatos.add(cliente4);
      listDatos.add(cliente5);
      //Cargo Ventas
      listDatos.add(venta1);
      listDatos.add(venta2);
      listDatos.add(venta3);
      listDatos.add(venta4);
      listDatos.add(venta5);
      listDatos.add(venta6);
      listDatos.add(venta7);
      listDatos.add(venta8);
      listDatos.add(venta9);
      //Mapeo todos los Datos y almaceno en el archivo json
      mapeador.writerWithDefaultPrettyPrinter().writeValue(archivo, listDatos);
    System.out.println("Finalizo la Creacion del Archivo Json");
    
    //Inicio de la Conexion a MongoDB
    
	
	DBCollection collection = database.getCollection("Ventas");
		
		//Creacion de Documentos de Ventas
	BasicDBObject documento1 = new BasicDBObject();
	BasicDBObject documento2 = new BasicDBObject();
	BasicDBObject documento3 = new BasicDBObject();
	BasicDBObject documento4 = new BasicDBObject();
	BasicDBObject documento5 = new BasicDBObject();
	BasicDBObject documento6 = new BasicDBObject();
	BasicDBObject documento7 = new BasicDBObject();
	BasicDBObject documento8 = new BasicDBObject();
	BasicDBObject documento9 = new BasicDBObject();
	
		//Cargo Datos a los Documentos de Ventas
	Gson gson=new Gson();
	String vent1= gson.toJson(venta1);
	String vent2= gson.toJson(venta2);
	String vent3= gson.toJson(venta3);
	String vent4= gson.toJson(venta4);
	String vent5= gson.toJson(venta5);
	String vent6= gson.toJson(venta6);
	String vent7= gson.toJson(venta7);
	String vent8= gson.toJson(venta8);
	String vent9= gson.toJson(venta9);
	
	documento1.put("Info", vent1);
	documento2.put("Info", vent2);
	documento3.put("Info", vent3);
	documento4.put("Info", vent4);
	documento5.put("Info", vent5);
	documento6.put("Info", vent6);
	documento7.put("Info", vent7);
	documento8.put("Info", vent8);
	documento9.put("Info", vent9);
	
	
		//Insercion de Documentos a la Base de Datos
		
	collection.insert(documento1);
	collection.insert(documento2);
	collection.insert(documento3);
	collection.insert(documento4);
	collection.insert(documento5);
	collection.insert(documento6);
	collection.insert(documento7);
	collection.insert(documento8);
	collection.insert(documento9);
	
	//Fin de la Conexion a MongoDB
    mongoClient.close();
    } catch (IOException e) {
   
      e.printStackTrace();
    }
    
  
	
	
	
	
  }
}