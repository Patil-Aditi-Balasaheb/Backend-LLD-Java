package lecture_assignments.design_patterns_factory.factory_document;

// Concrete class for processing a presentation document
public class PresentationDocumentProcessor extends DocumentProcessor {

    // Constructor for the PresentationDocumentProcessor class
    public PresentationDocumentProcessor(String documentName) {
        super(documentName);
    }

    // Method for getting the type of document the processor supports
    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    // Method for processing the presentaton document
    @Override
    public void processDocument() {
        // Implement presentation document processing logic
        System.out.println("Processing a presentation document: " + getDocumentName());
        // Additional logic for presentation document processing
    }

    // Additional method specific to the presentation document
    public void addSlide() {
        System.out.println("Adding a slide to the presentation.");
    }

}