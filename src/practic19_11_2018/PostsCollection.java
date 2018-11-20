package practic19_11_2018;

import java.util.HashSet;
import java.util.Iterator;

public class PostsCollection {
    private HashSet<Post> setPosts = new HashSet<>();
    private HashSet<User> setUsers = new HashSet<>();
    private Iterator<Post> iteratorPost;
    private Iterator<User> iteratorUser;


    public PostsCollection() {
    }

    public PostsCollection(HashSet<Post> setPosts, HashSet<User> setUsers) {
        this.setPosts = setPosts;
        this.setUsers = setUsers;
    }

    public HashSet<Post> getSetPosts() {
        return setPosts;
    }

    public void setSetPosts(HashSet<Post> setPosts) {
        this.setPosts = setPosts;
    }

    public HashSet<User> getSetUsers() {
        return setUsers;
    }

    public void setSetUsers(HashSet<User> setUsers) {
        this.setUsers = setUsers;
    }

    //    methods_____________________________________________________________________________________________________

    //    1. addPost
    public void addPost(String title, String description, String name, String surname, String country, String city) {
        Location location = new Location(country, city);
        if (isUserExist(name, surname)) {
            User user = findUser(name, surname);
            setPosts.add(createPost(title, description, user, location));
        } else {
            User user = new User(name, surname);
            setPosts.add(createPost(title, description, user, location));
            setUsers.add(user);
        }

    }

    //    2. create post (for internal use in this class)
    private Post createPost(String title, String description, User user, Location location) {
        if (description.equals("lookingJob")) {
            PostLookingJob post = new PostLookingJob(title, description, user, location);
            return post;
        } else if (description.equals("offerJob")) {
            PostOfferJob post = new PostOfferJob(title, description, user, location);
            return post;
        }
        return null;
    }

    //    3. is user exist (for internal use in this class)
    private boolean isUserExist(String name, String surname) {
        for (User user : setUsers) {
            if ((user.getName().equals(name)) && (user.getSurname().equals(surname))) {
                return true;
            }
        }
        return false;
    }

    //    4. find user (for internal use in this class)
    private User findUser(String name, String surname) {
        for (User user : setUsers) {
            if ((user.getName().equals(name)) && (user.getSurname().equals(surname))) {
                return user;
            }
        }
        return null;
    }

    //    2. list posts
    public void printPosts() {
//        System.out.println(setPosts);
        for (Post post : setPosts) {
            System.out.println(post.getUser().getSurname() + " " + post.getDescription() + " " + post.getTitle() + " "
                    + post.getLocation().getCity() + " " + post.getLocation().getCountry());
        }

    }


    //    3. list posts by type
    public void prinPostsByType(String description) {
        for (Post post : setPosts) {
            if (post.getClass().getName().equals(description)) {
                System.out.println(post.getUser().getSurname() + " "
                        + post.getDescription() + " " + post.getTitle() + " "
                        + post.getLocation().getCity() + " "
                        + post.getLocation().getCountry());
            } else {
                System.out.println("wrong description!");
            }
        }

    }

    //    4. delete post
    public void delPost(String title, String description, String name, String surname, String country, String city) {
        Post post = new PostOfferJob(title, description, new User(name, surname), new Location(country, city));
        iteratorPost = setPosts.iterator();
        while (iteratorPost.hasNext()) {
            Post next = iteratorPost.next();
            if (next.equals(post)) {
                iteratorPost.remove();
            }
        }
    }

    //    5. find specific post in specific city
    public Post findPost(String title, String description, String city) {
        for (Post post : setPosts) {
            if (post.getLocation().getCity().equals(city)) {
                if ((post.getTitle().equals(title)) && (post.getDescription().equals(description))) {
                    return post;
                }
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "PostsCollection{" +
                "setPosts=" + setPosts +
                ", setUsers=" + setUsers +
                '}';
    }
}

