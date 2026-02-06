import iterator.BrowserHistory;
import iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        var browserHistory = new BrowserHistory();
        browserHistory.push("https://url1.com");
        browserHistory.push("https://url2.com");
        browserHistory.push("https://url3.com");

        Iterator<String> iterator = browserHistory.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println("url: " + url);
            iterator.next();
        }
    }
}
