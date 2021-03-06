/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;
import Controller.ControllerFechas;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Date;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teté
 */
public class ReportesPDF {
    java.awt.Font fuente = new java.awt.Font("Normal", Font.BOLD, 12);
    Color grisClaro = new Color(230, 230, 230);
    Color azulClaro = new Color(124, 195, 255);
    PdfWriter writer;
    String strRotuloPDF;
    private String[] rotulosColumnas;
    private static int numReport;
    private float[] anchosFilas;
    

    //Metodo principal del ejemplo
    public void GenerarPDF(ArrayList components, int numReport) {
        this.rotulosColumnas = (String[])components.get(0);
        this.anchosFilas = (float[])components.get(1);
        this.numReport = numReport;
        
        String ruta = verificaReporte(numReport);
        try { //Hoja tamaño carta, rotarla (cambiar a horizontal)
            System.out.println(ruta);
            OutputStream file = new FileOutputStream(ruta);
            Document documento = new Document(PageSize.LETTER, 20, 20, 20, 20);
            PdfWriter.getInstance(documento, file);
            documento.open();
            agregarContenido(documento);
            agregarMetaDatos(documento);
            documento.add(new Paragraph(new Date().toString()));
            documento.close();
            JOptionPane.showMessageDialog(null, "Se ha creado!\nSu archivo es:\n" + ruta);
        } catch (FileNotFoundException | DocumentException | HeadlessException e) {
            e.getMessage();
        }
    }

    //agrega el contenido del documento; para este ejemplo agrega una tabla con datos y una imagen
    //Espera como entrada el documento donde agregara el contenido
    private void agregarContenido(Document document){
        Paragraph ParrafoHoja = new Paragraph();
        // AGREGAMOS LA IMAGEN
        try {
            Image foto = Image.getInstance(getClass().getResource("/Image/logoAnaIS_1.png"));
            foto.scaleToFit(40, 40);
            ParrafoHoja.add(foto);
        } catch (BadElementException | IOException e) {
            e.getMessage();
        }
        //Agregar  lineas en blanco
        agregarLineasEnBlanco(ParrafoHoja, 1);
        agregarTabla(ParrafoHoja);
        try {
            document.add(ParrafoHoja);
        } catch (DocumentException ex) {
            Logger.getLogger(ReportesPDF.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Se conecta la DB , obtiene los datos de la tabla (SELECT) y los acomoda en una tabla JTable de iText.
    // Espera como entrada el parrafo donde agregara la tabla
    public void agregarTabla(Paragraph parrafo){
        //Anchos de las columnas
        PdfPTable tabla = new PdfPTable(anchosFilas);
        // Porcentaje que ocupa a lo ancho de la pagina del PDF
        tabla.setWidthPercentage(90);
        //Alineacion horizontal centrada
        tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
        //agregar celda que ocupa las  columnas de los rotulos
         PdfPCell cell0 = new PdfPCell(new Paragraph("Repostería AnaIs"));
        cell0.setColspan(anchosFilas.length);
        cell0.setBackgroundColor(new BaseColor (66,139,202));
        //Centrar contenido de celda
        cell0.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell = new PdfPCell(new Paragraph(tituloReporte()));
        cell.setColspan(anchosFilas.length);
        cell.setBackgroundColor(new BaseColor (49,176,213));
        //Centrar contenido de celda
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        //Color de fondo de la celda     
        tabla.addCell(cell0);
        tabla.addCell(cell);
            // Mostrar los rotulos de las columnas
            for (int i = 0; i < rotulosColumnas.length; i++) {
                cell = new PdfPCell(new Paragraph(rotulosColumnas[i]));
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(new BaseColor (248,248,248));
                tabla.addCell(cell);
            }
            switch(numReport){
                case 1:DataBase.DataBasePDF.pdfVendedores(cell, tabla);break;
                case 2:DataBase.DataBasePDF.pdfProveedores(cell, tabla);break;
                case 3:DataBase.DataBasePDF.pdfClientes(cell, tabla);break;
                case 4:DataBase.DataBasePDF.pdfVentas(cell, tabla);break;
                case 5:DataBase.DataBasePDF.pdfProductos(cell, tabla);break;
                case 6:DataBase.DataBasePDF.pdfPedidos(cell, tabla); break;
            }
            
        //Agregar la tabla con los datos al parrafo que nos llego como entrada
        parrafo.add(tabla);
    }  //Fin del metodo que crea la tabla

    //Agrega las lineas en blanco  especificadas a un parrafo especificado
    private static void agregarLineasEnBlanco(Paragraph parrafo, int nLineas) {
        for (int i = 0; i < nLineas; i++) {
            parrafo.add(new Paragraph(" "));
        }
    }

    //Agrega los metadatos del documento
    //Titulo, Asunto, Palabras clave, Autor
    private static void agregarMetaDatos(Document document) {
        document.addTitle("Reporte de Ventas");
        document.addSubject("Repostería AnaIs");
        document.addKeywords("Line by Line");
        document.addAuthor("Line by Line");
    }
    
    private static String verificaReporte(int numReporte){
        String nomReporte = "";
        switch (numReporte) {
            case 1:nomReporte = "Vendedor";break;
            case 2:nomReporte = "Proveedor";break;
            case 3:nomReporte = "Clientes";break;
            case 4:nomReporte = "Ventas";break;
            case 5:nomReporte = "Productos";break;
            case 6:nomReporte = "Pedidos";break;
        }
        return System.getProperty("user.dir")+ System.getProperty("file.separator") 
                           + "reports"+System.getProperty("file.separator")+nomReporte+ControllerFechas.getFechaActual()+".pdf";
    }
    
    private static String tituloReporte(){
        String nomReporte = "";
        switch (numReport) {
            case 1:nomReporte = "Relación de vendedores";break;
            case 2:nomReporte = "Relación de Proveedores";break;
            case 3:nomReporte = "Relación de Clientes";break;
            case 4:nomReporte = "Reporte de Ventas";break;
            case 5:nomReporte = "Relación de Productos";break;
            case 6:nomReporte = "Relación de Pedidos";break;
        }
        return nomReporte;
    }
    
    
}
