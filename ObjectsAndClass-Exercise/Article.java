import java.util.Scanner;

public class Article {
    static class Articles {
        String title;
        String content;
        String author;

        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",
                    this.title,
                    this.content,
                    this.author);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        String title = line[0];
        String content = line[1];
        String author = line[2];
        Articles articles = new Articles(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokent = scanner.nextLine().split(": ");
            String command = tokent[0];
            String parametar = tokent[1];
            if (command.equals("Edit")) {
                articles.setContent(parametar);

            } else if (command.equals("ChangeAuthor")) {
                articles.setAuthor(parametar);

            } else if (command.equals("Rename")) {
                articles.setTitle(parametar);

            }

        }
        System.out.println(articles);


    }
}
