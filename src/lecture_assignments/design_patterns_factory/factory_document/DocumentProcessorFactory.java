package lecture_assignments.design_patterns_factory.factory_document;

// Factory class for creating document processors
public class DocumentProcessorFactory {

    // Factory method for creating the appropriate document processor based on the
    // document type
    public static DocumentProcessor createProcessor(DocumentType type, String documentName) {
        if (type == DocumentType.TEXT) {
            return new TextDocumentProcessor(documentName);
        } else if (type == DocumentType.PRESENTATION) {
            return new PresentationDocumentProcessor(documentName);
        } else if (type == DocumentType.SPREAD_SHEET) {
            return new SpreadsheetDocumentProcessor(documentName);
        }
        return null;
    }

}