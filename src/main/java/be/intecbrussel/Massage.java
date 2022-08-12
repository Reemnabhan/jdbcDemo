package be.intecbrussel;

import java.util.Objects;

public class Massage {
    private int MessageId;
    private int fromUserId;
    private int toUserId;
    private String messageContent;

    public Massage(int messageId, int fromUserId, int toUserId, String messageContent) {
        MessageId = messageId;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.messageContent = messageContent;
    }

    public Massage() {
    }

    public int getMessageId() {
        return MessageId;
    }

    public void setMessageId(int messageId) {
        MessageId = messageId;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "MessageId=" + MessageId +
                ", fromUserId=" + fromUserId +
                ", toUserId=" + toUserId +
                ", messageContent='" + messageContent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Massage massage = (Massage) o;
        return MessageId == massage.MessageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MessageId);
    }
}
