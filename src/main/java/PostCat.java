
import com.fasterxml.jackson.annotation.JsonProperty;

/*Формат записи
{
  "id": "5b4910ae0508220014ccfe91",
  "text": "Кошки могуть создавать более 100 разных звуков, тогда как собаки только около 10.",
  "type": "cat",
  "user": "Alex Petrov",
  "upvotes": null
},
 */

public class PostCat {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;


    public PostCat(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes

    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;

    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "PostCat" +
                "\n Id=" + id +
                "\n text=" + text +
                "\n type=" + type +
                "\n user=" + user +
                "\n upvotes=" + upvotes;
    }
}
/*
[
        {
        "userId":1,
        "id":1,
        "title":"sunt aut facere",
        "body":"quia et suscipit..."
        },
        {
        "userId":1,
        "id":2,
        "title":"qui est esse",
        "body":"est rerum tempore vitae\nsequi sint ni..."
        },
        {
        "userId":1,
        "id":3,
        "title":"ea molestias quasi exercitationem repellat",
        "body":"et iusto sed quo iure\nvoluptatem..."
        }
        ...
        {
        "userId":10,
        "id":100,
        "title":"at nam consequatur ea labore ea harum",
        "body":"cupiditate quo est a modi nesciunt..."
        }

        }
        ]
 */

