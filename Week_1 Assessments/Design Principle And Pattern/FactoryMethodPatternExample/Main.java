public class Main {
    public static void main(String[] args) {
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
        DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();

        Document wordDocument = wordDocumentFactory.createDocument();
        wordDocument.open();

        Document pdfDocument = pdfDocumentFactory.createDocument();
        pdfDocument.open();

        Document excelDocument = excelDocumentFactory.createDocument();
        excelDocument.open();

        
        //Opening a Word Document
        //Opening a Pdf Document
        //Opening a Excel Document
        
    }
}
