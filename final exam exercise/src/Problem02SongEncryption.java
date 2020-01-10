import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02SongEncryption {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] artistSong = line.split(":");
            String artist = artistSong[0];
            String song = artistSong[1];
            Pattern pattern = Pattern.compile("^[A-Z][a-z' ]+$");
            Matcher mather = pattern.matcher(artist);
            if (mather.find()) {
                pattern = Pattern.compile("^[A-Z ]+$");
                mather = pattern.matcher(song);
                if (mather.find()) {
                    int key = artist.length() % ('z' - 'a' + 1);
                    StringBuilder artistBuider = new StringBuilder();
                    StringBuilder songBuider = new StringBuilder();
                    for (int i = 0; i < artist.length(); i++) {
                        char ch = artist.charAt(i);
                        int intCh = ch + key;
                        if (!(ch == ' ' || ch == '\'')) {
                            if (Character.isLowerCase(ch)) {
                                if (intCh > (int) 'z') {
                                    intCh = intCh - ('z' - 'a' + 1);
                                    ch = (char) intCh;
                                } else {
                                    ch = (char) intCh;
                                }
                            } else if (Character.isUpperCase(ch)) {
                                if (intCh > (int) 'Z') {
                                    intCh = intCh - ('z' - 'a' + 1);
                                    ch = (char) intCh;
                                } else {
                                    ch = (char) intCh;
                                }

                            }

                        }

                        artistBuider = artistBuider.append(ch);

                    }
                    for (int i = 0; i < song.length(); i++) {
                        char ch = song.charAt(i);
                        int intCh = ch + key;
                        if (!(ch == ' ' || ch == '\'')) {
                            if (intCh > (int) 'Z') {
                                intCh = intCh - ('z' - 'a' + 1);
                                ch = (char) intCh;
                            } else {
                                ch = (char) intCh;
                            }
                        }

                        songBuider = songBuider.append(ch);

                    }
                    String result = artistBuider + "@" + songBuider;
                    System.out.println("Successful encryption: " + result);
                    //
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
