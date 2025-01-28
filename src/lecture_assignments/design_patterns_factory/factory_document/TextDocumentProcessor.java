package lecture_assignments.design_patterns_factory.factory_document;

// Concrete class for processing a text document
public class TextDocumentProcessor extends DocumentProcessor {

    // Constructor for the TextDocumentProcessor class
    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    // Method for getting the type of document the processor supports
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    // Method for processing the text document
    @Override
    public void processDocument() {
        // Implement text document processing logic
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }

}