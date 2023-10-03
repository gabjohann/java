package exercicio01;

public class Livro {
    private  String title;
    private String category;

    public Livro(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "título: " + getTitle() + ", categoria: " + getCategory() + ",";
    }
}
