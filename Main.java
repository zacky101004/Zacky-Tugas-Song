package TugasLinkedList2;

class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist ini kosong.");
        } else {
            System.out.println("Ini adalah beberapa Playlist Anda");
            System.out.println("==================================");

            Song current = head;
            while (current != null) {
                System.out.println(current.title);
                current = current.next;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong("Porm Queen - Beach Bunny");
        myPlaylist.addSong("YKWIM - Yot Club");
        myPlaylist.addSong("Pluto Projector - Rex Orange County");
        myPlaylist.addSong("Season - Wave to Earth");
        myPlaylist.addSong("Reckless - Madison Beer");
        myPlaylist.addSong("Drunk Text - Henry Moodie");
        System.out.println("==========================================");

        myPlaylist.displayPlaylist();
    }
}
