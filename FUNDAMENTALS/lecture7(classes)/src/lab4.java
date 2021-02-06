import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lab4 {
    static class Song {
        String type;
        String name;
        String time;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];
            Song song = new Song();
            song.setType(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);
        }
        String type = scanner.nextLine();
        if (type.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getType().equals(type)) {
                    System.out.println(song.getName());
                }

            }
        }
      //  List<Song> filtersong = songs.stream().filter(e -> e.getType().equals(type)).collect(Collectors.toList());
        //for (Song song : filtersong) {
          //  System.out.println(song.getName());
        //}
    }
}
