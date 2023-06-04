public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int numberOfLast;

    public PosterManager() {
        this.numberOfLast = 5;
    }

    public PosterManager(int numberOfLast) {
        this.numberOfLast = numberOfLast;
    }

    public void save(Poster item) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = item;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }

    public Poster[] findLast() {
        int resultLength;
        if (posters.length <= numberOfLast) {
            resultLength = posters.length;
        } else {
            resultLength = numberOfLast;
        }
        Poster[] last = new Poster[resultLength];
        for (int i = 0; i < last.length; i++) {
            last[i] = posters[posters.length - 1 - i];
        }
        return last;
    }

}
