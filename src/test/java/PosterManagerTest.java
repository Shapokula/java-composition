import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    Poster poster1 = new Poster(1, "Русалочка", "фентези");
    Poster poster2 = new Poster(2, "Вызов", "драма");
    Poster poster3 = new Poster(3, "Стражи Галактики", "фантастика");
    Poster poster4 = new Poster(4, "Форсаж", "боевик");
    Poster poster5 = new Poster(5, "До рассвета", "драма");
    Poster poster6 = new Poster(6, "Супербратья Марио", "мильтфильм");
    Poster poster7 = new Poster(7, "Принц пустыни", "приключения");

    @Test
    public void shouldSave() {
        PosterManager posters = new PosterManager();
        posters.save(poster1);
        posters.save(poster2);
        posters.save(poster3);

        Poster[] expected = {poster1, poster2, poster3};
        Poster[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        PosterManager posters = new PosterManager();
        posters.save(poster1);
        posters.save(poster2);
        posters.save(poster3);
        posters.save(poster4);
        posters.save(poster5);
        posters.save(poster6);

        Poster[] expected = {poster6, poster5, poster4, poster3, poster2};
        Poster[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNumberSetManually() {
        PosterManager posters = new PosterManager();
        posters.save(poster1);
        posters.save(poster2);
        posters.save(poster3);
        posters.save(poster4);
        posters.save(poster5);
        posters.save(poster6);

        Poster[] expected = {poster6, poster5, poster4};
        Poster[] actual = posters.findLast(3);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfPostersLessThan5() {
        PosterManager posters = new PosterManager();
        posters.save(poster1);
        posters.save(poster2);
        posters.save(poster3);
        posters.save(poster4);

        Poster[] expected = {poster4, poster3, poster2, poster1};
        Poster[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNumberSetManuallyIfPostersLessThanNumber() {
        PosterManager posters = new PosterManager();
        posters.save(poster1);
        posters.save(poster2);


        Poster[] expected = {poster2, poster1};
        Poster[] actual = posters.findLast(4);

        Assertions.assertArrayEquals(expected, actual);
    }
}