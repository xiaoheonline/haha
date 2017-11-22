import net.sf.json.JSONArray;

public class Entity {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId(26);
        entity.setName("张三");
        System.out.println(entity.getId());
        System.out.println(entity.getName());
        JSONArray jsonArray = JSONArray.fromObject(entity);
        System.out.println(jsonArray);
    }
}
