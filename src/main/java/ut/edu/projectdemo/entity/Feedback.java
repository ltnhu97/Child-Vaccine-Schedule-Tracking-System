package ut.edu.projectdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String comments;
    private int rating;

    // Getters:

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getComments() {
        return comments;
    }

    public int getRating() {
        return rating;
    }

    // Setters:

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
