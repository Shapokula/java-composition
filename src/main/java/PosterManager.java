public class PosterManager {
    private Poster[] posters = new Poster[0];

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
        if (posters.length <= 5) {
            resultLength = posters.length;
        } else {
            resultLength = 5;
        }
        Poster[] last = new Poster[resultLength];
        for (int i = 0; i < last.length; i++) {
            last[i] = posters[posters.length - 1 - i];
        }
        return last;
    }


    public Poster[] findLast(int numberOfPosters) {

        int resultLength;
        if (posters.length <= numberOfPosters) {
            resultLength = posters.length;
        } else {
            resultLength = numberOfPosters;
        }
        Poster[] last = new Poster[resultLength];
        for (int i = 0; i < last.length; i++) {
            last[i] = posters[posters.length - 1 - i];
        }
        return last;
    }

}
