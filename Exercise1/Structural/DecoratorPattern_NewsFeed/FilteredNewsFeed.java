package Exercise1.Structural.DecoratorPattern_NewsFeed;

public class FilteredNewsFeed extends NewsFeedDecorator {
    private String keyword;

    public FilteredNewsFeed(NewsFeed newsFeed, String keyword) {
        super(newsFeed);
        this.keyword = keyword;
    }

    @Override
    public String getNews() {
        String news = super.getNews();
        if (news.contains(keyword)) {
            return "[FILTERED] " + news;
        } else {
            return news;
        }
    }
}
