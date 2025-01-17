package at.ac.tgm.student.eoezcan2;

public class WordCard {

    private String url;
    private String word;

    public WordCard(String url, String word) {
        // Check if URL is an image
        setUrl(url);
        setWord(word);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if(!url.endsWith(".png") && !url.endsWith(".jpg") && !url.endsWith(".jpeg")) {
            throw new IllegalArgumentException("URL is not an image!");
        }
        this.url = url;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String toString() {
        return this.word + ":" + this.url;
    }

}
