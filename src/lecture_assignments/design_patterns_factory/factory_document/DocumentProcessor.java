package lecture_assignments.design_patterns_factory.factory_document;

// Abstract class for processing a document
public abstract class DocumentProcessor {

    private String documentName;

    // Constructor for the DocumentProcessor class
    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    // Getter for the document name
    public String getDocumentName() {
        return documentName;
    }

    // Abstract method for getting the type of document the processor supports
    public abstract DocumentType supportsType();

    // Abstract method for processing the document
    public abstract void processDocument();

}