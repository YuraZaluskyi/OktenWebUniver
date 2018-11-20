package practic19_11_2018;

abstract public class Post {
    private String title;
    private String description;
    private User user;
    private Location location;

    public Post() {
    }

    public Post(String title, String description, User user, Location location) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (getTitle() != null ? !getTitle().equals(post.getTitle()) : post.getTitle() != null) return false;
        if (getDescription() != null ? !getDescription().equals(post.getDescription()) : post.getDescription() != null)
            return false;
        if (getUser() != null ? !getUser().equals(post.getUser()) : post.getUser() != null) return false;
        return getLocation() != null ? getLocation().equals(post.getLocation()) : post.getLocation() == null;
    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", location=" + location +
                '}';
    }
}
