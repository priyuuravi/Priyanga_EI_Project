package Exercise1.Structural.DecoratorPattern_NewsFeed;

public class BasicNewsFeed implements NewsFeed {
    @Override
    public String getNews() {
        return "Breaking News: Market opens higher today. Sports: Local team wins championship. Weather: Sunny skies expected.";
    }
}
