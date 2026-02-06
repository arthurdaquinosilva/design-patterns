import strategy.BlackAndWhiteFilter;
import strategy.ImageStorage;
import strategy.JPEGCompressor;

public class Main {
    public static void main(String[] args) {
        var jpegCompressor = new JPEGCompressor();
        var blackAndWhiteFilter = new BlackAndWhiteFilter();
        var imageStorage = new ImageStorage(jpegCompressor, blackAndWhiteFilter);

        imageStorage.store("somefilename.jpeg");
    }
}
