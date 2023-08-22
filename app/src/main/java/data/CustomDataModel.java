package data;

public class CustomDataModel {
    private final int image;
    private final String title;

    private final String description;

    public CustomDataModel(int i, String title, String description) {
        this.image = i;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
