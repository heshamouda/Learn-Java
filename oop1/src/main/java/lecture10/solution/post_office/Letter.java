package lecture10.solution.post_office;

public class Letter extends Item {
    private String letterSize;
    private String message;

    public Letter(Person sender, Person receiver, String letterSize, String message) {
        super(sender, receiver);
        this.letterSize = letterSize;
        this.message = message;
    }

    public String getLetterSize() {
        return letterSize;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Letter - " + getLetterSize() + "\n\r" +
                "From: " + getSender().toString() + "\n\r" +
                "To: " + getReceiver().toString() + "\n\r" +
                "Message: " + getMessage();
    }
}
