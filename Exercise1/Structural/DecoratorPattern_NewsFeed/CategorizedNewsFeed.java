package Exercise1.Structural.DecoratorPattern_NewsFeed;

public class CategorizedNewsFeed extends NewsFeedDecorator {
    private String category;

    public CategorizedNewsFeed(NewsFeed newsFeed, String category) {
        super(newsFeed);
        this.category = category;
    }

    @Override
    public String getNews() {
        return "[" + category + "] " + super.getNews();
    }
}
