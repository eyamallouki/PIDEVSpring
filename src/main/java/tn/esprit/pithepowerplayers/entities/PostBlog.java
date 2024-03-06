package tn.esprit.pithepowerplayers.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostBlog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpostBlog;
    private String title;
    private String content;
    @Temporal(TemporalType.DATE)
    private Date publishedDate;
    @Enumerated(EnumType.STRING)
    private Category category;
    private Boolean isPublic;
    private String image;
    private String video;


    @OneToMany(mappedBy = "postBlog", cascade = CascadeType.ALL)
    @JsonIgnore
    private  List<LikeP> likePS;
    @OneToMany(mappedBy = "postBlog", cascade = CascadeType.ALL)
    @JsonIgnore
    private  List<Dislike> dislikes;
    @ManyToOne
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "postBlog" ,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Comment> comments;


}




























