package npc.martin.little.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author bikathi_martin
 */

@Entity
@Table(name = "link_pair")
public class LinkPair implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "original_url")
    private String originalUrl;
    
    @Column(name = "shor_url")
    private String shortUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public LinkPair(Long id, String originalUrl, String shortUrl) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
    }
    
    public LinkPair() {}

    @Override
    public String toString() {
        return "LinkPair{" + "id=" + id + ", originalUrl=" + originalUrl + ", shortUrl=" + shortUrl + '}';
    }
}
