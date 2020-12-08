package Map;

public class Map
{
    private String nameMap;
    private TypeMap typeMap;

    public Map(String nameMap, TypeMap typeMap)
    {
        this.nameMap = nameMap;
        this.typeMap = typeMap;
    }

    public String GetNameMap()
    {
        return this.nameMap;
    }

    public String GetTypeMap()
    {
        return this.nameMap;
    }

    public enum TypeMap
    {
        Outside,
        Inside
    }
}
