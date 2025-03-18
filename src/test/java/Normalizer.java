import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Normalizer {

    private static String normalize(String s) {
        return s;
    }

    @Test
    public void testCompleteURL() {
        String result = Normalizer.normalize("https://example.com:8080/a/b/c");
        assertEquals("https://example.com:8080/a/b/c", result);
    }

    @Test
    public void testMissingProtocol() {
        String result = Normalizer.normalize("example.com:8080/a/b/c");
        assertEquals("http://example.com:8080/a/b/c", result);
    }

    @Test
    public void testMissingPort() {
        String result = Normalizer.normalize("https://example.com/a/b/c");
        assertEquals("https://example.com:80/a/b/c", result);
    }

    @Test
    public void testMissingPath() {
        String result = Normalizer.normalize("https://example.com:8080");
        assertEquals("https://example.com:8080/", result);
    }

    @Test
    public void testOnlyDomain() {
        String result = Normalizer.normalize("example.com");
        assertEquals("http://example.com:80/", result);
    }

    @Test
    public void testEmptyInput() {
        String result = Normalizer.normalize("");
        assertEquals("http://localhost:80/", result);
    }

    @Test
    public void testOnlyProtocol() {
        String result = Normalizer.normalize("https://");
        assertEquals("https://localhost:80/", result);
    }

    @Test
    public void testProtocolAndPort() {
        String result = Normalizer.normalize("https://:3000");
        assertEquals("https://localhost:3000/", result);
    }

    @Test
    public void testDomainAndPath() {
        String result = Normalizer.normalize("example.com/a/b/c");
        assertEquals("http://example.com:80/a/b/c", result);
    }
}
