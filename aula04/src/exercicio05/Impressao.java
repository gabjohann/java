package exercicio05;

public class Impressao {
    private String username;
    private int numPages;

    public Impressao(String username, int numPages) {
        this.username = username;
        this.numPages = numPages;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Nome: " + username + " Núm. pages: " + numPages;
    }
}
