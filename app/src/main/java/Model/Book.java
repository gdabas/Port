package Model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

/**
 * Created by Dabas on 2015-08-14.
 */
@JsonObject
public class Book {

    @JsonField
    String title;

    @JsonField
    String publisher;

    @JsonField
    String publishedDate;

    @JsonField
    String description;

    @JsonField
    String pageCount;

    @JsonField
    String averageRating;

    @JsonField
    String ratingsCount;

    @JsonField
    String language;


}
