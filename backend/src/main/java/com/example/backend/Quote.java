package com.example.backend;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class Quote {
    @Id
    private Long id;
    @Parent @Load
    private Ref<Author> author;

    public Quote() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuther() {
        return author.get();
    }

    public void setAuther(Author author) {
        this.author = Ref.create(author);
        if(getAuther() == null){
            new AutherEndpoint().insert(author);
        }
    }
}