package edu.panov.spring.hibernate.manytomany.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.awt.Label;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
@NoArgsConstructor
@ToString
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "age")
    @Getter
    @Setter
    private int age;

    @ToString.Exclude
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "children_section",
            // Это то с чем будет связана наша таблица, в которой мы это пишем
            joinColumns = @JoinColumn(name = "child_id"),
            // А тут пишем то что мы хотим получить
            inverseJoinColumns = @JoinColumn(name = "section_id")
    )
    private final List<Section> sections = new ArrayList<>();

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addSectionToChild(Section section) {
        sections.add(section);
    }
}
