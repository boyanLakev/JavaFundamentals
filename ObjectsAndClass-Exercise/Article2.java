import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Article2 {
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


        List<Articles>  list=new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] line = scanner.nextLine().split(", ");
            String title = line[0];
            String content = line[1];
            String author = line[2];
            Articles articles = new Articles(title, content, author);
            list.add(articles);


        }
        String criteria=scanner.nextLine();
        if (criteria.equals("title")){
            list.sort((a , b)->a.getTitle().compareTo(b.getTitle()));
        }else if(criteria.equals("content")){
            list.sort((a,b)->a.getContent().compareTo(b.getContent()));

        }else {
            list.sort((a,b)->a.getAuthor().compareTo(b.getAuthor()));

        }
        for (Articles a:list){
            System.out.println(a.toString());
        }


    }
}
