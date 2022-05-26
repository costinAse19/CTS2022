package memento;

public class FileSnapshot {
    private String content;
    private String commitMessage;

    public FileSnapshot(String content,String commitMessage) {
        this.content = content;
        this.commitMessage = commitMessage;
    }

    @Override
    public String toString() {
        return "FileSnapshot{" +
                "content='" + content + '\'' +
                ", commitMessage='" + commitMessage + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }
}
