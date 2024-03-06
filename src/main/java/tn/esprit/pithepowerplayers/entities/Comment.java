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
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcomment;
    private String content;
    @Temporal(TemporalType.DATE)
    private Date publishedAt;
    private String image;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private PostBlog postBlog;
    @OneToMany(mappedBy = "comment",cascade = CascadeType.ALL)
    private List<UnderComment> underComments;
}
