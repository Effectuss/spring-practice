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

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sections")
@NoArgsConstructor
@ToString
public class Section {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Setter
    @Getter
    private String name;

    @ToString.Exclude
    @Getter
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "children_section",
            // Это то с чем будет связана наша таблица, в которой мы это пишем
            joinColumns = @JoinColumn(name = "section_id"),
            // А тут пишем то что мы хотим получить
            inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private final List<Child> childrenList = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    public void addChildToSection(Child child) {
        childrenList.add(child);
    }
}
