package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastUrlIndex = urls.size() - 1;
        var lastUrl = urls.get(lastUrlIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public Iterator<String> createIterator() {
        return new ArrayListIterator(this);
    }

    public class ArrayListIterator implements Iterator<String> {
        private BrowserHistory history;
        private int index;

        public ArrayListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }

    }
}
