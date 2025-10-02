package Exercise1.Structural.DecoratorPattern_NewsFeed;

public abstract class NewsFeedDecorator implements NewsFeed {
    protected NewsFeed wrappedNewsFeed;

    public NewsFeedDecorator(NewsFeed newsFeed) {
        this.wrappedNewsFeed = newsFeed;
    }

    @Override
    public String getNews() {
        return wrappedNewsFeed.getNews();
    }
}
