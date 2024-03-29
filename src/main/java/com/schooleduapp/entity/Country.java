package com.schooleduapp.entity;

import com.schooleduapp.entity.audit.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Getter
@Setter
public class Country extends Auditable
{
    @Id
    @Size(min = 3, max = 3)
    private String code;

    private String name;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private Set<City> cities;

    private String continentName;
}
