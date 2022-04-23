public class Client {

    // Client is the class where is the main method placed.

    public static void main(String[] args) {
        Post post = PostFactory.createPost("Blog");
        System.out.println(post);

    }
}
