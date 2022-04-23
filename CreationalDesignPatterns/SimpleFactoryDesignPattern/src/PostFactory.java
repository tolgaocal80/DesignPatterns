public class PostFactory {

    public static Post createPost(String type){
        type = type.toLowerCase();
        return switch (type) {
            case "blog" -> new BlogPost();
            case "product" -> new ProductPost();
            case "news" -> new NewsPost();
            default -> throw new IllegalArgumentException("Post type is unknown");
        };
    }

}
