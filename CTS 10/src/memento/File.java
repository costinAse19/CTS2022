package memento;

public class File {
    private String content;
    private String name;

    public String getContent() {
        return content;
    }

    public File(String content, String name) {
        this.content = content;
        this.name = name;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public FileSnapshot createSnapshot(String message){
        return new FileSnapshot(this.content,message);
    }
    public void print(){
        System.out.println("File, name: "+name+", content: "+content);
    }
    public void restoreFileContent(FileSnapshot fileSnapshot){
        if(fileSnapshot!=null)
            this.content = fileSnapshot.getContent();
    }
}
