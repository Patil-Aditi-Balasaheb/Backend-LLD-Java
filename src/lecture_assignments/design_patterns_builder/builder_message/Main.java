package lecture_assignments.design_patterns_builder.builder_message;

public class Main {
    public static void main(String[] args) {
        MessageBuilder message = MessageBuilder.getBuilder()
                .setMessageType(MessageType.TEXT)
                .setContent("Hi, there!")
                .setSender("Aditi")
                .setRecipient("Tuba")
                .setDelivered(true)
                .setTimestamp(4654654L)
                .build();

        message.printMessage();
    }
}