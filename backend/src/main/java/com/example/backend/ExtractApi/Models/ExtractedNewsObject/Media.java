
package com.example.backend.ExtractApi.Models.ExtractedNewsObject;

import com.google.appengine.repackaged.org.codehaus.jackson.annotate.JsonAutoDetect;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Media {
    String url;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
