package com.example.demo_spring_2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileResource {
    @Column(name = "file_name",columnDefinition = "LONGBLOB")
    private Blob fileName;
    @Column(name="hash",columnDefinition = "LONGBLOB")
    private Blob hash;
    @Column(name ="directory",columnDefinition = "LONGBLOB")
    private Blob directory;
    @Column(name="resource_url",columnDefinition = "LONGBLOB")
    private Blob resourceUrl;
}
